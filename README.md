## 此项目采用spring boot整合myBatis
* 1、项目结构：src/main/java为源代码；resources为一些配置文件和静态资源文件如html、js等。程序源码下有controller包，用来处理前端发送过来的请求；entity包为表结构映射的类，实现表结构到对象属性的一一对应；service为实际业务处理过程，这里为数据库的基本操作；mapper包为具体数据库操作对应方法，即可通过调用类的方法实现数据库的增删改查操作。
* 2、resources目录下的application.properties文件为项目的配置文件，这里将其修改为application.yml，会更简洁。其中包含jdbc、myBatis以及springboot端口等配置。
* 3、在整合myBatis时需要一个bean，其属性与表格的字段一一对应，实现表转换为对象。
* 4、配置myBatis可以使用xml文件，也可以使用mapper注解形式,其目的为实现sql语句映射为基本的类方法的操作。在mapper包中新建一个接口类，给该接口标注Mapper,然后对借口的每个抽象方法添加查询、更新、插入等数据库操作的注释。最后在springboot文件中添加MapperScan注释，扫描指定的包。
* 5、clone下来项目需要修改application.yml,添加postgresql数据库地址，用户名密码等，即可运行。
* 6、配置util下的CorsConif类，实现springboot运行跨域访问
