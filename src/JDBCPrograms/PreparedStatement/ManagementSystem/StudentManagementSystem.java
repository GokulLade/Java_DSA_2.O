package JDBCPrograms.PreparedStatement.ManagementSystem;

import java.sql.*;
import java.util.Scanner;

public class StudentManagementSystem {

    private static final String url="jdbc:mysql://localhost:3306/college";
    private static final String userName="root";
    private static final String password="9112";

    public static void main(String[] args)
    {
        //Create ref
        Connection con;
        PreparedStatement pr;

        Scanner sc=new Scanner(System.in);

        //load the Driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException ce)
        {
            System.out.println(ce.getMessage());
        }

        //crete connection
        try {
            con= DriverManager.getConnection(url,userName,password);

            while(true)
            {
                System.out.println();
                System.out.println("-> -> -> -> -> STUDENT MANAGEMENT SYSTEM <- <- <- <- <-");
                System.out.println();
                System.out.println();

                System.out.println("1. Add Student Information ");
                System.out.println("2. Update Student Information ");
                System.out.println("3. Delete Student Information ");
                System.out.println("4. View Student Information ");
                int ch=sc.nextInt();

                switch (ch)
                {

                    case 1:

                        //Insert Data
                        System.out.println("Enter Student Roll Number ");
                        int rollNo=sc.nextInt();

                        System.out.println("Enter Student name ");
                        String name=sc.next();

                        System.out.println("Enter Student Mark ");
                        double mark=sc.nextDouble();

                        String insertQuery="insert into student(rollNo, name, mark) values (?,?,?)";

                        pr=con.prepareStatement(insertQuery);

                        pr.setInt(1,rollNo);
                        pr.setString(2,name);
                        pr.setDouble(3,mark);

                        int insert=pr.executeUpdate();

                        if(insert>0)
                        {
                            System.out.println("Data Inserted... Thank you");
                        }
                        else
                        {
                            System.out.println("Data Not Inserted... Try again");
                        }

                        break;

                    case 2:

                        //Update Data
                        System.out.println("Enter the Student id which you want update");
                        int id=sc.nextInt();
                        System.out.println("Please Select the Filed name which you want to update");
                        System.out.println("1. RollNumber");
                        System.out.println("2. Name");
                        System.out.println("3. Mark");
                        int uCh=sc.nextInt();
                        switch (uCh)
                        {
                            case 1:
                                System.out.println("Please enter the new value for RollNumber");
                                int updateRollNo=sc.nextInt();

                                String updateQuery1="update student set rollNo=? where id=?";

                                pr=con.prepareStatement(updateQuery1);

                                pr.setInt(1,updateRollNo);
                                pr.setInt(2,id);

                                int update1=pr.executeUpdate();

                                if(update1>0)
                                {
                                    System.out.println("Data Updated... Thank you");
                                }
                                else
                                {
                                    System.out.println("Data not Updated.. Try again");
                                }
                                break;

                            case 2:
                                System.out.println("Please enter the new Name ");
                                String updateName=sc.next();

                                String updateQuery2="update student set name=? where id=?";

                                pr=con.prepareStatement(updateQuery2);

                                pr.setString(1,updateName);
                                pr.setInt(2,id);

                                int update2=pr.executeUpdate();

                                if(update2>0)
                                {
                                    System.out.println("Data Updated... Thank you");
                                }
                                else
                                {
                                    System.out.println("Data not Updated.. Try again");
                                }
                                break;

                            case 3:
                                System.out.println("Please enter the new value for Mark");
                                double updateMark=sc.nextDouble();

                                String updateQuery3="update student set mark=? where id=?";

                                pr=con.prepareStatement(updateQuery3);

                                pr.setDouble(1,updateMark);
                                pr.setInt(2,id);

                                int update3=pr.executeUpdate();

                                if(update3>0)
                                {
                                    System.out.println("Data Updated... Thank you");
                                }
                                else
                                {
                                    System.out.println("Data not Updated.. Try again");
                                }
                                break;

                            default:
                                System.out.println("Invalid input");

                        }
                        break;

                    case 3:

                        //Delete Data
                        System.out.println("Enter the student id which you want to delete");
                        int deleteId=sc.nextInt();

                        String deleteQuery="delete from student where id=?";
                        pr=con.prepareStatement(deleteQuery);
                        pr.setInt(1,deleteId);

                        int delete=pr.executeUpdate();

                        if(delete>0)
                        {
                            System.out.println("Data Deleted.. Thank you");
                        }
                        else
                        {
                            System.out.println("Data not Deleted.. Try again");
                        }
                        break;

                    case 4:

                        //View Data
                        String readQuery="select * from student";

                        pr=con.prepareStatement(readQuery);

                        ResultSet res=pr.executeQuery();

                        System.out.println("   id   RollNo   Name   Mark ");
                        while (res.next())
                        {
                            System.out.print("   "+res.getInt(1));
                            System.out.print("     "+res.getInt(2));
                            System.out.print("   "+res.getString(3));
                            System.out.print("   "+res.getDouble(4));
                        }

                        break;

                    default:
                        System.out.println("Invalid Input");
                }

            }

        }
        catch (SQLException se)
        {
            System.out.println(se.getMessage());
        }
    }
}
