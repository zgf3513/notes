# 5、Maven

**我们为什么要学习这个技术？**

​	1.在JavaWeb开发中，需要大量的jar包，我们手动去导入；

​	2.如何能够让一个东西自动帮我导入和配置这个jar包

​		由此，maven诞生了

## 5.1  Maven项目架构管理工具

我们目前用来就是方便导入jar包

Maven的核心思想：**约定大于配置**

* 有约束，不要去违反

Maven会规定好你该如何去编写我们的Java代码，必须按照这个规范来

## 5.2 下载安装Maven

官网：http://maven.apache.org/

![image-20210812231911875](C:\Users\zgf35\AppData\Roaming\Typora\typora-user-images\image-20210812231911875.png)

下载完成后解压即可

## 5.3 配置环境变量

在我们的系统环境变量中配置如下配置：

* M2_HOME	maven目录下的bin目录

* MAVEN_HOME	maven的目录

* 在系统的path中配置MAVEN_HOME

  ![image-20210812233743171](C:\Users\zgf35\AppData\Roaming\Typora\typora-user-images\image-20210812233743171.png)

测试Maven是否安装成功，保证配置完毕

## 5.4 阿里云镜像

* 镜像：mirrors

  * 作用：加速我们的下载

  国内建议使用阿里云的镜像

```xml
<!-- 阿里云仓库 -->
    <mirror>
      <id>alimaven</id>
      <mirrorOf>central</mirrorOf>
      <name>aliyun maven</name>
      <url>http://maven.aliyun.com/nexus/content/repositories/central/</url>
    </mirror>

    <!-- 阿里云仓库2 -->
    <mirror>
		  <id>nexus-aliyun</id>
		  <mirrorOf>*,!jeecg,!jeecg-snapshots</mirrorOf>
      <name>Nexus aliyun</name>
      <url>http://maven.aliyun.com/nexus/content/group/public</url>
	  </mirror>

    <!-- 中央仓库1 -->
    <mirror>
      <id>repo1</id>
      <mirrorOf>central</mirrorOf>
      <name>Human Readable Name for this Mirror.</name>
      <url>http://repo1.maven.org/maven2/</url>
    </mirror>

    <!-- 中央仓库2 -->
    <mirror>
      <id>repo2</id>
      <mirrorOf>central</mirrorOf>
      <name>Human Readable Name for this Mirror.</name>
      <url>http://repo2.maven.org/maven2/</url>
    </mirror>
```

## 5.5 本地仓库

本地仓库，远程仓库

**建立一个仓库：**localRepository

```xml
<localRepository>D:\Environment\maven\repository</localRepository>
```

## 5.6 在IDEA中使用Maven

1.创建一个MavenWeb项目

![image-20210812234947865](C:\Users\zgf35\AppData\Roaming\Typora\typora-user-images\image-20210812234947865.png)

![image-20210812235104691](C:\Users\zgf35\AppData\Roaming\Typora\typora-user-images\image-20210812235104691.png)

![image-20210812235142424](C:\Users\zgf35\AppData\Roaming\Typora\typora-user-images\image-20210812235142424.png)

![image-20210812235254539](C:\Users\zgf35\AppData\Roaming\Typora\typora-user-images\image-20210812235254539.png)

3.等待项目初始化完毕

![image-20210812235457822](C:\Users\zgf35\AppData\Roaming\Typora\typora-user-images\image-20210812235457822.png)

![image-20210812235550006](C:\Users\zgf35\AppData\Roaming\Typora\typora-user-images\image-20210812235550006.png)

4.观察Maven仓库中多了什么

5.IDEA中的Maven设置

IDEA项目创建成功后，看一眼Maven的配置

![image-20210813000111024](C:\Users\zgf35\AppData\Roaming\Typora\typora-user-images\image-20210813000111024.png)

6.到这里，Maven在IDEA中的配置就差不多了

## 5.7 创建一个普通的Maven项目

