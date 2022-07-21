<?php
//访问修饰符
class Student {
	private $name;	//私有属性
	private $sex;	//私有属性
	//通过公有的方法对私有的属性进行赋值
	public function setInfo($name,$sex) {
		if($sex!='男' && $sex!='女'){
			echo '性别必须是男或女';
			exit;
		}
		$this->name=$name;   //$this表示当前对象
		$this->sex=$sex;
	}
	//显示信息
	public function getInfo() {
		echo '姓名：'.$this->name,'<br>';
		echo '性别：'.$this->sex,'<br>';
	}
}
//实例化
$stu=new Student;
$stu->setInfo('tom','男');
$stu->getInfo();
echo '<hr>';
$stu2=new Student;
$stu2->setInfo('berry','女');
$stu2->getInfo();
