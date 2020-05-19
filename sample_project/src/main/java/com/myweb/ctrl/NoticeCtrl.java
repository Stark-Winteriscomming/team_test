package com.myweb.ctrl;
import java.io.IOException;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.myweb.domain.Criteria;
import com.myweb.domain.PagingVO;
import com.myweb.service.NoticeService;
import com.myweb.util.NoticeFileProcess;

//restctl로 하고 싶었으나..
@Controller
@RequestMapping("/notice/*")
public class NoticeCtrl {
	private static Logger log = LoggerFactory.getLogger(NoticeCtrl.class);
	
	@Inject
	private NoticeService nsv; 
	
	@Inject
	private NoticeFileProcess ps;
	
	// 이부분은 static 자원으로 빼는게?
	@GetMapping("/w")
	public ModelAndView write() {
		return new ModelAndView("/notice/write"); 
	} 
	
	@PostMapping("/w")
	public void write(MultipartHttpServletRequest req) throws IllegalStateException, IOException {
		nsv.write(ps.fileSave(req)); 
	}
	
	@GetMapping("/{pageNum}/{amount}")
	public ModelAndView list(@PathVariable("pageNum")int pageNum, @PathVariable("amount")int amount) {
		ModelAndView mv = new ModelAndView("/notice/list");
		//map을 활용하면?
		Criteria cri = new Criteria(pageNum, amount);
		mv.addObject("list", nsv.list(cri)); 
		mv.addObject("pgvo", new PagingVO(nsv.totalCount(), cri));
		return mv; 
	}
}
