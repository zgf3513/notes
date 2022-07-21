<?php
//父类
class Person {
	public function show() {
		echo '这是父类<br>';
	}
}
//子类
class Student extends Person {
	//子类重写了父类的同名方法
	public function show() {
		echo '这是子类<br>';
	}
}
//测试
$stu=new Student;
$stu->show();			//这是子类

