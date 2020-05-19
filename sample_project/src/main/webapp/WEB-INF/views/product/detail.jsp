<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:include page="../00_header.jsp"></jsp:include>
<jsp:include page="../10_nav.jsp"></jsp:include>

<h2>상품상세정보</h2>
<table class="table table-bordered ">
	<thead>
		<tr>
			<th>등록번호</th>
			<td>${pvo.pno }</td>
		</tr>
		<tr>
			<th>상품명</th>
			<td>${pvo.title }</td>
		</tr>
		<tr>
			<th>등록자</th>
			<td>${pvo.writer }</td>
		</tr>
		<tr>
			<th>조회수</th>
			<td>${pvo.readcount }</td>
		</tr>
		<tr>
			<th>등록날짜</th>
			<td>${pvo.regd8 }</td>
		</tr>
		<tr>
			<th>최종수정날짜</th>
			<td>${pvo.modd8 }</td>
		</tr>

		<tr>
			<th>등록번호</th>
			<td>${pvo.pno }</td>
		</tr>
		<tr>
			<th>상품이미지</th>
			<c:set var="fi" value="${pvo.imgfile}" />
			<td>
			<c:choose>
				<c:when test="${!pvo.imgfile.equals('NONE')}">
					<img src="/images/${pvo.imgfile }" width="50%">
				</c:when>
				<c:otherwise>
					${pvo.imgfile }
				</c:otherwise>
			</c:choose>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<a href="/product/modify?pno=${pvo.pno }" class="btn btn-warning" >수정</a>
				<button type="button" id="rmBtn">삭제</button>
			</td>
		</tr>
	</thead>
</table>
<form action="/product/remove" method="post" id="rmForm">
	<input type="hidden" name="pno" value="${pvo.pno }" />
	<input type="hidden" name="imgfile" value="${pvo.imgfile}" />
</form>

<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script>


	/* $(function(){
		$("#rmBtn").click(function() {
			$("#rmForm").submit();
		})
	});  */
	
	$(document).on("click", "#rmBtn", function(){
		$("#rmForm").submit();
	})
</script>
<script>
	let result = '<c:out value="${result}" />';
	if (result == 'modify_ok') {
		alert("상품수정 완료");
	} else {

	}
	result = "";
</script>
<jsp:include page="../90_footer.jsp"></jsp:include>
