package SDET;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;


public class ReadData {
public static void main(String[] args) throws Throwable {
	//step1:register/load the mysql databa
	
	//step2: get connect to database
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","root");
	
	//step3: create sql statement
	Statement stat=con.createStatement();
	String query="insert into student(regno,first_name,last_name,email)values('3','jam','gowda','hassan@gmail.com')";
	
	//step4: execute statement/query
	int result=stat.executeUpdate(query);
	
if(result==1) {
	System.out.println("user is created");
}else {
	System.out.println("user is not created");
}

	//step5:close the connection
	con.close();
}
}
