<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/optionBook" method="post">
		<input type="text" name="id" value="${bookModel.id}"/><br/>
		图书名称：<input type="text" name="name" value="${bookModel.name}"/><br/>
		图书作者：<input type="text" name="author" value="${bookModel.author}"/><br/>
		<input type="submit" value="提交">
	</form>
</body>
</html>