<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>숙박 예약</title>
<link rel="stylesheet" href="/resources/css/main.css?aqqzsdfsdff">
<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>
</head>
<body>

<div class="wrapper">
   <div class="wrap">
      <div class="top_gnb_area">
         <ul class="list">
         	<c:if test = "${member == null}">
         <li>
         	<a href="/member/login">로그인</a>
         </li>
         <li>
         	<a href="/member/join">회원가입</a>
         </li>
         </c:if>
         <c:if test="${member != null }">   
         	 <c:if test="${member.adminCk == 1 }">
                    <li><a href="/admin/main">관리자 페이지</a></li>
                    </c:if>                
          	 <li><a id="gnb_logout_button">로그아웃</a></li>
          	 <li><a href="/cart/${member.memberId}">장바구니</a></li>
          </c:if>
         <li>고객센터</li>
         </ul>
      </div>
      <div class="top_area">
         <div class="logo_area">
            <a href="/main"><img src="/resources/img/Logo.png"></a>
         </div>
         <div class="search_area">
            <div class="search_wrap">
                		<form id="searchForm" action="/search" method="get">
                			<div class="search_input">
                				<select name="type">
                					<option value="T">숙소</option>
                					<option value="A">임대인</option>
                				</select>
                				<input type="text" name="keyword">
                    			<button class='btn search_btn'>검 색</button>                				
                			</div>
                		</form>
                	</div>
         </div>
         <div class="login_area">
            <!--  로그인 안한 상태 -->
            <c:if test = "${member == null }">
                    <div class="login_button"><a href="/member/login">로그인</a></div>
                    <span><a href="/member/join">회원가입</a></span>                
                </c:if>
                
                <!-- 로그인한 상태 -->
                <c:if test="${ member != null }">
                  <div class="login_success_area">
                        <span>회원 : ${member.memberName}</span>
                        <a href="/member/logout.do">로그아웃</a>
                    </div>
                </c:if>
         </div>
         <div class="clearfix"></div>         
      </div>
      <div class="navi_bar_area">
			<div class="navi_bar_area">
			<div class="dropdown">
			    <button class="dropbtn">카라반 
			      <i class="fa fa-caret-down"></i>
			    </button>
			    <div class="dropdown-content">
			    	<c:forEach items="${cate1}" var="cate"> 
		    		<a href="search?type=C&cateCode=${cate.cateCode}">${cate.cateName}</a>
		    	</c:forEach>      		      		      
			    </div>			
			</div>
			<div class="dropdown">
			    <button class="dropbtn">캠핑장 
			      <i class="fa fa-caret-down"></i>
			    </button>
			    <div class="dropdown-content">
			    	<c:forEach items="${cate2}" var="cate"> 
		    		<a href="search?type=C&cateCode=${cate.cateCode}">${cate.cateName}</a>
		    	</c:forEach>	      		      		      
			    </div>			
			</div>
		</div>
		</div>      </div>
      <div class="content_area">
         <img src="resources/img/aaa.png">
      </div>
      <!-- Footer 영역 -->
        <div class="footer">
            <div class="footer_container" >
                
                <div class="footer_right" style="clear:both; border-top:1px solid #ccc;"><br>
                    <h1>010 - 7303 - 9737</h1>
                    <br>
                    <h2>주소 : 대전광역시 서구 / 계좌번호 : [김대중]945802 - 00 - 000000(김대중)</h2>
                    <br>
                    <h2>대표자 : 김대중 / 업체명 : 부트캠프</h2>
                    <br>
                    <br>
                    COPYRIGHT(C) <strong>BootCamp</strong>    ALL RIGHTS RESERVED 관리자
                </div>
                <div class="clearfix"></div>
            </div>
        </div> <!-- class="footer" -->  
   </div>

<script>
	/* 상단 로그아웃 버튼 작용 */
	$("#gnb_logout_button").click(function(){
		$.ajax({
			type:"POST",
			url:"/member/logout.do",
			success:function(data){
				/*alert("로그아웃 성공");*/
				document.location.reload();
			}
		});
	});
</script>
</body>
</html>