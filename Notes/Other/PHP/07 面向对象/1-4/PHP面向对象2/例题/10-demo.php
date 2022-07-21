<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>无标题文档</title>
</head>

<body>
<style type="text/css">
	body{
		text-align:center;
		font-size:25px;
	}
	span{
		width:30px;
		height:10px;
		display:inline-block;
	}
</style>
<?php
for($i=1; $i<=10; $i++) {
	for($j=1; $j<=10; $j++) {
		if($i>=3 && $i<=8 && $j>=3 && $j<=8)
			echo '<span></span>';
		else
			echo '<span>*</span>';
	}
	echo '<br>';
}
?>
</body>
</html>