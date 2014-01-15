NeutronServer
==========================================
未采用展现层框架，数据持久层框架采用Mybatis，并采用其自动代码工具针对库表生成配套配置文件。</p>

###提供服务（所有servlet不处理get提交，只处理post提交）

###1、[ip]/login : 提供登陆服务
   描述：用户的注册和登陆       
         对于头像图片类型，服务器端只是记录，不做限制；      
         对于头像图片大小，服务器端限制最大上限，但应由client端限制   
   
   add方法：   
   输入：ArrayList类型，位置0 String "add" ; 位置1 T_user   
   返回：ArrayList类型，位置0 String ok 或者 error；位置1 sql执行返回值      
      
   delete方法：   
   输入：ArrayList类型，位置0 String "delete" ; 位置1 T_user，至少应对userid赋值   
   返回：ArrayList类型，位置0 String ok 或者 error；位置1 sql执行返回值   
   备注：并不是真正删除，而是将delreg置1   
   
   update方法：   
   输入：ArrayList类型，位置0 String "update" ; 位置1 T_user，至少应对userid赋值   
   返回：ArrayList类型，位置0 String ok 或者 error；位置1 sql执行返回值   
   备注：该方法不更新Blob类型列   
   
   updateWithBlob方法：   
   输入：ArrayList类型，位置0 String "updateWithBlob" ; 位置1 T_user，至少应对userid赋值   
   返回：ArrayList类型，位置0 String ok 或者 error；位置1 sql执行返回值   
   备注：该方法所有列   
   
   query方法：      
   输入：ArrayList类型，位置0 String "query" ; 位置1 T_user，至少应对userid赋值   
   返回：ArrayList类型，位置0 String ok 或者 error；位置1 T_user   
   
   queryWithCriteria方法：   
   输入：ArrayList类型，位置0 String "queryWithCriteria" ; 位置1 T_userExample   
   返回：ArrayList类型，位置0 String ok 或者 error；位置1 ArrayLIst<T_user>   
   备注：该方法返回Blob类型列
   
   saveavatar方法：   
   输入：ArrayList类型，   
         位置0 String "saveavatar" ;     
         位置1 String T_user，至少应对userid   
         位置2 byte[] 图片   
         位置3 为图片类型，如"jpg"   		  
   返回：ArrayList类型，位置0 String noUser,picTooLarge,saveOk,error   

   getavatar方法：   
   输入：ArrayList类型，位置0 String "getavatar" ; 位置1 T_user，至少应对userid赋值   
   返回：ArrayList类型，位置0 String ok,error，位置1 Byte[]类型 picture，位置2 String 后缀名   
   
   delavatar方法：   
   输入：ArrayList类型，位置0 String "delavatar" ; 位置1 T_user，至少应对userid赋值   
   返回：ArrayList类型，位置0 String noUser,delOk,error   

###2、[ip]/passcode : 提供passcode相关服务      
   描述：60分钟内passcode不变，过期重新生成。  
   
   isvalid方法：   
   输入：ArrayList类型，位置0 String "isvalid" ; 位置1 T_user，至少应对userid，passcode赋值   
   输出：ArrayList类型，位置0 String valid（验证成功）,novalid（验证不成功）   
   
   getpasscode方法：   
   输入：ArrayList类型，   
         位置0 String "getpasscode" ;    
         位置1 T_user，至少应对areacode，phonenumber赋值   
   输出：ArrayList类型，位置0 String new,registered,moreThanOneResult，位置1 T_user   
       
   login方法：   
   输入：ArrayList类型，位置0 String "login" ;    
         位置1 T_user，至少应对areacode , phonenumber 和 passcode赋值   
   输出：ArrayList类型，位置0 String  ok,para Error,noResult,moreThanOneResult   
         
###3、[ip]/data : 提供数据存储相关服务      
   描述：用于client上传本机数据。     
   
   upload方法：   
   输入：ArrayList类型，位置0 String "upload" ;    
         位置1 ArrayList<T_accdata> 元素T_accdata，除t_accdata_id外都需要赋值   
   输出：ArrayList类型，位置0 String  ok,error   
    
   getrmrbynum方法：   
   输入：ArrayList类型，位置0 String "getrmrbynum" ;    
         位置1 int userid；位置2 int num   
   输出：ArrayList类型，位置0 String  ok,input error,error；位置1 ArrayList<T_rmr>   
   备注：取userid的最近num个rmr数据   
       
   getrmrbydate方法：   
   输入：ArrayList类型，位置0 String "getrmrbydate" ;    
         位置1 int userid；位置2 data1；位置3 data2   
   输出：ArrayList类型，位置0 String  ok,input error，error；位置1 ArrayList<T_rmr>   
   备注：取userid的date1与date2之间的数据          
   
###4、[ip]/relation : 提供用户间相互关系的服务   

   add方法：      
   输入：ArrayList类型，位置0 String "add" ; 位置1 T_relation   
   返回：ArrayList类型，位置0 String ok 或者 error；位置1 sql执行返回值         
      
   delete方法：   
   输入：ArrayList类型，位置0 String "delete" ; 位置1 T_relation，至少应对masterid和salveid赋值      
   返回：ArrayList类型，位置0 String delOk,moreThanOneToDelete 或者 error；   
   			位置1 sql执行返回值(只有“delOk”状态有值)      
   备注：并不是真正删除，而是将delreg置1   
   
   update方法：   
   输入：ArrayList类型，位置0 String "update" ; 位置1 T_relation，至少应对id赋值      
   返回：ArrayList类型，位置0 String ok 或者 error；位置1 sql执行返回值   
   
   queryWithCriteria方法：   
   输入：ArrayList类型，位置0 String "queryWithCriteria" ; 位置1 T_relationExample   
   返回：ArrayList类型，位置0 String ok 或者 error；位置1 ArrayLIst<T_relation>   
   
