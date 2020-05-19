package com.myweb.ctrl;
import java.io.IOException;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.myweb.domain.Criteria;
import com.myweb.domain.PagingVO;
import com.myweb.domain.ProductVO;
import com.myweb.service.ProductService;
import com.myweb.util.FileProcess;

@Controller
@RequestMapping("/product/*")
public class ProductCtrl {
	private static final Logger log = LoggerFactory.getLogger(ProductCtrl.class);
	
	@Inject
	private ProductService psv; 
	
	@Inject
	private FileProcess fp; 
	
	@PostMapping("/rmimg")
	public void removeImg(@RequestParam("pno")int pno, @RequestParam("imgfile")String imgfile, RedirectAttributes reAttr) {
		fp.fileRemove(imgfile); 
		psv.removeImg(pno);
		reAttr.addFlashAttribute("result", "remove_img_ok");
		
		//밑의 코드는 return type을 string으로 바꾸고 하는 건데 ajax기술이라 일반 controller는 안된다. 
//		return "redirect:/product/detail?pno" + pno;
	}
	
	@PostMapping("/remove")
	public String remove(@RequestParam("pno")int pno, @RequestParam("imgfile")String imgfile, RedirectAttributes reAttr) {
		
		if(!imgfile.equals("NONE")) {
			fp.fileRemove(imgfile); 
		} 
		psv.remove(pno);
		reAttr.addFlashAttribute("result", "remove_ok");
		return "redirect:/product/list"; 
	}
	
	@PostMapping("/modify")
	public String modify(MultipartHttpServletRequest req, RedirectAttributes reAttr) throws IllegalStateException, IOException {
		reAttr.addFlashAttribute("result", "modify_ok");
		psv.modify(fp.fileModify(req));
		return "redirect:/product/detail?pno=" + req.getParameter("pno"); 
	}
	
	@GetMapping({"/detail", "modify"})
	public void detail(@RequestParam("pno")int pno, Model model) {
		log.info("상세페이지 출력");
		model.addAttribute("pvo", psv.detail(pno));
		
	}
	
	@GetMapping("/write") 
	public void write(Model model) {
		log.info(">>>>>>>>>>>>> write . get ");
	}
	
//	@RequestMapping(value = "/write", method = RequestMethod.POST)
	@PostMapping("/write")
	public String write(MultipartHttpServletRequest req, RedirectAttributes reAttr) throws IllegalStateException, IOException {
		log.info(">>>>>>>>>>>>> write . post ");
		psv.write(fp.fileSave(req)); 
		reAttr.addFlashAttribute("result", "write_ok"); 
		return "redirect:/product/list";
	}
	
	@GetMapping("/list")
	public void list(Model model, Criteria cri) {//Criteria를 이렇게 쓴다고? 
		log.info(">>>>>>>>>>>>> list . get ");
		model.addAttribute("list", psv.list(cri)); 
		int totalCnt = psv.totalCount(); 
		model.addAttribute("pgvo", new PagingVO(totalCnt, cri));
	}
	
}
