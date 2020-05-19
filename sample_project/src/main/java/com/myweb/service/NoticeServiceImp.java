package com.myweb.service;
import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartRequest;

import com.myweb.domain.Criteria;
import com.myweb.domain.NoticeVO;
import com.myweb.persistence.NoticeDAO;

@Service
public class NoticeServiceImp implements NoticeService{
	private static Logger log = LoggerFactory.getLogger(NoticeServiceImp.class);

	@Inject
	private NoticeDAO dao; 
	
	@Override
	public int write(NoticeVO nvo) {
		// TODO Auto-generated method stub
		return dao.insert(nvo); 
	}
	
	@Override
	public List<NoticeVO> list(Criteria cri) {
		// TODO Auto-generated method stub
		return dao.selectList(cri);
	}

	@Override
	public NoticeVO detail(Integer nno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int modify(NoticeVO nvo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int remove(Integer nno) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int removeImg(int nno) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int totalCount() {
		// TODO Auto-generated method stub
		return dao.selectOne();
	}


	
}
