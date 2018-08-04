# EL语法
`${expression}`

`#{expression}`

## 关键字

`and eq gt true instanceof`

`or ne le false empty`

`not lt ge null div mod`

## [] 和.运算符

[] 是比较规范的形式
.运算符比较快捷

如果propertyName不是有效的Java变量名，只能使用[]运算符

## 取值规则

EL表达式的取值规则是从左到右进行的。

## 访问JavaBean对象

使用.或[]均可访问bean属性，如果该属性是一个带有属性的对象，那么同样也可以利用.或[]来访问第二个对象的属性。

## EL隐式对象

* pageContext

    1. 包含了其它九大对象:
    
        request response out
    
        session applicant config
    
        pageContext page 
    
        exception
    
    2. request中一些有用的属性
    
        characterEncoding  contentType  protocol
        
        remoteHost  remoteAddr  scheme  
        
        serverName  serverPort secure

* initParam
    
    这是一个包含所有环境初始化参数并用参数名作为key的Map
    
* param

    获取请求参数值
    
* paramValues
    
    获取一个请求参数的多个值，即使只有一个值也会返回一个数组
    
* header

    表示一个包含所有请求标题的Map
    
* headerValues

* cookies

    包含当前请求对象中所有Cookie对象的Map
    
* scope
    
## 使用其它EL运算符

1. 算术运算符
    
    `+  -  ×  /和div  %和mod`
    
    按优先级顺序计算

2. 关系运算符

    `==和eq  ！=和ne  >和gt  >=和ge  <和lt  <=和le`

3. 逻辑运算符

    `&&和and  ||和or  ！和not`
    
4. 条件运算符

    `${statement? A:B}`

5. `empty`运算符

    `${empty X}` 如果X为null，或者X是一个长度为0的字符串、空Collection、Array、Map
    
6. 字符串连接运算符

    `+=` 用于连接字符串
 
7. 分隔运算符

    `;` 用于分隔两个表达式
    
## 引用静态属性和静态方法

* 使用page伪指令导入类或类包。`java.lang`是一个例外。`<% @page import="java.time.*" %>`。
* 在ServletContextListener中以编程方式导入。

## 创建Set、List、Map

1. 创建Set
    
    `${{1, 2, 3, 4}}`
    
2. 创建List

    `${["elem1", "elem2", "elem3"]}`
    
3. 创建Map

    `${{"name" : "jack", "age" : 22}}`
    
## 访问列表元素和Map条目

`${list[i]}`

`${map[key]}`

## 操作集合

通过调用流方法将集合转换为流来使用 `${myList.stream()}`

1. `toList` 返回一个List
    
    `${[100, 200, 300].stream().toList()}`
    
2. `toArray` 返回一个Java数组

    `${["one", "two"].stream().toArray()}`
    
3. `limit` 限制流中元素的数量

    `[city1, city2, city3, city4]`
    
    `${cities.stream().limit(2).toList()}`
    
    `[city1, city2]`
    
4. `sort` 对流中的元素进行排序

    `${coties.stram().sorted().toList()}`
    
5. `average` 返回所有元素的平均值，需要使用`get()`方法获取实际值

    `${[1, 3, 5].stream().average().get()}`
    
6. `sum` 返回流中所有元素的总和

    `${[1, 3, 5].stream().sum()}`
    
7. `count` 返回流中元素的数量

    `${cities.stream().count()}`
    
8. `min` `max` 

10. `map` 将流中的每一个元素映射到另一个流中的另一个元素，并返回该流。此方法介绍一个lambda表达式。

    `${[1, 3, 5].stream().map(x -> 2*x).toList()}`
    
    `${cities.stream().map(x -> x.toUpperCase()).toList()}`
    
11. `filter` 根据lambda表达式过滤流中元素

    `${cities.stream().filter(x -> x.startWith("s")).toList()}`
    
12. `forEach` 遍历操作

    `${cities.stream().forEach(x -> sout(x)}`
    
## 格式化集合

## 格式化数字

`${String.format()}`

## 格式化日期

``