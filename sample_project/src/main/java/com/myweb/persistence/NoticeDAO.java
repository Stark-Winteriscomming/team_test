package com.myweb.persistence;
import java.util.List;

import com.myweb.domain.Criteria;
import com.myweb.domain.NoticeVO;
public interface NoticeDAO {
	public int insert(NoticeVO nvo);
	public List<NoticeVO> selectList(Criteria cri);
	public NoticeVO selectOne(Integer nno); 
	public int update(NoticeVO nvo); 
	public int delete(Integer nno);
	public int deleteImg(int nno);
	public int selectOne();
}
