<?php
spl_autoload_register(function($class_name){
	//类名和文件地址映射成一个关联数组
	$map=array(
		'Goods'	=>	'./aa/Goods.class.php',
		'Book'	=>	'./bb/Book.class.php',
		'Phone'	=>	'./cc/Phone.class.php'
	);
	//在映射数组中找到就包含
	if(isset($map[$class_name]))
		require $map[$class_name];
});
//测试
$book=new Book();
$book->setName('面向对象编程');
$phone=new Phone();
$phone->setName('苹果6s');
$book->getName();
$phone->getName();
