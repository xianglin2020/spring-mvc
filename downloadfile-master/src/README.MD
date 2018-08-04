1. 对请求处理方法使用void返回类型，并在方法中添加HttpServletResponse参数。
2. 将响应的内容类型设为文件的内容类型。（另存为--> APPLICATION/OCTET-STREAM）
3. 添加一个名为Content-Disposition的HTTP响应标题，并赋值attachment。

使用Java NIO的File.Copy()方法