package com.myweb.ctrl;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.myweb.domain.NoticeVO;
import com.myweb.persistence.NoticeDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ="file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class NoticeSqlTest {
	private static Logger log = LoggerFactory.getLogger(NoticeSqlTest.class);
	
	@Inject
	private NoticeDAO dao;
	
	private NoticeVO vo; 
	
	
	@Before
	public void setUp() {
		vo = new NoticeVO("title", "writer", "content", "imgfile");
	}
	
	@Test
	public void insert() {
		assertThat(1, is(dao.insert(vo))); 
	}
	
}
