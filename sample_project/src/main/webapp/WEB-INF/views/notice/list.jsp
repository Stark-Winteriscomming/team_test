<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:include page="../00_header.jsp"></jsp:include>
<jsp:include page="../10_nav.jsp"></jsp:include>
<p class="align-right">
	<a href="/product/write" class="btn btn-outline-primary">상품등록</a>
</p>
<h2>상품목록</h2>
<table class="table table-bordered table-hover">
	<thead>
		<tr>
			<th>등록번호</th>
			<th>상품명</th>
			<th>등록자</th>
			<th>조회수</th>
			<th>등록날짜</th>
		</tr>
	</thead>
	<tbody>
		<c:choose>
			<c:when test="${list ne null && list.size() ne 0}">
				<c:forEach var="nvo" items="${list }">
					<tr>
						<td>${nvo.nno }</td>
						<td><a href="/product/detail?pno=${nvo.nno}">${nvo.title }</a></td>
						<td>${nvo.writer }</td>
						<td>${nvo.content }</td>
						<td>${nvo.readcount }</td>
						<td>${nvo.modd8 }</td>
					</tr>
				</c:forEach>
			</c:when>
			<c:otherwise>
				<tr><td colspan="5"><h3>등록된 공지사항 없음. </h3></tr>
			</c:otherwise>
		</c:choose>
	</tbody>
</table>

<!-- paging box --> 
<div class="container">
  <ul class="pagination">
  <c:if test="${pgvo.prev }">
    <li class="page-item"><a class="page-link" href="/notice/${pgvo.startPage - 1 }/${pgvo.cri.amount}">Previous</a></li>
  </c:if>
  <c:forEach var="i" begin="${pgvo.startPage }" end="${pgvo.endPage }">  
    <li class="page-item  ${pgvo.cri.pageNum == i ? 'active' : ''}"><a class="page-link" href="/notice/${i}/${pgvo.cri.amount}">${i }</a></li>
  </c:forEach>
  <c:if test="${pgvo.next }">  
    <li class="page-item"><a class="page-link" href="/notice/${pgvo.endPage + 1 }/{pgvo.cri.amount}">Next</a></li>
  </c:if>
  </ul>
  
</div>
<!--  -->
<script>
	let result = '<c:out value="${result}" />';
	if (result == 'write_ok') {
		alert("상품등록 완료");
	} else if(result == 'remove_ok'){
		alert("상품삭제 완료");
	}
	result = "";
</script>
<jsp:include page="../90_footer.jsp"></jsp:include>
