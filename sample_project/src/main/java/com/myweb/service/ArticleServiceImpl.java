package com.myweb.service;
import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.myweb.domain.ArticleVO;
import com.myweb.persistence.ArticleDao;

@Service
public class ArticleServiceImpl implements ArticleService{
	private static Logger log = LoggerFactory.getLogger(ArticleServiceImpl.class);
	
	@Inject
	private ArticleDao dao; 
	
	@Override
	public int write(ArticleVO vo) {
		// TODO Auto-generated method stub
		
		//service logic...
		return dao.insert(vo);
		
	}

}
