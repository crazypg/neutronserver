NeutronServer
==========================================
未采用展现层框架，数据持久层框架采用Mybatis，并采用其自动代码工具针对库表生成配套配置文件。</p>

###提供服务（所有servlet不处理get提交，只处理post提交）

###1、[ip]/login : 提供登陆服务
   描述：用户的注册和登陆    
   输入：ArrayList类型   
   
      位置0为操作类型，分别有 add,delete,update,query；  
      位置1为一个T_user 对象 
   
   返回：ArrayList类型   
   
      位置0为操作结果，ok 或者 error   
      位置1为返回值  
         add的返回值为刚插入的数据项的自增ID   
         delete,update的返回值为sql执行返回值，一般无意义；   
         query返回值为T_user对象，无为null   


###2、[ip]/passcode : 提供passcode相关服务   
   描述：60分钟内passcode不变，过期重新生成。   
   输入：ArrayList类型   
   
      位置0为操作类型，分别为 isvalid,getpasscode,login   
      位置1为一个T_user 对象   
         isvalid需要非空的 userid 和 passcode
         getpasscode需要非空的 areacode 和 phonenumber
         login需要非空的 areacode , phonenumber 和 passcode
      
   返回：ArrayList类型   
   
      位置0为操作结果
         对isvalid,有 valid（验证成功）,novalid（验证不成功）
         对getpasscode,有 new , registered , moreThanOneResult
         对login,有 ok , para Error , noResult , moreThanOneResult
      位置1为返回值   
         isvalid 操作没有返回值
         getpasscode,login 返回值为 T_user 对象   
         
         
###3、[ip]/data : 提供数据存储相关服务   
   描述：用于client上传本机数据。   
   输入：ArrayList类型   
   
      位置0为操作类型，分别为 upload
      位置1为一个ArrayList 对象   
         对于upload操作，该ArrayList所含元素是T_accdata，除t_accdata_id外都需要赋值
      
   返回：ArrayList类型   
   
      位置0为操作结果
         对upload,有 ok,error
