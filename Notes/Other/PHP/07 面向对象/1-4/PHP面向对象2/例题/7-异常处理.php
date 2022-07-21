<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>无标题文档</title>
</head>

<body>
<?php
if(isset($_POST['button'])) {
	try{
		$age=$_POST['age'];
		if($age=='')
			throw new Exception('年龄不能为空',1001);	//抛出异常
		if(!is_numeric($age))
			throw new Exception('年龄必须是数字',1001);	//抛出异常
		if(!($age>=10 && $age<=30)) 
			throw new Exception('年龄必须在10-30之间',1002);	//抛出异常
		echo '您的年龄合适';
	}catch(Exception $ex){		//捕获异常
		echo '错误信息：'.$ex->getMessage(),'<br>';
		echo '错误码：'.$ex->getCode(),'<br>';
		echo '文件地址：'.$ex->getFile(),'<br>';
		echo '错误行号：'.$ex->getLine(),'<br>';
	}
	finally{
		echo '关闭数据库连接';  //不管是否有异常，finally都要执行
	}
}
?>
<form method="post" action="">
	年龄： <input type="text" name="age"> <br />
	<input type="submit" name="button" value="提交">
</form>
</body>
</html>

