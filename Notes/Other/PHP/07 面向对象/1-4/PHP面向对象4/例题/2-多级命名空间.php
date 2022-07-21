<?php
namespace China\Beijing\Shunyi;
class Student {
	
}
namespace USA\Washington;
class Student {
	
}
//测试：
$stu1=new Student();	//相对路径
$stu2=new \USA\Washington\Student();	//绝对路径
$stu3=new \China\Beijing\Shunyi\Student();	//绝对路径
var_dump($stu1,$stu2,$stu3);

//object(USA\Washington\Student)#1 (0) { }
//object(USA\Washington\Student)#2 (0) { }
//object(China\Beijing\Shunyi\Student)#3 (0) { } 
