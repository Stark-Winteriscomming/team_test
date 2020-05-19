package com.myweb.domain;
import org.slf4j.Logger; 
import org.slf4j.LoggerFactory;

public class PagingVO {
	private static final Logger log = LoggerFactory.getLogger(PagingVO.class);
	private int totalCnt; 
	private Criteria cri; 
	private int startPage; // 10개의 페이징 중 1번, 11번 ... 
	private int endPage; // 10, 20 ...
	private boolean prev, next; //버튼의 존재유무
	
	public PagingVO() {}

	public PagingVO(int totalCnt, Criteria cri) {
		// TODO Auto-generated constructor stub
		this.totalCnt = totalCnt; 
		this.cri = cri; 
		
		this.endPage = (int)(Math.ceil(cri.getPageNum() / 10.0)) * 10;
		this.startPage = endPage - 9; 
		int realEndPage = (int)(Math.ceil((totalCnt * 1.0)/cri.getAmount()));
		
		if(realEndPage <= this.endPage) {
			this.endPage = realEndPage; 
		}
		
		this.prev = this.startPage > 1; 
		this.next = this.endPage < realEndPage; 
	}
	

	/**
	 * @return the totalCnt
	 */
	public int getTotalCnt() {
		return totalCnt;
	}

	/**
	 * @param totalCnt the totalCnt to set
	 */
	public void setTotalCnt(int totalCnt) {
		this.totalCnt = totalCnt;
	}

	/**
	 * @return the cri
	 */
	public Criteria getCri() {
		return cri;
	}

	/**
	 * @param cri the cri to set
	 */
	public void setCri(Criteria cri) {
		this.cri = cri;
	}

	/**
	 * @return the startPage
	 */
	public int getStartPage() {
		return startPage;
	}

	/**
	 * @param startPage the startPage to set
	 */
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	/**
	 * @return the endPage
	 */
	public int getEndPage() {
		return endPage;
	}

	/**
	 * @param endPage the endPage to set
	 */
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	/**
	 * @return the prev
	 */
	public boolean isPrev() {
		return prev;
	}

	/**
	 * @param prev the prev to set
	 */
	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	/**
	 * @return the next
	 */
	public boolean isNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(boolean next) {
		this.next = next;
	}

}
