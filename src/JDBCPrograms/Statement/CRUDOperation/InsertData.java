package JDBCPrograms.Statement.CRUDOperation;

//Import my DatabaseConnection Package
import JDBCPrograms.DatabaseConnection.DatabaseConnection;

//Import sql Package
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {

       //Create local variable
        Connection con;
        Statement stm;

//Step-1--->Load and Register the Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

//Step-2--->Establish the connection
        con= DatabaseConnection.getConnection();

//Step-3--->Crate Statement
        stm=con.createStatement();

//Step-4--->Execute the query
        stm.executeUpdate("insert into student(rollNo, name, mark) values (105,'Nagesh',90)");

//Step-5--->Process the Result
        System.out.println("Data Inserted...");

//Step-6--->close the resources
        con.close();
        stm.close();
    }
}
