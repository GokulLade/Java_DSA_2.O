package JDBCPrograms.CRUDOperation;

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
        Connection con=null;
        Statement stm=null;

//Step-1--->Load and Register the Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

//Step-2--->Establish the connection
        con= DatabaseConnection.getConnection();

//Step-3--->Crate Statement
        stm=con.createStatement();

//Step-4--->Execute the query
        stm.executeUpdate("insert into student(rollNo, name, mark) values (107,'Akash',65)");

//Step-5--->Process the Result
        System.out.println("Data Inserted...");

//Step-6--->close the resources
        con.close();
        stm.close();
    }
}
