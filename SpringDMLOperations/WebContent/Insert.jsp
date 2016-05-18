<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="insertBook">	
<table style="width:25%" >
<tr><td><h2>Insert Book</h2></td></tr>
<tr>
<td> <font style="font-weight: bold;">Book Id : </font> </td>  <td><input type="text" name="bookid"></td>
 </tr>
 
 <tr>
 <td> <font style="font-weight: bold;">Book Name : </td>  <td><input type="text" name="bookname"></td>
 </tr>
 
 <tr>
 <td> <font style="font-weight: bold;">Book Author : </td>  <td><input type="text" name="bookauthor"></td>
</tr>

<tr>
<td></td>

<td >
 <input type="submit" value="Add Book"></td> 
  </tr>
</table>
</form>  
</body>
</html>