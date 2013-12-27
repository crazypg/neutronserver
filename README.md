neutronserver
=============
neutron的server端
-------------
未采用展现层框架，数据持久层框架采用Mybatis，并采用其自动代码工具针对库表生成配套配置文件。

###提供服务（所有servlet不处理get提交，只处理post提交）：
1、[ip]/login : 提供登陆服务
   描述：用户的注册和登陆
   输入：ArrayList类型
         位置0为操作类型，分别有 add,delete,update,query；
         位置1为一个T_user 对象
   返回：ArrayList类型
         位置0为操作结果，ok 或者 error
         位置1为返回值，add,delete,update的返回值为sql执行返回值，一般无意义；query返回值为T_user对象，无为null
         
         
         
2、[ip]/getpasscode : 提供获取passcode服务
   描述：获取用户的passcode。60分钟内passcode不变，过期重新生成。
   输入：ArrayList类型
         位置0为操作类型，为 getpasscode
         位置1为一个T_user 对象
   返回：：ArrayList类型
         位置0为操作结果，ok 或者 error
         位置1为返回值
