<?php
class ProductsA {
}
class ProductsB {	
}
//工厂模式
class ProductsFactory {
	public function create($num) {
		switch($num) {
			case 1:
				return new ProductsA;
			case 2:
				return new ProductsB;
			default:
				return null;
		}
	}
}
//测试
$factory=new ProductsFactory();
$obj1=$factory->create(1);
$obj2=$factory->create(2);
var_dump($obj1,$obj2); //object(ProductsA)#2 (0) { } object(ProductsB)#3 (0) { } 
