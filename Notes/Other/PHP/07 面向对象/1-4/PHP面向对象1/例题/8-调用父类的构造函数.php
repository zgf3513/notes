<?php
class Person {
	protected $name;
	protected $sex;
	public function __construct($name,$sex) {
		$this->name=$name;
		$this->sex=$sex;
	}
}
class Student extends Person {
	private $score;
	public function __construct($name,$sex,$score) {
		parent::__construct($name,$sex);  //调用父类构造函数并传递参数
		$this->score=$score;
	}
	public function getInfo() {
		echo "姓名：{$this->name}<br>";
		echo "性别：{$this->sex}<br>";
		echo "成绩：{$this->score}";
	}
}
//测试
$stu=new Student('tom','男',88);
$stu->getInfo();
 