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
for($i=1;$i<=9;$i++){
	$n=$i>5?(10-$i):$i;
	$k=2*$n-1;			//星星的个数
	for($j=1;$j<=$k;$j++){
		echo '<span>*</span>';
	}
	echo '<br>';
}
?>
</body>
</html>