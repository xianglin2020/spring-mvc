# JSTL 库

JSTL 是标准标签库，但它通过多个标签来暴露其行为。

|区域|子函数|URL|前缀|
|:-|:-|:-|:-|
|核心|变量支持、流量控制、URL管理|core|c|
|XML|核心、流控制、转换|xml|x|
|国际化|语言区域、消息格式化、数字和日期格式化|fmt|fmt|
|数据库|SQL|sql|sql|
|函数|集合长度、字符串操作|functions|fn|

使用taglib引入库

`<%@ taglib uri="uri" prefix="prefix" %>"`

# 一般行为

`out set remove`

* `out`

    `<c:out value="${x}"` 等效与 `${x}`

* `url`

    * 如果当前上下文路径为"/"，则它将空紫都城附加到该路径
    * 如果不是"/",它会将上下文添加到指定路径

* `set`

    * 创建一个字符串
    * 创建一个引用
    * 设置有界对象的属性

    `<c:set var="varName" value="value" [scope]/>`
    
    ```xml
    <c:set var="varName" [scope]> 
      body content
    </c:set>
    ```
    
* `remove`

    删除有界变量
    
    `<c:remove var="job" scope="page"/>`
    
# 条件行为

* `if`
* `choose when otherwise`

# 遍历行为

* `forEach`
* `forTokens`

# 格式化行为

* `formatNumber`
* `formatDate`
* `timeZone`
* `setTimeZone`
* `parseNumber`
* `parseDate`

# 函数

* `contains`
* `containsIgnoreCase`
* `endsWith`
* `escapeXml`
* `indexOf`
* `join`
* `length`
* `replace`
* `spilt`
* `startsWith`
* `substring`
* `substringAfter`
* `substringBefore`
* `toLowerCase`
* `toUpperCase`
* `trim`
