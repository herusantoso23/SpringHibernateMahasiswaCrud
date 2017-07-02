<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Mahasiswa Management</title>
	</head>
	<body>
		<h1>Data Mahasiswa</h1>
		<form:form action="mahasiswa.do" method="POST" commandName="mahasiswa">
			<table>
				<tr>
					<td>ID Mahasiswa</td>
					<td><form:input path="idMahasiswa"/></td>
				</tr>
				<tr>
					<td>Nama</td>
					<td><form:input path="nama"/></td>
				</tr>
				<tr>
					<td>Jurusan</td>
					<td><form:input path="jurusan"/></td>
				</tr>
				<tr>
					<td>Asal Kampus</td>
					<td><form:input path="asalKampus"/></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" name="action" value="Add"/>
						<input type="submit" name="action" value="Edit"/>
						<input type="submit" name="action" value="Delete"/>
						<input type="submit" name="action" value="Search"/>
					</td>
				</tr>
			</table>
		</form:form>
		<br>
		<table  border="1px">
			<th>Id </th>
			<th>Nama</th>
			<th>Jurusan</th>
			<th>Asal Kampus</th>
			<c:forEach items="${mahasiswaList}" var="mahasiswa">
				<tr>
					<td>${mahasiswa.idMahasiswa}</td>
					<td>${mahasiswa.nama}</td>
					<td>${mahasiswa.jurusan}</td>
					<td>${mahasiswa.asalKampus}</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>