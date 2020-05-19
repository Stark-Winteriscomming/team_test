package com.myweb.ctrl;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.myweb.domain.NoticeVO;
import com.myweb.service.NoticeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ="file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class NoticeDummyInsert {
	@Inject
	private NoticeService sv; 
	
	@Test
	public void insert() {
		for (int i = 1; i <256 ; i++) {
			NoticeVO vo = new NoticeVO(i + "th title", i + "th writer", i + "th content", "none"); 
			sv.write(vo); 
		}
	}
}
