# ssmdemo
Spring + SpringMVC + Mybatis + FreeMarker 整合示例，201710最新版
201710最新版： spring 4.3.12 , mybatis: 3.4.5 , FreeMarker : 2.3.26
 两个简单的文档在文件夹docs中。

使用步骤： 
1、用MyEclipse 或者 Eclipse 导入 project

2、执行 ssmdemo_mysql.sql恢复数据库 [开发环境 mysql 5.7]

3、修改 jdbc.properties文件，用户名及密码修改为本机mysql的配置

4、发布到tomcat里运行,[ 开发运行环境： jdk 1.8 ， tomcat 8.5]

5、演示了3个整合后的功能
  1） 以ModelView返回页面，演示的id数据可以为 1，2，3之一
    URL: http://localhost:8080/ssmdemo/user/list?id=1
    
  2）以json返回。做后台接口使用的方式。演示的id数据可以为 1，2，3之一
    URL: http://localhost:8080/ssmdemo/user/list2?id=1
    
  3）以 FreeMarker模板页面返回，演示的数据为程序拼装的
    URL: http://localhost:8080/ssmdemo/freemarker/demo001?a=1
    
  具体请看  Controller 即可。
                          
  希望能为大家的开发工作  节省时间  提高效率。 
