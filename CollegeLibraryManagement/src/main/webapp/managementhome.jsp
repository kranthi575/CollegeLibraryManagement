<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Management Home</title>
</head>
<body>


<div>
<div style=" height: 10%;
  width: 50%;left:25%;
  position: fixed;background-color: #1101">
	<p align="center"><h2 align="center">Welcome to Management home page</h2></p>
</div>
<div style="height:80%;width:50%;down:40%;position:absolute;background-color:#DC143C">
<form action="./mangaddbook">
	<table>
		<tr>
			<th>Enter Book id:</th>
			<td><input type="text" name="bid"></td>
		</tr>
		<tr>
			<th>Enter Book Title:</th>
			<td><input type="text" name="btitle"></td>
		</tr>
		<tr>
			<th>Enter Book Author:</th>
			<td><input type="text" name="bauthor"></td>	
		</tr>
		<tr>
			<th>Enter Book Category:</th>
			<td><input type="text" name="bcategory"></td>
			
		</tr>
	
	</table>
	<button type="submit">Submit</button>
</form>
<h2>Search book</h2>
<form action="./searchBook">
	<table>
		<tr>
			<th>Select attribute to search:</th>
			<td><select name="attribute">
					<option value="bid">BookID</option>
					<option value="btitle">BookTitle</option>
					<option value="bauthor">BookAuthor</option>
					<option value="bcategory">BookCatgory</option>
				</select>
			</td>
			<td><input type="text" name="value" placeholder="enter here"></input></td>
		</tr>
	</table>
	<button type="submit">submit</button>

</form>

</div>
<div>

</div>

</div>
</body>
</html>