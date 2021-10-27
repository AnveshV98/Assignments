<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>jstl tags</title>
</head>
<body>
<c:out value="${'Welcome Anvesh'}"/>  
<c:set var="income" scope="session" value="${4000*4}" /><br>
<p>before removing: <c:out value="${income}"/></p>
<c:remove var="income"/>
<p>After removing: <c:out value="${income}"/></p>
<p><h2>catch tag:</h2></h2></p>
<c:catch var="catchtheException">
<% int a=2/0;  %>

</c:catch>

<c:if test="${catchtheException!=null}">

<p>The type of exception is : ${catchtheException} <br />  
   There is an exception: ${catchtheException.message}</p>

</c:if>

<p><h2>c:if tag</h2></p>


<c:set var="income" scope="session" value="${5000*2}"/>
<c:if test="${income>5000}">

 <p>My income is: <c:out value="${income}"/><p> 

</c:if>
<p><h2>choose when otherwise</h2></p>

<c:set var="income" scope="session" value="${5000*4}"/>  
<p>Your income is : <c:out value="${income}"/></p>  
<c:choose>  
    <c:when test="${income <= 1000}">  
       Income is not good.  
    </c:when>  
    <c:when test="${income > 10000}">  
        Income is very good.  
    </c:when>  
    <c:otherwise>  
       Income is undetermined...  
    </c:otherwise>  
</c:choose> 
<p><h2>forEach</h2></p>
<c:forEach var="i" begin="1" end="3">  
   Anvesh <c:out value="${i}"/><p>  
</c:forEach>

<p><h2>ctokens</h2></p>
<c:forTokens items="Anvesh RaviDharmeshsh" delims=" " var="name">  
   <c:out value="${name}"/><p>  
</c:forTokens>
<p><h2>params</h2></p>

<c:url value="/tags.jsp" var="completeURL">  
 <c:param name="trackingId" value="789"/>  
 <c:param name="user" value="Anvesh"/>  
 </c:url>  
  ${completeURL} 
  
 
  
  <p><h2>redirects</h2></p>
  
  <p><h2>url</h2></p>
  <c:url value="/Register.jsp"/>  
   <p><h1>Function Tags</h1></p>
     <p><h2>contains</h2></p>
   <c:set var="String" value="Welcome to MyPageAnvesh"/>  
  
<c:if test="${fn:contains(String, 'Anvesh')}">  
   <p>Found Anvesh string<p>  
</c:if>  
  
<c:if test="${fn:contains(String, 'MyPage')}">  
   <p>Found MyPage string<p>  
</c:if>  
    <p><h2>containsIgnoreCase</h2></p>
    
    
    <c:if test="${fn:containsIgnoreCase(String, 'anvesh')}">  
   <p>Found anvesh string<p>  
</c:if>  
  
<c:if test="${fn:containsIgnoreCase(String, 'mypage')}">  
   <p>Found mypage string<p>  
</c:if>  
    
    <p><h2>endsWith()</h2></p>
    <c:set var="String" value="Welcome to my page"/>  
  
<c:if test="${fn:endsWith(String, 'page')}">  
   <p>String ends with page<p>  
</c:if>  
  <p><h2>startsWith()</h2></p>
<c:if test="${fn:startsWith(String, 'Welcome')}">  
   <p>String starts with welcome<p>  
</c:if>  
    
   <p><h2>escapeXML()</h2></p> 
<c:set var="string1" value="It is first String."/>  
<c:set var="string2" value="It is <xyz>second String.</xyz>"/>  
  
<p>With escapeXml() Function:</p>  
<p>string-1 : ${fn:escapeXml(string1)}</p>  
<p>string-2 : ${fn:escapeXml(string2)}</p>  

<p>Without escapeXml() Function:</p>  
<p>string-1 : ${string1}</p>  
<p>string-2 : ${string2}</p>  
    
 <p><h2>indexOf Function:</h2></p>   
 
 <c:set var="string1" value="my name is Anvesh."/>  
 <p>Index-1 : ${fn:indexOf(string1, "Anvesh")}</p>  
 
 
  <p><h2>trim()</h2></p> 
 <c:set var="str1" value="My Name is        JSP         "/>  
 <c:out value="${fn:trim(str1)}"/>

 <p><h2>split()</h2></p>
 
   
<c:set var="str1" value="my-name-is-Anvesh."/>  
<c:set var="str2" value="${fn:split(str1, '-')}" />  
<c:set var="str3" value="${fn:join(str2, ' ')}" />  
  
<p>String-3 : ${str3}</p>  
<c:set var="str4" value="${fn:split(str3, ' ')}" />  
<c:set var="str5" value="${fn:join(str4, '-')}" />  
  
<p>String-5 : ${str5}</p> 

<p><h2>toLowerCase():</h2></p>  
<c:set var="Name" value="ANVESH"/>  
<c:out value="${fn:toLowerCase(Name)}"/> 

<p><h2>toUpperCase():</h2></p>  
<c:set var="Name" value="anvesh"/>  
<c:out value="${fn:toUpperCase(Name)}"/> 

<p><h2>subString():</h2></p>

<c:set var="String1" value="I'm Anvesh from Yash"/>  
<c:out value="${fn:substring(String1,11,20)}"/> 

<p>Apart from substring() we also have substringAfter() & substringBefore()  </p>

<p><h2>length():</h2></p>
<c:set var="str1" value="Hello"/>  
Length of the String-1 is: ${fn:length(str1)}<br>  


<p><h2>replace():</h2></p>
<c:set var="author" value="Ramesh Kumar"/>  

${fn:replace(author, "Ramesh", "Ravi")}  

</body>
</html>