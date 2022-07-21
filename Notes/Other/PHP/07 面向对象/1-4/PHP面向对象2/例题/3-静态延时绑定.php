<?php
class Person {
	public static $type='人类';
	public function show1() {
		//var_dump($this);		//object(Student)#1 (0) { } 
		//echo self::$type,'<br>';	//人类
		echo static::$type,'<br>';			//学生   延时绑定
	}
}
class Student extends Person {
	public static $type='学生';
	public function show2() {
		//var_dump($this);		//object(Student)#1 (0) { } 
		//echo self::$type,'<br>';	//学生
		echo static::$type,'<br>';			//学生
	}
}
//测试
$obj=new Student();
$obj->show1();
$obj->show2();