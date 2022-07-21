<?php
class Student {
	//把对象当成字符串使用的时候自动执行
	public function __tostring() {
		return '这是一个对象，不是字符串<br>';
	}
	//把对象当成函数使用的时候自动执行
	public function __invoke() {
		echo '这是一个对象，不是函数<br>';
	}
}
$stu=new Student;
echo $stu;	//当成字符串使用
$stu();		//当成函数使用


