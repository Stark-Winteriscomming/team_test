<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:include page="../00_header.jsp"></jsp:include>
<jsp:include page="../10_nav.jsp"></jsp:include>

<h2>상품상세정보</h2>
<form action="/product/modify" method="post" enctype="multipart/form-data">
<table class="table table-bordered ">
	<thead>
		<tr>
			<th>등록번호</th>
			<td><input type="text" name="pno" value="${pvo.pno }" readOnly/></td>
		</tr>
		<tr>
			<th>상품명</th>
			<td><input type="text" name="title" value="${pvo.title}" /></td>
		</tr>
		<tr>
			<th>등록자</th>
			<td><input type="text" name="writer" value="${pvo.writer }}" readonly="readonly" /></td>
		</tr>
		<tr>
			<th>최종수정날짜</th>
			<td>${pvo.modd8 }</td>
		</tr>
		<tr>
			<th>상품설명</th>
			<td><textarea name="content" value="${pvo.content }"></textarea></td>
		</tr>
		<tr>
			<th>이미지</th>
				<img src="/images/${pvo.imgfile }" width="50%" />
			<td><input type="text" name="imgfile" value="${pvo.imgfile }" readonly></td>
		</tr>
		<tr>
			<th>이미지 수정</th>
			<td><input type="file" name="newImgfile" ></td>
		</tr>
		<tr>
			<td colspan="2" class="form-control">
				<button type="submit" class="btn btn-primary">수정</button>
			</td>
		</tr>
	</thead>
</table>
</form>

<script>
	$(function(){
		$(document).on("click", "img", function(){
			let pno = '<c:out value="${pvo.pno}" />'; 
			let imgfile = '<c:out value="${pvo.imgfile}" />';
			if(confirm("삭제?")){
				$.ajax({
					url : "/product/rmimg", 
					type : "post", 
					data : {
						pno : pno, 
						imgfile : imgfile
					}
				}).done(function(){
					
				}).fail(function(){
				}).always(function(){
					location.replace("/product/detail?pno=" + pno)
				})				
			}
		})
	})
</script>

<jsp:include page="../90_footer.jsp"></jsp:include>
