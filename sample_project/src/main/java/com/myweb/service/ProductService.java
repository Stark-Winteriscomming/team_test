/**
 * 
 */
package com.myweb.service;

import java.util.List;

import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.myweb.domain.Criteria;
import com.myweb.domain.ProductVO;

/**
 * @author ezen
 *
 */
public interface ProductService {
	public void write(ProductVO pvo);
	public List<ProductVO> list(Criteria cri);
	public ProductVO detail(Integer pno); 
	public void modify(ProductVO pvo); 
	public void remove(Integer pno);
	public void removeImg(int pno);
	public int totalCount();
}