![image-20210813000706090](C:\Users\zgf35\AppData\Roaming\Typora\typora-user-images\image-20210813000706090.png)

![image-20210813001144084](C:\Users\zgf35\AppData\Roaming\Typora\typora-user-images\image-20210813001144084.png)

![image-20210813001331530](C:\Users\zgf35\AppData\Roaming\Typora\typora-user-images\image-20210813001331530.png)

## 5.8 在IDEA中标记文件夹功能

![image-20210813001737521](C:\Users\zgf35\AppData\Roaming\Typora\typora-user-images\image-20210813001737521.png)

## 5.9 在IDEA中配置Tomcat

![image-20210813002724670](C:\Users\zgf35\AppData\Roaming\Typora\typora-user-images\image-20210813002724670.png)

![image-20210813002815495](C:\Users\zgf35\AppData\Roaming\Typora\typora-user-images\image-20210813002815495.png)

解决警告问题

为什么会有这个问题：我们访问一个网站，需要指定一个文件夹名字

![image-20210813003213266](C:\Users\zgf35\AppData\Roaming\Typora\typora-user-images\image-20210813003213266.png)

![image-20210813003254446](C:\Users\zgf35\AppData\Roaming\Typora\typora-user-images\image-20210813003254446.png)

![image-20210813003330115](C:\Users\zgf35\AppData\Roaming\Typora\typora-user-images\image-20210813003330115.png)

![image-20210813003935850](C:\Users\zgf35\AppData\Roaming\Typora\typora-user-images\image-20210813003935850.png)

## 5.10 pom文件

pom.xml是Maven的核心文件

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!--maven的版本和头文件-->
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

<!--  这里就是我们刚刚配置的“GAV”-->
  <groupId>com.daotu</groupId>
  <artifactId>MavenWebLearning</artifactId>
  <version>1.0-SNAPSHOT</version>
  <packaging>war</packaging>
<!--  package：项目的打包方式-->
<!--  jar：Java应用-->
<!--  war：JavaWeb应用-->

  <name>MavenWebLearning Maven Webapp</name>
  <!-- FIXME change it to the project's website -->
  <url>http://www.example.com</url>

<!--  配置-->
  <properties>
<!--    项目的默认构建编码-->
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
<!--    编译版本-->
    <maven.compiler.source>1.7</maven.compiler.source>
    <maven.compiler.target>1.7</maven.compiler.target>
  </properties>

<!--  项目依赖-->
  <dependencies>
<!--    具体依赖的jar包配置文件-->
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.11</version>
      <scope>test</scope>
    </dependency>
  </dependencies>

<!--  项目构建用的东西-->
  <build>
    <finalName>MavenWebLearning</finalName>
    <pluginManagement><!-- lock down plugins versions to avoid using Maven defaults (may be moved to parent pom) -->
      <plugins>
        <plugin>
          <artifactId>maven-clean-plugin</artifactId>
          <version>3.1.0</version>
        </plugin>
        <!-- see http://maven.apache.org/ref/current/maven-core/default-bindings.html#Plugin_bindings_for_war_packaging -->
        <plugin>
          <artifactId>maven-resources-plugin</artifactId>
          <version>3.0.2</version>
        </plugin>
        <plugin>
          <artifactId>maven-compiler-plugin</artifactId>
          <version>3.8.0</version>
        </plugin>
        <plugin>
          <artifactId>maven-surefire-plugin</artifactId>
          <version>2.22.1</version>
        </plugin>
        <plugin>
          <artifactId>maven-war-plugin</artifactId>
          <version>3.2.2</version>
        </plugin>
        <plugin>
          <artifactId>maven-install-plugin</artifactId>
          <version>2.5.2</version>
        </plugin>
        <plugin>
          <artifactId>maven-deploy-plugin</artifactId>
          <version>2.8.2</version>
        </plugin>
      </plugins>
    </pluginManagement>
  </build>
</project>

