package JDBCPrograms.PreparedStatement;

import java.sql.*;

public class Read {
    public static void main(String[] args)
    {
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
            String readQuery = "select * from employee where id=?";

            //crete PreparedStatement
            PreparedStatement pr=con.prepareStatement(readQuery);
            pr.setInt(1,102);

            //execute query
            ResultSet res=pr.executeQuery();

            //Process Result
            while(res.next())
            {
                System.out.println("id = "+ res.getInt(1));
                System.out.println("Name = "+ res.getString(2));
                System.out.println("Name = "+ res.getInt(3));
            }

            //close resources
            con.close();
            pr.close();

        }
        catch (SQLException se)
        {
            System.out.println(se.getMessage());
        }
    }
}
