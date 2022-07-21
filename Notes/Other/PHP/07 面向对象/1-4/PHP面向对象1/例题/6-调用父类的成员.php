<?php
//父类
class Person {
	public function show() {
		echo '这是人类<br>';
	}
}
//子类
class Student extends Person {
	public function test() {
		//方法一；
		/*
		$person=new Person();
		$person->show();		//这是人类
		*/
		//方法二
		$this->show();			//这是人类
	}
}
//测试
$stu=new Student;
$stu->test();

