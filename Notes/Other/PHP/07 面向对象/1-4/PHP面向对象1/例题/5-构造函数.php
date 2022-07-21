<?php
class Student {
	private $name;
	private $sex;
	//初始化成员变量
	public function __construct($name,$sex) {
		$this->name=$name;
		$this->sex=$sex;
	}
	//显示信息
	public function show() {
		echo "姓名：{$this->name}<br>";
		echo "性别：{$this->sex}<br>";
	}
}
//实例化
$stu=new Student('tom','男');
$stu->show();