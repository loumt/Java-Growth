### Annotation

> java元注解

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

@Documented

@Inherited

> java

```
@Resource

默认按名称装配。如果没有指定name属性，并且按照默认的名称仍然找不到依赖对象时，@Resource注解会回退到按类型装配。但一旦指定了name属性，就只能按名称装配了。
```

> jackson

```
@JsonIgnore

该注释定义在pojo的属性上，表示该对象序列化或反序列化时，该属性被忽略。
```

> spring

@Bean

@Component

@Service

@Reponsitory

```
@Autowired

默认按类型装配。
```

@ResponseBody

@Configuration

@Qualifier

> spring mvc

@RestController

@RequestMapping

@RequestParam

@PathVariable

@ControllerAdvice

> spring aop
>
> spring boot

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

> ibatis
>
> hibernate

@OneToOne

@OneToMany

@ManyToOne

