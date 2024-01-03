package JDBCPrograms.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
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
            String updateQuery = "update employee set name=? where id=?";

            //Crete PreparedStatement
            PreparedStatement pr=con.prepareStatement(updateQuery);

            //set values
            pr.setString(1,"Ganesh");
            pr.setInt(2,104);

            //execute query
            int update=pr.executeUpdate();

            if(update>0)
            {
                System.out.println("Data Updated... Thank you");
            }
            else
            {
                System.out.println("Data not Update... Try Again");
            }

        }
        catch (SQLException se)
        {
            System.out.println(se.getMessage());
        }
    }
}
