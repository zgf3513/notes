<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>无标题文档</title>
</head>

<body>
<?php
//自定义空异常类
class MyNullException extends Exception {
}
//自定义类型异常
class MyTypeException extends Exception {
}
//自定义范围异常
class MyRangeException extends Exception {
}
//逻辑代码
if(isset($_POST['button'])) {
	try{
		$name=$_POST['name'];
		$age=$_POST['age'];
		if($name=='')
			throw new MyNullException('姓名不能为空');
		if($age=='')
			throw new MyNullException('年龄不能为空');
		if(!is_numeric($age))
			throw new MyTypeException('年龄不是数字');
		if($age<10 || $age>30)
			throw new MyRangeException('年龄必须在10-30之间');
		echo '姓名：'.$name,'<br>';
		echo '年龄：'.$age;
	}catch(MyNullException $ex){
		echo $ex->getMessage(),'<br>';
		echo '错误记录在日志中';
	}catch(MyTypeException $ex){
		echo $ex->getMessage(),'<br>';
		echo '发送电子邮件';
	}catch(MyRangeException $ex){
		echo $ex->getMessage(),'<br>';
		echo '给管理员打电话';
	}

}
?>
<form method="post" action="">
	姓名： <input type="text" name="name"> <br />
	年龄： <input type="text" name="age"> <br />
	<input type="submit" name="button" value="提交">
</form>
</body>
</html>