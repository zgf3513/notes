<?php
class Student {
	/**
	*作用：调用无法访问的方法时自动执行
	*@param $fn_name string 方法名
	*@param $fn_args array 参数数组
	*/
	public function __call($fn_name,$fn_args) {
		echo "{$fn_name}不存在<br>";
	}
	//调用无法访问的静态方法时自动执行
	public static function __callstatic($fn_name,$fn_args) {
		echo "{$fn_name}静态方法不存在<br>";	
	}
}
$stu=new Student;
$stu->show(10,20);

Student::show();
