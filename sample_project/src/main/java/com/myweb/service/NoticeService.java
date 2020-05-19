package com.myweb.service;

import java.util.List;

import org.springframework.web.multipart.MultipartRequest;

import com.myweb.domain.Criteria;
import com.myweb.domain.NoticeVO;
import com.myweb.domain.ProductVO;

public interface NoticeService {
	public int write(NoticeVO nvo);
	public List<NoticeVO> list(Criteria cri);
	public NoticeVO detail(Integer nno); 
	public int modify(NoticeVO nvo); 
	public int remove(Integer nno);
	public int removeImg(int nno);
	public int totalCount();
}
