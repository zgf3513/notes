<?php
class A {
	public function getNum() {
		echo $this->num;
	}
}
class B extends A {
	protected $num=10;	
}
//测试
$obj=new A();
$obj->getNum();	 //Notice: Undefined property: A::$num 