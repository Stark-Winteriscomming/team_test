package com.myweb.domain;

import java.util.Date;

public class ArticleVO {
	private int ano; 
	private String title; 
	private String author; 
	private int readcount; 
	private Date regd8; 
	private Date modd8; 
	private String imgfile;
	
	@Override
	public String toString() {
		return "ArticleVO [ano=" + ano + ", title=" + title + ", author=" + author + ", readcount=" + readcount
				+ ", regd8=" + regd8 + ", modd8=" + modd8 + ", imgfile=" + imgfile + "]";
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getReadcount() {
		return readcount;
	}
	public void setReadcount(int readcount) {
		this.readcount = readcount;
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
	public String getImgfile() {
		return imgfile;
	}
	public void setImgfile(String imgfile) {
		this.imgfile = imgfile;
	} 
}