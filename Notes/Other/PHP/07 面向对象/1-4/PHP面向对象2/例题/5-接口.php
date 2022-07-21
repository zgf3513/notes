<?php
//声明接口
interface IPerson {
	const ADD='中国';
	function fun1();
	function fun2();
}
//接口实现
class Student implements IPerson {
	public function fun1() {
		
	}
	public function fun2() {
		
	}
}
//访问接口中的常量
echo IPerson::ADD;


