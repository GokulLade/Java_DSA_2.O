package JDBCPrograms.PreparedStatement.CRUDOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
    public static void main(String[] args) {
        //Load the Driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException ce)
        {
            System.out.println(ce.getMessage());
        }

        //create connection
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Infosys", "root", "9112");

            //insert query
            String deleteQuery = "Delete from employee where id=?";

            //crete PreparedStatement
            PreparedStatement pr=con.prepareStatement(deleteQuery);

            //Set Values
            pr.setInt(1,106);

            //execute query
            int delete=pr.executeUpdate();

            if(delete>0)
            {
                System.out.println("Data Deleted... Thank You");
            }
            else
            {
                System.out.println("Data Not Deleted.. try Again");
            }
        }
        catch (SQLException se)
        {
            System.out.println(se.getMessage());
        }
    }
}
