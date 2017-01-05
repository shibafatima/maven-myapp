<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.psl.main.InventoryDAO"%>
<%@ page import="com.psl.main.InventoryBean"%>
<%@page import="java.util.ArrayList"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link rel="stylesheet" href="css/style.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inventory Details</title>
<script>
	function init() {
		document.getElementById("block1").style.display = "none";
		document.getElementById("block2").style.display = "none";

		return false;
	}

	function disp1() {

		document.getElementById("block1").style.display = "";
		document.getElementById("block2").style.display = "none";
	}

	function disp2() {
		document.getElementById("block1").style.display = "none";
		document.getElementById("block2").style.display = "";

	}
</script>


</head>

<body onLoad=" return init();">
	<%
		//InventoryDAO  IB = new InventoryDAO(); //not recommended.Pass this object from servlet

		ArrayList list1 = InventoryDAO.DispList1();
		ArrayList list2 = InventoryDAO.DispList2();
	%>




	<div class="login" >
		<form>

			<h1>CAR INVENTORY</h1>
			<table style="width: 300px" border="1">
			 <tbody>
				<tr>
					<td ><p class="button"><input type="button" id="idlist1"
						value="Price<10000 USD" onclick="disp1()" /></p></td>
					<td class="submit"><input type="button" id="idlist2"
 						value="Price>10000 USD" onclick="disp2()" /></td>
					<td></td>
				</tr>
			 </tbody>
			</table>

			<div id="block1">
				<table style="width: 300px" border="1">
				 <tbody>
					<tr>
						<th><h2>Manufacturer</h2></th>
						<th><h4>Car Name</h4></th>
						<th><h4>Colors available</h4></th>
						<th><h4>Price(INR)</h4></th>
					</tr>
					<%
						for (int i = 0; i < list1.size(); i++) {
							InventoryBean bean = (InventoryBean) list1.get(i);
					%>
					<tr>
						<td>
							<%
								out.println(bean.getManufacturer());
							%>
						</td>
						<td>
							<%
								out.println(bean.getCarName());
							%>
						</td>
						<td>
							<%
								out.println(bean.getColorsAvailable());
							%>
						</td>
						<td>
							<%
								out.println(bean.getPrice());
							%>
						</td>
					</tr>

					<%
						}
					%>
				 </tbody>
				</table>
			</div>

			<div id="block2">
				<table style="width: 300px" border="1">
				  <tbody>
					<tr>
						<th><h2>Manufacturer</h2></th>
						<th><h4>Car Name</h4></th>
						<th><h4>Colors available</h4></th>
						<th><h4>Price(USD)</h4></th>
					</tr>
					<%
						for (int i = 0; i < list2.size(); i++) {
							InventoryBean bean = (InventoryBean) list2.get(i);
					%>
					<tr>
						<td>
							<%
								out.println(bean.getManufacturer());
							%>
						</td>
						<td>
							<%
								out.println(bean.getCarName());
							%>
						</td>
						<td>
							<%
								out.println(bean.getColorsAvailable());
							%>
						</td>
						<td>
							<%
								out.println(bean.getPrice());
							%>
						</td>
					</tr>

					<%
						}
					%>
				   </tbody>
				</table>
			</div>

		</form>
	</div>
	
	<form name="backForm" action="LoginPage.jsp" method ="Post"> 
<p align="center" class="submit">
<input type="submit" name="Back" value="Back to Login"></p>  
</form>
</body>
</html>