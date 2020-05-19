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

import com.myweb.domain.ProductVO;

@Component
public class FileProcess {
	private static final Logger log = LoggerFactory.getLogger(FileProcess.class);

	@Resource(name = "upImages")
	String upImages;

	public ProductVO fileSave(MultipartHttpServletRequest req) throws IllegalStateException, IOException {

		String title = req.getParameter("title");
		String content = req.getParameter("content");
		String writer = req.getParameter("writer");
		MultipartFile imgfile = req.getFile("imgfile");
		
		ProductVO pvo = new ProductVO(title, writer, content);

		if (imgfile == null)
			pvo.setImgfile("none");
		else {
			String orgFileName = imgfile.getOriginalFilename();
			String saveFileName = UUID.randomUUID().toString() + "_" + orgFileName;

			File file = new File(upImages + saveFileName);
			imgfile.transferTo(file);
			pvo.setImgfile(saveFileName);
		}

		return pvo;
	}

	public ProductVO fileModify(MultipartHttpServletRequest req) throws IllegalStateException, IOException {
		int pno = Integer.parseInt(req.getParameter("pno"));
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		String imgfile = req.getParameter("imgfile");

		MultipartFile new_file = req.getFile("newImgfile");

		ProductVO pvo = new ProductVO(pno, title, content); // 생성자 생성

		if (new_file == null) {
			pvo.setImgfile(imgfile);
		} else {
			String orgFileName = new_file.getOriginalFilename();
			String saveFileName = UUID.randomUUID().toString() + "_" + orgFileName;

			File file = new File(upImages + saveFileName);
			new_file.transferTo(file);
			pvo.setImgfile(saveFileName);

			// 기존 지우기
			fileRemove(imgfile); 

			// update tbl_product set
			// title = #{title},
			// content = #{content},
			// modd8 = sysdate,
			// imgfile = #{imgfile}
		}
		return pvo;
	}

	public void fileRemove(String imgfile) {
		// 기존 지우기
		new File(upImages + imgfile).delete();
	}
}
