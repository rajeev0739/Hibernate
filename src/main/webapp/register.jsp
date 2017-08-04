<%@page import="com.rajeev.dao.UserDao"%>
<jsp:useBean id="obj" class="com.rajeev.persistent.User">
</jsp:useBean>  <jsp:setProperty property="*" name="obj"/>  
<%  
int i=UserDao.register((com.rajeev.persistent.User)obj);  
if(i>0)  
out.print("You are successfully registered");  
  
%>  