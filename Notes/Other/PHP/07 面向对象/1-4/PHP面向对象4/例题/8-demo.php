<?php
//自动加载类
spl_autoload_register(function($class_name){
	require "./{$class_name}.class.php";
});
//获取单例
$param=array(
	'user'		=>	'root',
	'pwd'		=>	'root',
	'dbname'	=>	'data'
);
//获取单例
$db=MySQLDB::getInstance($param);
?>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>无标题文档</title>
<style type="text/css">
	table{
		width:780px;
		border:solid #000 1px;
	}
	td,th{
		border:solid #000 1px;
	}
</style>
</head>

<body>
<?php
$pagesize=10;		//页面大小
//第一步：获取总记录数
$rowcount=$db->fetchColumn('select count(*) from products');
//第二步：求出总页数
$pagecount=ceil($rowcount/$pagesize);
//第四步：通过当前页面，求出起始位置
//$pageno=isset($_GET['pageno'])?$_GET['pageno']:1;
$pageno=$_GET['pageno']??1;
$pageno=$pageno<1?1:$pageno;
$pageno=$pageno>$pagecount?$pagecount:$pageno;
$startno=($pageno-1)*$pagesize;
//第五步：获取当前页面数据，并遍历显示
//$sql="select * from products limit $startno,$pagesize";
$sql="select * from products where proid>=(select proid from products limit $startno,1) limit $pagesize";
$rs=$db->fetchAll($sql);
?>
<table>
	<tr>
		<th>编号</th>
		<th>商品名称</th>
		<th>规格</th>
		<th>价格</th>
	</tr>
	<?php foreach($rs as $row):?>
	<tr>
		<td><?=$row['proID']?></td>
		<td><?=$row['proname']?></td>
		<td><?=$row['proguige']?></td>
		<td><?=$row['proprice']?></td>
	</tr>
	<?php endforeach;?>
</table>
<!--第三步：循环显示页码-->
一共有<?=$rowcount?>条记录，每页放<?=$pagesize?>条记录,当前是<?=$pageno?>页 <br />
【<a href="?pageno=1">首页</a>】
【<a href="?pageno=<?=$pageno-1?>">上一页</a>】
<?php for($i=1; $i<=$pagecount; $i++):?>
	<a href="?pageno=<?=$i?>"><?=$i?></a>
<?php endfor;?>
【<a href="?pageno=<?=$pageno+1?>">下一页</a>】
【<a href="?pageno=<?=$pagecount?>">末页</a>】
</body>
</html>