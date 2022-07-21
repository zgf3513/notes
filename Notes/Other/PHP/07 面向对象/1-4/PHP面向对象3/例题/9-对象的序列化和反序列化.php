<?php
class Student {
	public $name;
	protected $sex;
	private $add;
	public function __construct($name,$sex,$add) {
		$this->name=$name;
		$this->sex=$sex;
		$this->add=$add;
	}
}
/*
//测试
$stu=new Student('tom','男','北京');
//序列化
$str=serialize($stu);
file_put_contents('./stu.txt',$str);
*/

//反序列化，类的反序列化必须要有类的参与
$str=file_get_contents('./stu.txt');
$stu=unserialize($str);
echo '<pre>';
var_dump($stu);