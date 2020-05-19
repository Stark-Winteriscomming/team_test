package com.myweb.util;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.myweb.domain.NoticeVO;
import com.myweb.domain.ProductVO;

@Component
public class NoticeFileProcess {
	private static Logger log = LoggerFactory.getLogger(NoticeFileProcess.class);
	
	@Resource(name = "upImages")
	String upImages;

	public NoticeVO fileSave(MultipartHttpServletRequest req) throws IllegalStateException, IOException {

		String title = req.getParameter("title");
		String content = req.getParameter("content");
		String writer = req.getParameter("writer");
		MultipartFile imgfile = req.getFile("imgfile");
		
		NoticeVO vo = new NoticeVO(title, writer, content, null); 

		if (imgfile == null)
			vo.setImgfile("none");
		else {
			String orgFileName = imgfile.getOriginalFilename();
			String saveFileName = UUID.randomUUID().toString() + "_" + orgFileName;

			File file = new File(upImages + saveFileName);
			imgfile.transferTo(file);
			vo.setImgfile(saveFileName);
		}
		return vo;
	}
}
