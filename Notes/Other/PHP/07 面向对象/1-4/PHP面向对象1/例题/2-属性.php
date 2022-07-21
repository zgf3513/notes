<?php
//定义类
class Student {
	public $name;				//属性
	public $add='地址不详';		//属性
}
//实例化对象
$stu=new Student();
//print_r($stu);	//Student Object ( [name] => [add] => 地址不详 ) 
//操作属性
//1、给属性赋值
$stu->name='tom';
$stu->add='北京';

//2、获取属性的值
echo '姓名：'.$stu->name,'<br>';	//姓名：tom
echo '地址：'.$stu->add,'<br>';		//地址：北京

//3、添加属性
$stu->age=20;
print_r($stu);	//Student Object ( [name] => tom [add] => 北京 [age] => 20 ) 
echo '<br>';
//4、删除属性
unset($stu->add);
print_r($stu);	//Student Object ( [name] => tom [age] => 20 ) 

