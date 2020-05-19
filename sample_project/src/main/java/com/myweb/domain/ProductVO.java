/**
 * 
 */
package com.myweb.domain;
import java.sql.Date;
/**
 * @author ezen
 *
 */
public class ProductVO {
	private int pno;  
	private String title;  
	private String content;  
	private String writer;  
	private Date regd8;  
	private Date modd8;   
	private int readcount;   
	private String imgfile;
	
	
	/**
	 * 
	 */
	public ProductVO() {
	}
	public ProductVO(String title, String writer, String content) {
		this.title = title; 
		this.writer = writer; 
		this.content = content; 
	}
	public ProductVO(int pno, String title, String content) {
		// TODO Auto-generated constructor stub
		this.pno = pno; 
		this.title = title; 
		this.content = content; 
	}
	/**
	 * @return the pno
	 */
	public int getPno() {
		return pno;
	}
	/**
	 * @param pno the pno to set
	 */
	public void setPno(int pno) {
		this.pno = pno;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return the writer
	 */
	public String getWriter() {
		return writer;
	}
	/**
	 * @param writer the writer to set
	 */
	public void setWriter(String writer) {
		this.writer = writer;
	}
	/**
	 * @return the regd8
	 */
	public Date getRegd8() {
		return regd8;
	}
	/**
	 * @param regd8 the regd8 to set
	 */
	public void setRegd8(Date regd8) {
		this.regd8 = regd8;
	}
	/**
	 * @return the modd8
	 */
	public Date getModd8() {
		return modd8;
	}
	/**
	 * @param modd8 the modd8 to set
	 */
	public void setModd8(Date modd8) {
		this.modd8 = modd8;
	}
	/**
	 * @return the readcount
	 */
	public int getReadcount() {
		return readcount;
	}
	/**
	 * @param readcount the readcount to set
	 */
	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}
	/**
	 * @return the imgfile
	 */
	public String getImgfile() {
		return imgfile;
	}
	/**
	 * @param imgfile the imgfile to set
	 */
	public void setImgfile(String imgfile) {
		this.imgfile = imgfile;
	}
	
	
	
}
