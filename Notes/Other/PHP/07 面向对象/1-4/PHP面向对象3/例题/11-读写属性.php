<?php
class Student {
	private $name;			//读写属性
	private $add='中国';	//只读属性
	private $age;			//只写属性
	
	public function __set($k,$v) {
		if(in_array($k,array('name','age')))
			$this->$k=$v;
		else
			echo "{$k}属性是只读属性<br>";
	}
	public function __get($k) {
		if(in_array($k,array('name','add')))
			return $this->$k;
		else
			echo "{$k}是只写属性<br>";
	}
}
//测试
$stu=new Student;
$stu->name='tom';
$stu->age=22;
echo '姓名：'.$stu->name,'<br>';
echo '地址：'.$stu->add,'<br>';
