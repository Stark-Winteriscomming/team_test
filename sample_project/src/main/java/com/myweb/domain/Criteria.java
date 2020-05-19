package com.myweb.domain;
import org.slf4j.Logger; 
import org.slf4j.LoggerFactory;

public class Criteria {
	private static final Logger log = LoggerFactory.getLogger(Criteria.class);
	private int pageNum; 
	private int amount;
	/**
	 * 
	 */
	public Criteria() {
		this(1, 10);
	}
	/**
	 * @param pageNum
	 * @param amount
	 */
	public Criteria(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
	}
	/**
	 * @return the pageNum
	 */
	public int getPageNum() {
		return pageNum;
	}
	/**
	 * @param pageNum the pageNum to set
	 */
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	/**
	 * @return the amount
	 */
	public int getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}
}
