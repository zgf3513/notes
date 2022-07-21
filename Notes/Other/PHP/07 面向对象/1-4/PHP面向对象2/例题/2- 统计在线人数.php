<?php
class Student {
	private static $num=0;	//静态变量，在内存中就一份
	public function __construct() {
		self::$num++;
	}
	public function __destruct() {
		self::$num--;
	}
	public function show() {
		echo '总人数是：'.self::$num,'<br>';
	}
}
//测试
$stu1=new Student;
$stu2=new Student;
$stu3=new Student;
$stu2->show();			//总人数是：3
unset($stu2);
$stu3->show();			//总人数是：2
