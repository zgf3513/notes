<?php
//自动加载类
function __autoload($class_name) {
	require "./{$class_name}.class.php";
}
//测试
$book=new Book();
$book->setName('面向对象编程');
$phone=new Phone();
$phone->setName('苹果6s');
$book->getName();
$phone->getName();
