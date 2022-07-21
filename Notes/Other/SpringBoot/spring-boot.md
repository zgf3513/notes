源自：哔哩哔哩 狂神说

# Spring-boot

##  1、第一个Spring Boot程序

![image-20220408132020653](.\spring-boot.assets\image-20220408132020653.png)

## 2、原理初探

自动配置：

**pom.xml：**

* spring-boot-dependencies：核心依赖在父工程中
* 我们再写或者引入一些spring依赖的时候不需要指定版本，就因为这些在仓库中

**启动器：**

* ```xml
  <dependency>
              <groupId>org.springframework.boot</groupId>
              <artifactId>spring-boot-starter</artifactId>
          </dependency>
  ```

* 启动器：说白了就是spring boot的启动场景

* 比如spring-start-web会自动帮我们导入web环境所有的依赖

* springboot会将所有的功能场景变成一个个的启动器

* 如果我们要使用就只需要找到对应的启动器据可以了

**主程序：**

```java
// 程序的主入口 本身就是spring的一个组件
@SpringBootApplication
public class SpringBootStudy01Application {

    public static void main(String[] args) {
        // 将spring boot应用启动
        SpringApplication.run(SpringBootStudy01Application.class, args);
    }

}
```

* 注解：

  * ```java
    @SpringBootConfiguration	spring boot的配置
        @Configuration	spring配置类
        	@Component	说明也是一个spring配置组件
    @EnableAutoConfiguration	自动配置
        @AutoConfigurationPackage	自动配置包
       		@Import({Registrar.class})	导入选择器包注册
        @Import({AutoConfigurationImportSelector.class})	自动配置导入选择
        List<String> configurations = this.getCandidateConfigurations(annotationMetadata, attributes);	获取所有配置
    ```

    获取候选的配置

    ```java
    protected List<String> getCandidateConfigurations(AnnotationMetadata metadata, AnnotationAttributes attributes) {
            List<String> configurations = SpringFactoriesLoader.loadFactoryNames(this.getSpringFactoriesLoaderFactoryClass(), this.getBeanClassLoader());
            Assert.notEmpty(configurations, "No auto configuration classes found in META-INF/spring.factories. If you are using a custom packaging, make sure that file is correct.");
            return configurations;
        }
    ```

    META-INF/spring.factories：自动配置的核心文件

    ![image-20220408185707568](.\spring-boot.assets\image-20220408185707568.png)

    结论：springboot所有自动配置都是启动的时候扫描并加载，spring.factories所有的自动配置类都在这里面，但是不一定生效，要判断条件是否成立，只要导入了对于的start，就有对应的启动器了，有了启动器，我们的自动装配就会生效，然后配置成功

springboot在启动的时候，从类路径下META-INF/spring.factories获取指定的值

这些自动配置的类导入容器，自动配置就会生效，帮我们进行自动配置

以前我们需要自动的东西现在由springboot做了

整合JavaEE，解决方案和自动配置的东西都在spring-boot-autoconfigure-2.6.6.jar这个包下

它会把所有需要导入的组件以类名的方式返回，这些组件就会被添加到容器

容器中也会存在非常多的xxxAutoConfiguration的文件，就是这些文件给容器导入了这个场景的所有组件并自动配置，@Configuration，JavaConfig

有了自动配置类就免去了我们手动编写配置文件的工作了



关于springboot的理解

* 自动装配
* run()方法
  * 判断是普通项目还是web项目
  * 查找所有可用初始化器，设置到initializers属性中
  * 找出所有的应用程序监听器，设置到initializers属性中
  * 推断并设置main方法的定义类，找到运行的主类

全面接管springmvc的配置