```

**maven的高级之处在于它会帮你导入jar包所依赖的其他jar包**

maven由于他的约定大于配置，我们之后可能会遇到我们写的配置文件无法被导出或生效的问题，解决方案：

在build中配置resources来防止我们资源导出失败的问题

```xml
	<build>
        <resources>
            <resource>
                <directory>src/main/resources</directory>
                <includes>
                    <include>**/*.properties</include>
                    <include>**/*.xml</include>
                </includes>
                <filtering>true</filtering>
            </resource>
            <resource>
                <directory>src/main/java</directory>
                <includes>
                    <include>**/*.properties</include>
                    <include>**/*.xml</include>
                </includes>
                <filtering>true</filtering>
            </resource>
        </resources>
    </build>
```

## 5.11 解决遇到的问题

1.IDEA中每次都要重复配置Maven：

* 在IDEA中的全局默认配置中去配置

2.Maven仓库的使用

* 地址：https://mvnrepository.com/

![image-20210813104235385](C:\Users\zgf35\AppData\Roaming\Typora\typora-user-images\image-20210813104235385.png)

![image-20210813104435556](C:\Users\zgf35\AppData\Roaming\Typora\typora-user-images\image-20210813104435556.png)

![image-20210813104455274](C:\Users\zgf35\AppData\Roaming\Typora\typora-user-images\image-20210813104455274.png)

# 6、Servlet

## 6.1 Servlet简介

* servlet就是sun公司开发动态web的一门技术
* sun公司在这些API中提供了一个接口叫做Servlet，如果你想开发一个servlet程序，只需要完成两个小步骤：
  * 编写一个类，实现servlet接口
  * 把开发好的Java类部署到web服务器中

**把实现了servlet接口的Java程序叫做servlet**

## 6.2 HelloServlet

Servlet接口在Sun公司有两个默认的实现类：**HttpServlet**，**GenericServlet**



1.构建一个普通的Maven项目，删掉里面的src目录，以后我们的学习就在这个项目里面建立module；这个空的项目就是maven的主项目

2.关于Maven父子工程的理解：

​	父项目中会有

```xml
	<modules>
        <module>servlet-01</module>
    </modules>
```

​	子项目会有

```xml
    <parent>
        <artifactId>javaweb-servlet-learning</artifactId>
        <groupId>com.DaoTu</groupId>
        <version>1.0-SNAPSHOT</version>
    </parent>
```

​	父项目中的Java项目可以直接使用

```java
son extends father
```

3.Maven环境优化

​	1.修改web.xml为最新的

​	2.将Maven的结构搭建完整

4.编写一个servlet程序

​	1.编写一个普通类

​	2.实现Servlet接口，这里我们直接继承HttpServlet

5.编写Servlet的映射

​	为什么需要映射：我们写的是Java程序，但是要通过浏览器访问，而浏览器需要连接web服务器，所以我们需要在web服务中注册我们写的Servlet，还需要给他一个浏览器能访问的路径

```xml
<!--    注册servlet-->
    <servlet>
        <servlet-name>hello</servlet-name>
        <servlet-class>com.DaoTu.servlet.HelloServlet</servlet-class>
    </servlet>
<!--    servlet的请求路径-->
    <servlet-mapping>
        <servlet-name>hello</servlet-name>
        <url-pattern>/hello</url-pattern>
    </servlet-mapping>
