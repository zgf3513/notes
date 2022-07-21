<?php
//抽象类
abstract class Person {
	public abstract function setInfo();	//抽象方法
	public function getInfo() {
		echo '获取信息<br>';
	}
}
//继承
class Student extends Person {
	//重写实现父类的抽象方法
	public function setInfo() {
		echo '重新实现父类的抽象方法<br>';
	}
}
//测试
$stu=new Student;
$stu->setInfo();		//重新实现父类的抽象方法
$stu->getInfo();		//获取信息