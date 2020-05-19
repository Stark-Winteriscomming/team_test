package com.myweb.ctrl;
import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myweb.domain.ArticleVO;
import com.myweb.service.ArticleService;

@Controller
@RequestMapping("/article/*")

public class ArticleController {
	private static Logger log = LoggerFactory.getLogger(ArticleController.class);
	
	@Inject
	private ArticleService service; 
	
	@GetMapping("/write")
	public void write() {}
	
	@PostMapping("write")
	public String write(ArticleVO vo) {
		log.info(vo.toString());
		
		System.out.println(("result: " + service.write(vo)));
		return "redirect:/article/list"; 
	}
}
