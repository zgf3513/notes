<?php
class Student {
	public function __clone() {
		echo '正在克隆对象<br>';
	}
}
$stu1=new Student;
$stu2=clone $stu1;		//克隆对象
var_dump($stu1,$stu2);  //object(Student)#1 (0) { } object(Student)#2 (0) { } 