```

6.配置Tomcat

注意：配置项目发布的路径就可以了

7.启动测试

## 6.3 Servlet原理

Servlet是由Web服务器调用，Web服务器在收到浏览器请求过后会：

![image-20210813174616352](C:\Users\zgf35\AppData\Roaming\Typora\typora-user-images\image-20210813174616352.png)

## 6.4 Mapping问题

1. 一个Servlet请求可以指定一个映射路径

   ```xml
   <!--    servlet的请求路径-->
       <servlet-mapping>
           <servlet-name>hello</servlet-name>
           <url-pattern>/hello</url-pattern>
       </servlet-mapping>
   ```

2. 一个Servlet可以指定多个映射路径

   ```xml
   <!--    servlet的请求路径-->
       <servlet-mapping>
           <servlet-name>hello</servlet-name>
           <url-pattern>/hello</url-pattern>
       </servlet-mapping>
   <!--    servlet的请求路径-->
       <servlet-mapping>
           <servlet-name>hello</servlet-name>
           <url-pattern>/hello1</url-pattern>
       </servlet-mapping>
   <!--    servlet的请求路径-->
       <servlet-mapping>
           <servlet-name>hello</servlet-name>
           <url-pattern>/hello2</url-pattern>
       </servlet-mapping>
   ```

3. 一个Servlet可以指定通用路径

   ```xml
   <!--    servlet的请求路径-->
       <servlet-mapping>
           <servlet-name>hello</servlet-name>
           <url-pattern>/hello/*</url-pattern>
       </servlet-mapping>
   ```

4. 默认请求路径

   ```xml
   <!--    servlet的请求路径-->
       <servlet-mapping>
           <servlet-name>hello</servlet-name>
           <url-pattern>/*</url-pattern>
       </servlet-mapping>
   ```

5. 指定一些后缀或前缀等等

   ```xml
   <!--    servlet的请求路径-->
   <!--    注意：*前面不能加项目的映射路径--->
       <servlet-mapping>
           <servlet-name>hello</servlet-name>
           <url-pattern>*.daotu</url-pattern>
       </servlet-mapping>
   ```

   6.优先级问题

   ​	指定了固有的映射路径优先级最高，如果找不到则走默认的处理请求

## 6.5  ServletContext

web容器在启动的时候，它会为每个web容器都创建一个对应的ServletContext对象，它代表了当前的web应用

* 共享数据

  我在这个servlet中保存的数据，可以在另一个servlet中拿到

  ```java
      @Override
      protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  //        this.getInitParameter()   初始化参数
  //        this.getServletConfig()   Servlet配置
  //        this.getServletContext()  Servlet上下文
          ServletContext context = this.getServletContext();
          String username = "violet";
          context.setAttribute("username",username);//将一个数据保存在ServletContext中，名字为username
          System.out.println("hello");
      }
  ```

  ```java
      @Override
      protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
          ServletContext context = this.getServletContext();
          String username = (String) context.getAttribute("username");
  
          resp.setContentType("text/html");
          resp.setCharacterEncoding("UTF-8");
          PrintWriter writer = resp.getWriter();
          writer.println(username);
      }
  
      @Override
      protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
          doGet(req, resp);
      }
  ```

  ```xml
      <servlet>
          <servlet-name>hello</servlet-name>
          <servlet-class>com.daotu.servlet.HelloServlet</servlet-class>
      </servlet>
      <servlet-mapping>
          <servlet-name>hello</servlet-name>
          <url-pattern>/hello</url-pattern>
      </servlet-mapping>
  
      <servlet>
          <servlet-name>getUsername</servlet-name>
          <servlet-class>com.daotu.servlet.GetServlet</servlet-class>
      </servlet>
      <servlet-mapping>
          <servlet-name>getUsername</servlet-name>
          <url-pattern>/getUsername</url-pattern>
      </servlet-mapping>
  ```

  测试访问结果

* 获取然后初始化参数

  ```xml
  <!--    配置web的一些初始化参数-->
      <context-param>
          <param-name>url</param-name>
          <param-value>jdbc:mysql://localhost:3306/</param-value>
      </context-param>
  ```

  ```java
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      ServletContext context = this.getServletContext();
      String url = context.getInitParameter("url");
      resp.getWriter().println(url);
  
  }
  
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      doGet(req, resp);
  }
  ```

* 请求转发

  ```java
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      ServletContext context = this.getServletContext();
      RequestDispatcher dispatcher = context.getRequestDispatcher("/getUrl");//转发的请求路径
      dispatcher.forward(req,resp);//调用forward方法实现转发
      System.out.println("转发了");
  
  }
  
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      doGet(req, resp);
  }
  ```

* 读取资源文件

  properties

  * 在Java目录下新建properties
  * 在resources目录下新建properties

发现：都被打包到了同一个路径下：classes，我们俗称这个路径为classplath

思路：我们需要一个文件流

```java
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    InputStream is = this.getServletContext().getResourceAsStream("/WEB-INF/classes/database.properties");

    Properties properties = new Properties();
    properties.load(is);
    String user = properties.getProperty("user");
    String pass = properties.getProperty("pass");
    PrintWriter writer = resp.getWriter();
    writer.println(user);
    writer.println(pass);
}

@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    doGet(req, resp);
}
```

访问测试结果即可

## 6.6 HttpServletResponse

web服务器接收到客户端的http请求，针对这个请求就分别创建一个代表请求的HttpServletResponse对象，代表响应的一个HttpServletResponse；

* 如果要获取我们客户端请求过来的参数：找HttpServletRequest
* 如果要客户端响应一些信息：找HttpServletResponse

**1、简单分类**

**负责向浏览器发送数据的方法**

```java
ServletOutputStream getOutputStream() throws IOException;
PrintWriter getWriter() throws IOException;
```

**负责向浏览器发送响应头的方法**

```java
void setCharacterEncoding(String var1);

void setContentLength(int var1);

void setContentLengthLong(long var1);

void setContentType(String var1);

void setDateHeader(String var1, long var2);

void addDateHeader(String var1, long var2);

void setHeader(String var1, String var2);

void addHeader(String var1, String var2);

void setIntHeader(String var1, int var2);

void addIntHeader(String var1, int var2);
```

**响应的状态码**

```java
int SC_CONTINUE = 100;
int SC_SWITCHING_PROTOCOLS = 101;
int SC_OK = 200;
int SC_CREATED = 201;
int SC_ACCEPTED = 202;
int SC_NON_AUTHORITATIVE_INFORMATION = 203;
int SC_NO_CONTENT = 204;
int SC_RESET_CONTENT = 205;
int SC_PARTIAL_CONTENT = 206;
int SC_MULTIPLE_CHOICES = 300;
int SC_MOVED_PERMANENTLY = 301;
int SC_MOVED_TEMPORARILY = 302;
int SC_FOUND = 302;
int SC_SEE_OTHER = 303;
int SC_NOT_MODIFIED = 304;
int SC_USE_PROXY = 305;
int SC_TEMPORARY_REDIRECT = 307;
int SC_BAD_REQUEST = 400;
int SC_UNAUTHORIZED = 401;
int SC_PAYMENT_REQUIRED = 402;
int SC_FORBIDDEN = 403;
int SC_NOT_FOUND = 404;
int SC_METHOD_NOT_ALLOWED = 405;
int SC_NOT_ACCEPTABLE = 406;
int SC_PROXY_AUTHENTICATION_REQUIRED = 407;
int SC_REQUEST_TIMEOUT = 408;
int SC_CONFLICT = 409;
int SC_GONE = 410;
int SC_LENGTH_REQUIRED = 411;
int SC_PRECONDITION_FAILED = 412;
int SC_REQUEST_ENTITY_TOO_LARGE = 413;
int SC_REQUEST_URI_TOO_LONG = 414;
int SC_UNSUPPORTED_MEDIA_TYPE = 415;
int SC_REQUESTED_RANGE_NOT_SATISFIABLE = 416;
int SC_EXPECTATION_FAILED = 417;
int SC_INTERNAL_SERVER_ERROR = 500;
int SC_NOT_IMPLEMENTED = 501;
int SC_BAD_GATEWAY = 502;
int SC_SERVICE_UNAVAILABLE = 503;
int SC_GATEWAY_TIMEOUT = 504;
int SC_HTTP_VERSION_NOT_SUPPORTED = 505;
```

**2.常见应用**

1. 向浏览器输出消息

2. 下载文件

   1.要获取下载文件的路径

   2.下载的文件名是啥

   3.设置想办法让浏览器能够支持下载我们需要的东西

   4.获取下载文件的输入流

   5.创建缓冲区

   6.获取OutPutStream

   7.将FileOutPutStream流写入到buffer缓冲区

   8.使用OutPutStream将缓冲区的数据输出到客户端

   ```java
       @Override
       protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   //        1.要获取下载文件的路径
           String path = "D:\\Projects\\javaweb-servlet\\response\\target\\classes\\测试.jpg";
   //        2.下载的文件名是啥
           String fileName = path.substring(path.lastIndexOf("\\")+1);
           System.out.println(fileName);
   //        3.设置想办法让浏览器能够支持下载我们需要的东西,设置文件编码为UTF-8
           resp.setHeader("Content-disposition","attachment;filename="+URLEncoder.encode(fileName,"UTF-8"));
   //        4.获取下载文件的输入流
           FileInputStream in = new FileInputStream(path);
   //        5.创建缓冲区
           byte[] buffer = new byte[1024];
   //        6.获取OutPutStream
           ServletOutputStream out = resp.getOutputStream();
   //        7.将FileOutPutStream流写入到buffer缓冲区
   //        8.使用OutPutStream将缓冲区的数据输出到客户端
           boolean flag = true;
           while (flag){
               int len = in.read(buffer);
               if (len < 1024){
                   out.write(new byte[len]);
                   flag = false;
               }else {
                   out.write(buffer);
               }
           }
           in.close();
           out.close();
       }
   
       @Override
       protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
           doGet(req, resp);
       }
   ```

3. 验证码功能

   验证码怎么来的？

   * 后端实现
   * 后端实现需要用到Java的图片类，生产一个图片

   ```java
   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //如何让浏览器三秒刷新一次
       resp.setHeader("refresh","3");
       //在内存中创建一个图片
       BufferedImage image = new BufferedImage(80,20,BufferedImage.TYPE_INT_RGB);
       //得到图片
       Graphics2D graphics = (Graphics2D) image.getGraphics();//笔
       //设置图片的背景颜色
       graphics.setColor(Color.white);
       graphics.fillRect(0,0,80,20);
       //给图片写数据
       graphics.setColor(Color.black);
       graphics.setFont(new Font(null,Font.BOLD,20));
       graphics.drawString(random(),0,20);
       //告诉浏览器这个请求用图片的方式打开
       resp.setContentType("image/jpg");
       //网站存在缓存，不让浏览器缓存
       resp.setDateHeader("expires",-1);
       resp.setHeader("Cache-Control","no-cache");
       resp.setHeader("pragma","no-cache");
       //把图片写给浏览器
       ImageIO.write(image,"jpg",resp.getOutputStream());
   }
   
   //生成随机数
   private String random(){
       Random num = new Random();
       return 1000+num.nextInt(9000)+"";
   }
   
   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       doGet(req, resp);
   }
   ```

**4.实现重定向**

一个web资源收到客户端请求后，会通知客户端去访问宁外一个web资源，这个过程叫重定向

常见场景：

* 用户登录

  ```java
  void sendRedirect(String var1) throws IOException
  ```

  测试：

  ```java
      @Override
      protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  //        resp.setHeader("Location","/response_war/img");
  //        resp.setStatus(302);
          resp.sendRedirect("/response_war/img");//重定向
      }
  
      @Override
      protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
          doGet(req, resp);
      }
  ```

面试题：请你聊聊重定向和转发的区别？

相同点：

* 页面都会实现跳转

不同点：

* 请求转发的时候URL不会产生变化
* 重定向时URL会发生变化

```jsp
<html>
<body>
<h2>Hello World!</h2>
<%--这里提交的路径需要寻找到项目的路径--%>
<%--${pageContext.request.contextPath}代表当前项目--%>
<form action="${pageContext.request.contextPath}/login" method="get">
    username:
    <label>
        <input type="text" name="username">
    </label>
    <br />
    pass:
    <label>
        <input type="password" name="password">
    </label>
    <br />
    <input type="submit">
</form>
</body>
</html>
```

```java
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    //处理请求
    String username = req.getParameter("username");
    String password = req.getParameter("password");
    System.out.println(username);
    System.out.println(password);
    //重定向注意：重定向时一定要注意路径问题，否则404
    resp.sendRedirect("/response_war/success.jsp");
}

@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    doGet(req, resp);
}
```

```jsp
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>SUCCESS</h1>
</body>
</html>
```

## 6.7 HttpServletRequest

HttpServletRequest代表客户端的请求，用户通关Http协议访问服务器，HTTP请求中的所有信息会被封装到HttpServletRequest的方法，获取客户端的所有信息；

1.获取前端传递的参数，并请求转发

```java
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    req.setCharacterEncoding("UTF-8");
    resp.setCharacterEncoding("UTF-8");
    String user = req.getParameter("name");
    String pass = req.getParameter("pass");
    String[] hobbies = req.getParameterValues("hobbies");
    //后台接收中文乱码问题：
    System.out.println(user);
    System.out.println(pass);
    System.out.println(Arrays.toString(hobbies));

    //通过请求转发
    req.getRequestDispatcher("/Success.jsp").forward(req,resp);
}

@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    doGet(req, resp);
}
```

2.请求转发和重定向的区别

相同点：

* 页面都会实现跳转

不同点：

* 请求转发的时候URL不会产生变化	307
* 重定向时URL会发生变化    302

# 7、Cookie、Session

## 7.1  会话

**会话：**用户打开一个浏览器，点击了很多链接，访问多个web资源，关闭浏览器，这个过程可以称之为会话

**有状态会话：**一个同学来过教室，下次再来我们可以证明你曾经来过

你能怎么证明你是某校的学生？

你		学校

1. 学生证		学校给你
2. 学校登记	学校标记你来过

一个网站怎么证明你来过？

客户端		服务端

1. 服务端给客户端一个“信件”，客户端下次访问服务端带上“信件”就行了；cookie
2. 服务端登记你来过了，下次你来的时候我匹配你；session

## 7.2 保存会话的两种技术

**cookie**

* 客户端技术（响应，请求）

**session**

* 服务器技术，利用这个技术可以保存用户的会话信息，我们可以把信息或数据放在Session中

常见例子：网站登录过后，你下次访问不用再登陆

## 7.3 Cookie

1. 从请求中拿到cookie信息
2. 服务器响应给客户端

```java
req.getCookies();				//获得cookie
cookie.getName();				//获得cookie中的key
cookie.getValue();				//获得cookie中的value（值）
new Cookie("name",value);		//新建一个cookie
cookie.setMaxAge(60*60*24);		//设置cookie的有效期
resp.addCookie(cookie);			//响应给客户端一个cookie
```

**cookie一般会保存在用户文件夹目录下的AppDate中**

一个网站cookie是否存在上限？

* 一个cookie只能保存一个信息
* 一个web站点可以给浏览器发送多个cookie，最多存在20个cookie
* 浏览器上限大约为300个
* Cookie大小有限制，为4kb

**删除cookie**

* 不设置有效期，关闭浏览器，自动生效
* 设置有效期时间为0

## 7.4 Session（重点）

什么是Session：

* 服务器会给每一个用户（浏览器）创建一个Session对象
* 一个Session独占一个浏览器，只要浏览器没有关闭，这个Session就存在
* 用户登录之后，整个网站它都可以访问》》》保存购物车的信息....

```java
HttpSession
getCreationTime
getId
getLastAccessedTime
getServletContext
setMaxInactiveInterval
getMaxInactiveInterval
getSessionContext
getAttribute
getValue
getAttributeNames
getValueNames
setAttribute
putValue
removeAttribute
removeValue
invalidate
isNew
```

Session和Cookie的区别：

* Cookie是把用户的数据写给用户的浏览器，浏览器保存（可以保存多个）
* Session把用户的数据写到用户独占Session中，服务器端保存（保存重要信息，减少资源浪费）
* Session对象由服务器创建

使用场景：

* 保存一个用户登录的信息
* 购物车信息
* 在整个网站中，经常会使用的数据，我们将它保存在Session中

使用Session：

```java
package com.daotu.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class SessionDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //解决乱码
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charser=UTF-8");
        PrintWriter out = resp.getWriter();
        //得到Session
        HttpSession session = req.getSession();
        //给Session存放东西
        session.setAttribute("user",new User("violet","1234"));
        //获取session的ID
        String id = session.getId();
        //判断session是否新创建
        boolean aNew = session.isNew();
        if (aNew){
            out.write("session创建成功，ID为："+id);
            out.write((String) session.getAttribute("user"));
        }else {
            out.write("session已存在，ID为："+id);
        }
        //创建的时候做了什么？

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

```

```java
package com.daotu.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.SortedMap;

public class SessionDemo02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //解决乱码
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charser=UTF-8");
        PrintWriter out = resp.getWriter();

        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("user");
        out.write(user.toString());
        System.out.println(user);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

```

```java
package com.daotu.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class SessionDemo03 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //解决乱码
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charser=UTF-8");
        PrintWriter out = resp.getWriter();

        HttpSession session = req.getSession();
        session.removeAttribute("user");
        //手动注销Session
        session.invalidate();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

```

会话自动过期：

```xml
<!--    设置Session默认失效时间-->
    <session-config>
<!--        一分钟后session自动生效，以分钟为单位-->
        <session-timeout>1</session-timeout>
    </session-config>
```

# 8、JSP

## 8.1 什么是JSP

Java Server Pages：Java服务器页面，也和servlet一样用于开发动态web

**最大的特点：**

* 写JSP就像在写HTML
* 区别：
  * HTML只给用户提供静态数据
  * JSP页面中可以嵌入Java代码，为用户提供动态数据

## 8.2 JSP原理

**思路：**

JSP到底怎么执行的

* 代码层面没有问题

* 服务器内部工作

  tomcat中有一个work目录

  IDEA中使用tomcat会在IDEA中生成一个work目录

  C:\Users\zgf35\AppData\Local\JetBrains\IntelliJIdea2021.2\tomcat

  发现页面转变成了Java程序

  **浏览器向服务器发送请求，不管访问什么资源，其实都是在访问Servlet**

  JSP最终也会被转换成一个JavaWeb

  JSP本质上就是一个Servlet

  ```java
  public void _jspInit() {}		初始化
  public void _jspDestroy() {}	销毁
  public void _jspService() {}	JSPService
  ```

  1.判断请求

  2.内置一些对象

  ```Java
  final javax.servlet.jsp.PageContext pageContext;		//页面上下文
  javax.servlet.http.HttpSession session = null;			//session
  final javax.servlet.ServletContext application;			//applicationContext
  final javax.servlet.ServletConfig config;				//config
  javax.servlet.jsp.JspWriter out = null;					//out
  final java.lang.Object page = this;						//page：当前	
  HttpServletRequest request;								//请求
  HttpServletResponse response;							//响应
  ```

  3.页面输出增加的代码

  ```java
        response.setContentType("text/html");	//设置响应页面类型
        pageContext = _jspxFactory.getPageContext(this, request, response,
        			null, true, 8192, true);
        _jspx_page_context = pageContext;
        application = pageContext.getServletContext();
        config = pageContext.getServletConfig();
        session = pageContext.getSession();
        out = pageContext.getOut();
        _jspx_out = out;
  ```

  4.以上的这些个对象我们可以在JSP页面中直接使用

## 8.3 JSP的基本语法

任何语言都有自己的语法，JSP作为Java技术的一种应用，它有自己扩充的语法，Java所有的语法都支持
