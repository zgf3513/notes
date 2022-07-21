<?php
//方法一：
/*
//加载类函数
function loadClass($class_name) {
	require "./{$class_name}.class.php";
}
//注册加载类函数
spl_autoload_register('loadClass');
*/

//方法二：
spl_autoload_register(function($class_name){
	require "./{$class_name}.class.php";
});

//测试
$book=new Book();
$book->setName('面向对象编程');
$phone=new Phone();
$phone->setName('苹果6s');
$book->getName();
$phone->getName();
