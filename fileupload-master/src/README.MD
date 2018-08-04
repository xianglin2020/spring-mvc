* 将HTML表格的enctype属性值设置为multipart/form-data

* multiple 启用多文件上传

## MultipartFile 接口

   1. getByte()
   2. getContentType()
   3. getInputStream()
   4. getName()
   5. getOriginalFilename()
   6. getSize()
   7. isEmpty()
   8. transferTo()
   
## MultipartConfig注解



***当使用@RequestMapping返回值为void时，会自动跳到对应的视图。[这样会导致，找不到响应视图]***
