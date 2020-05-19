package com.myweb.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.myweb.domain.ArticleVO;

@Repository
public class ArticleDaoImpl implements ArticleDao{
	private final String namespace = "ArticleMapper.";  
	
	@Inject
	SqlSession session; 
	
	@Override
	public int insert(ArticleVO vo) {
		// TODO Auto-generated method stub
		return session.insert(namespace + "add", vo);
	}
	
}
