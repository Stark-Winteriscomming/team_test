package com.myweb.persistence;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.myweb.domain.Criteria;
import com.myweb.domain.NoticeVO;

@Repository
public class NoticeDAOImp implements NoticeDAO{
	private static Logger log = LoggerFactory.getLogger(NoticeDAOImp.class);
	// spring bean으로 관리되므로 static 굳이 사용?
	private final String ns = "NoticeMapper."; 
	
	@Inject
	private SqlSession session;

	@Override
	public int insert(NoticeVO nvo) {
		// TODO Auto-generated method stub
		return session.insert(ns + "write", nvo); 
	}

	@Override
	public List<NoticeVO> selectList(Criteria cri) {
		// TODO Auto-generated method stub
		return session.selectList(ns + "list", cri);
	}

	@Override
	public NoticeVO selectOne(Integer nno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(NoticeVO nvo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Integer nno) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteImg(int nno) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int selectOne() {
		// TODO Auto-generated method stub
		return session.selectOne(ns + "totalCnt");
	} 

}
