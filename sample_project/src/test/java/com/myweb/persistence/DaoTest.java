package com.myweb.persistence;
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

import com.myweb.domain.ArticleVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ="file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class DaoTest {
	private static Logger log = LoggerFactory.getLogger(DaoTest.class);

	@Inject
	private ArticleDao dao;
	
	ArticleVO vo; 
	
	@Before
	public void setUp() {
		vo = new ArticleVO();
		vo.setAuthor("ch");
		vo.setImgfile("none");
		vo.setTitle("hello");
	}
	
	@Test
	public void test() {
		log.info(vo.toString()); 
		assertThat(1, is(dao.insert(vo)));
	}
}
