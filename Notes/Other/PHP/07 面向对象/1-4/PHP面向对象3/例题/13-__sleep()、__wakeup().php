<?php
class Student {
	private $name;
	private $sex;
	private $add='中国';
	public function __construct($name,$sex) {
		$this->name=$name;
		$this->sex=$sex;
	}
	/**
	*序列化的时候自动调用
	*@return array 序列化的字段名
	*/
	public function __sleep() {
		return array('name','sex');
	}
	//反序列化的时候自动调用
	public function __wakeup() {
		$this->type='学生';
	}
}
//测试
$stu=new Student('tom','男');
$str=serialize($stu);	//序列化
$stu=unserialize($str);	//反序列化
print_r($stu);



