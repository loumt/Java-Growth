### Annotation

> #### java元注解

```
@Target

说明了Annotation所修饰的对象范围。
枚举类:ElementType
　　　　1.CONSTRUCTOR:用于描述构造器
　　　　2.FIELD:用于描述域
　　　　3.LOCAL_VARIABLE:用于描述局部变量
　　　　4.METHOD:用于描述方法
　　　　5.PACKAGE:用于描述包
　　　　6.PARAMETER:用于描述参数
　　　　7.TYPE:用于描述类、接口(包括注解类型) 或enum声明
```

```
@Retention

定义该Annotation被保留的时间长短。
枚举类:RetentionPolicy
　　　　1.SOURCE:在源文件中有效（即源文件保留）
　　　　2.CLASS:在class文件中有效（即class保留）
　　　　3.RUNTIME:在运行时有效（即运行时保留）
```

```
@Documented

用于描述其它类型的annotation应该被作为被标注的程序成员的公共API，因此可以被例如javadoc此类的工具文档化。Documented是一个标记注解，没有成员。
```

```
@Inherited

阐述了该注解是可以被继承的。
```

> #### java

```
@Resource

默认按名称装配。如果没有指定name属性，并且按照默认的名称仍然找不到依赖对象时，@Resource注解会回退到按类型装配。但一旦指定了name属性，就只能按名称装配了。
```

> #### jackson

```
@JsonIgnore

该注释定义在pojo的属性上，表示该对象序列化或反序列化时，该属性被忽略。
```

> #### spring

```
@Component

通用实体类注解
```

```
@Service

业务层组件，注册成实体对象
```

```
@Reponsitory

Dao层注解。
```

```
@Autowired

默认按类型装配。
```

```
@ResponseBody

该注解用于将Controller的方法返回的对象，通过适当的HttpMessageConverter转换为指定格式后，写入到Response对象的body数据区。
返回的数据不是html标签的页面，而是其他某种格式的数据时（如json、xml等）使用；
```

> #### spring mvc

@RestController

```
@RequestMapping

用来处理请求地址映射的注解。可用于类或方法之上。
value:实际请求的地址。数组类型,代表可以有多个地址映射。
method:请求的方式类型。RequestMethod枚举类。(Get,Post,Put,Delete等)
params:指定该请求中必须包含某些参数值，才可以被该方法处理。
produces:指定返回的内容类型，仅当request请求头中的Accept类型包含指定类型才返回
consumes:指定处理请求的提交内容类型(Content-Type),例如application/json,text/html
headers；指定request中必须包含某些指定的header值，才让该方法去处理请求。
```

@RequestParam

@PathVariable

@ControllerAdvice

> #### spring aop

#### 

> #### spring boot

@SpringBootApplication

@ComponentScan

@EnableAutoConfiguration

```
@ControllerAdvice

包含@Component。可以被扫描到。统一处理异常。
```

```
@ExceptionHandler(Exception.class)

用在方法上面表示遇到这个异常就执行以下方法。
```

> #### ibatis



> #### hibernate

@OneToOne

@OneToMany

@ManyToOne

