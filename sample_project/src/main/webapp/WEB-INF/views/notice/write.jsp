<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:include page="../00_header.jsp"></jsp:include>
<jsp:include page="../10_nav.jsp"></jsp:include>

<h2>공지사항 등록</h2>
<form action="/notice/w"  method="post" enctype="multipart/form-data">
	<div class="form-group">
		<label>title :</label> 
		<input type="text"class="form-control" placeholder="상품명" id="title" name="title">
	</div>
	<div class="form-group">
		<label>writer :</label> 
		<input type="text" class="form-control" name="writer">
	</div>
	<div class="form-group">
		<label>content :</label> 
		<input type="text" class="form-control" name="content">
	</div>
	
	<div class="form-group">
		<label>file :</label> 
		<input type="file" class="form-control" id="imgfile" name="imgfile">
	</div>
	<button type="submit" class="btn btn-primary">Submit</button>
</form>

<jsp:include page="../90_footer.jsp"></jsp:include>
