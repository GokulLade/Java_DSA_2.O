package JDBCPrograms.Statement.CRUDOperation;

import JDBCPrograms.DatabaseConnection.DatabaseConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {
    public static void main(String[] args) throws SQLException
    {
        //Create local variable
        Connection con=null;
        Statement stm=null;

//Step-1--->Establish the connection
        con= DatabaseConnection.getConnection();


//Step-2--->Crate Statement
        stm=con.createStatement();

//Step-4--->Execute the query
        stm.executeUpdate("update Student set id=6 where id=8");

//Step-5--->Process the Result
        System.out.println("Update Data...");

//Step-6--->close the resources
        con.close();
        stm.close();

    }
}
