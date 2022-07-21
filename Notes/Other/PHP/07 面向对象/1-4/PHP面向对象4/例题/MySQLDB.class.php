<?php
//封装MySQL单例
class MySQLDB {
	private $host;		//主机地址
	private $port;		//端口号
	private $user;		//用户名
	private $pwd;		//密码
	private $dbname;	//数据接名
	private $charset;	//字符集
	private $link;		//连接对象
	private static $instance;
	private function __construct($param) {
		$this->initParam($param);
		$this->initConnect();
	}
	private function __clone() {
		
	}
	//获取单例
	public static function getInstance($param=array()) {
		if(!self::$instance instanceof self)
			self::$instance=new self($param);
		return self::$instance;
	}
	//初始化参数
	private function initParam($param) {
		$this->host=$param['host']??'127.0.0.1';
		$this->port=$param['port']??'3306';
		$this->user=$param['user']??'';
		$this->pwd=$param['pwd']??'';
		$this->dbname=$param['dbname']??'';
		$this->charset=$param['charset']??'utf8';
	}
	//连接数据库
	private function initConnect() {
		$this->link=@mysqli_connect($this->host,$this->user,$this->pwd,$this->dbname);
		if(mysqli_connect_error()){
			echo '数据库连接失败<br>';
			echo '错误信息：'.mysqli_connect_error(),'<br>';
			echo '错误码：'.mysqli_connect_errno(),'<br>';
			exit;
		}
		mysqli_set_charset($this->link,$this->charset);
	}
	//执行数据库的增、删、改、查
	private function execute($sql) {
		if(!$rs=mysqli_query($this->link,$sql)){
			echo 'SQL语句执行失败<br>';
			echo '错误信息：'.mysqli_error($this->link),'<br>';
			echo '错误码：'.mysqli_errno($this->link),'<br>';
			echo '错误的SQL语句：'.$sql,'<br>';
			exit;
		}
		return $rs;
	}
	/**
	*执行增、删、改
	*@return bool 成功返回true,失败返回false
	*/
	public function exec($sql) {
		$key=substr($sql,0,6);
		if(in_array($key,array('insert','update','delete')))
			return $this->execute($sql);
		else{
			echo '非法访问<br>';
			exit;
		}

	}
	//获取自动增长的编号
	public function getLastInsertId() {
		return mysqli_insert_id($this->link);
	}

	//执行查询语句
	private function query($sql) {
		if(substr($sql,0,6)=='select' || substr($sql,0,4)=='show' || substr($sql,0,4)=='desc'){
			return $this->execute($sql);
		}else{
			echo '非法访问<br>';
			exit;
		}
	}
	/**
	*执行查询语句，返回二维数组
	*@$sql string 查询sql语句
	*@type string assoc|num|both
	*/
	public function fetchAll($sql,$type='assoc') {
		$rs=$this->query($sql);
		$type=$this->getType($type);
		return mysqli_fetch_all($rs,$type);
	}
	//匹配一维数组
	public function fetchRow($sql,$type='assoc') {
		$list=$this->fetchAll($sql,$type);
		if(!empty($list))
			return $list[0];
		return array();
	}
	//匹配一行一列
	public function fetchColumn($sql) {
		$list=$this->fetchRow($sql,'num');
		if(!empty($list))
			return $list[0];
		return null;
	}

	//获取匹配类型
	private function getType($type) {
		switch($type){
			case 'num':
				return  MYSQLI_NUM;
			case 'both':
				return  MYSQLI_BOTH;
			default:
				return  MYSQLI_ASSOC;
		}
	}
}

