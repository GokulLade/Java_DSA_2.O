package JDBCPrograms.CRUDOperation;

import JDBCPrograms.DatabaseConnection.DatabaseConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadData
{
    public static void main(String[] args) throws SQLException
    {
        Connection con=null;
        Statement stm=null;
        ResultSet result=null;

//Step-1--->Establish the connection
        con=DatabaseConnection.getConnection();


//Step-2--->Crate Statement
        stm=con.createStatement();

//Step-4--->Execute the query
        result=stm.executeQuery("select * from Student");

//Step-5--->Process the Result
        while(result.next())
        {
            System.out.println("\t\tid\t\trollNo\t\tname\t\tmark");
            System.out.println("\t\t"+result.getInt(1)+"\t\t "+result.getInt(2)+"\t\t"
                                +result.getString(3)+"\t\t"+result.getInt(4));
        }

//Step-6--->close the resources
        con.close();
        stm.close();
    }


}
