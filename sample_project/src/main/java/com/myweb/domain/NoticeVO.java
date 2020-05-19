package com.myweb.domain;

import java.util.Date;

public class NoticeVO {
	int nno; 
	String title; 
	String writer;
	String content;
	Date regd8; 
	Date modd8; 
	int readcount; 
	String imgfile; 
	
	public NoticeVO() {}
	
	
	// insert cons
	public NoticeVO(String title, String writer, String content, String imgfile) {
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.imgfile = imgfile;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getNno() {
		return nno;
	}

	public void setNno(int nno) {
		this.nno = nno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getRegd8() {
		return regd8;
	}

	public void setRegd8(Date regd8) {
		this.regd8 = regd8;
	}

	public Date getModd8() {
		return modd8;
	}

	public void setModd8(Date modd8) {
		this.modd8 = modd8;
	}

	public int getReadcount() {
		return readcount;
	}

	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}

	public String getImgfile() {
		return imgfile;
	}

	public void setImgfile(String imgfile) {
		this.imgfile = imgfile;
	}
	
}
