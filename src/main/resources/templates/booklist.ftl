<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="/testoption/tableDemo.html">添加</a>
	<table>
		<tr>
			<th>序号</th>
			<th>书名</th>
			<th>作者</th>
			<th>操作</th>
		</tr>
		<#list bookList as book>
		<tr>
			<td>${book.id}</td>
			<td>${book.name?default("")}</td>
			<td>${book.author?default("")}</td>
			<td>
				<a href="/preUpdate/${book.id}">修改</a>
				<a href="/deleteBook/${book.id}">删除</a>
			</td>
		</tr>
		</#list>
	</table>
</body>
</html>