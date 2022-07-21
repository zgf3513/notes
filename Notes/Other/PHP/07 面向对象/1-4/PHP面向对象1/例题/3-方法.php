<?php
class Student {
	//定义方法
	public function show() {
		echo '这是show方法<br>';
	}
	//public可以省略，如果省略，默认就是public
	function test() {
		echo '这是test方法<br>';
	}
}
$stu=new Student;
$stu->show();
$stu->test();


