<?php
class Walk {
	public function way() {
		echo '走着去<br>';
	}
}
class Bus {
	public function way() {
		echo '坐车去<br>';
	}
}
//策略模式
class Student {
	public function play($obj) {
		$obj->way();
	}
}
//测试
$stu=new Student;
$stu->play(new Walk());	//走着去
$stu->play(new Bus());	//坐车去