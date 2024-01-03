package JDBCPrograms.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
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
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Infosys","root","9112");

            //insert query
            String insertQuery="Insert into employee(id, name, salary) values(?,?,?)";

            //create preparedStatement
            PreparedStatement pr=con.prepareStatement(insertQuery);

            //insert data
            pr.setInt(1,106);
            pr.setString(2,"Shyam");
            pr.setInt(3,47000);

            //execute query
            int insert=pr.executeUpdate();

            if(insert>0)
            {
                System.out.println("Data Inserted... Thank you");
            }
            else {
                System.out.println("Data Not Inserted... Try again");
            }

            //close the resources
            con.close();
            pr.close();

        }
        catch (SQLException se)
        {
            System.out.println(se.getMessage());
        }
    }
}
