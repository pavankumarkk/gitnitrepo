<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<c:choose>
 <c:when test="${!empty listprod}">
   <table border="1"  bgcolor="orange">
     <tr><th>Prod_id</th><th>prod_name</th><th>prod_price</th><th>prod_qty</th><th>prod_mfg</th><th>prod_exp</th></tr>
     <c:forEach var="dto" items="${listprod}">
    
       <tr>
        <td>${dto.prodid}</td>
        <td>${dto.prodname}</td>
        <td>${dto.prodprice}</td>
        <td>${dto.prodqty}</td>
        <td>${dto.prodmfg}</td>
        <td>${dto.prodexp}</td>
       </tr>
     </c:forEach>

   </table>
 </c:when>
 <c:otherwise>
    <b>Records not found</b>
 </c:otherwise>
</c:choose>
<br>
<a href="welcome.htm">home</a>
