<?php
//定义类
class Student {
	
}
//实例化对象
$stu1=new Student();
$stu2=new Student;
$stu3=$stu2; //对象传递的是地址	
//var_dump($stu1,$stu2,$stu3); //object(Student)#1 (0) { } object(Student)#2 (0) { } object(Student)#2 (0) { } 
//对象比较
var_dump($stu1==$stu2);		//bool(true) ,比较对象的结构
echo '<br>';
var_dump($stu1===$stu2);	//bool(false) $stu1和$stu2是否是同一个对象
echo '<br>';
var_dump($stu2===$stu3);	//bool(true) $stu2和$stu3是同一个对象
