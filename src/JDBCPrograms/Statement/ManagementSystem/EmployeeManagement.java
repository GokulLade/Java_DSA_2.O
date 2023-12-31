package JDBCPrograms.Statement.ManagementSystem;

//import sql package
import java.sql.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeManagement {

    //Declare variable
    private static final String url="jdbc:mysql://localhost:3306/Wipro";
    private static final String user="root";
    private static final String password="9112";

    public static void main(String[] args)
    {
        //Declare variable
        Connection con=null;
        Statement stm=null;

        //Create Scanner class ref
        Scanner sc=new Scanner(System.in);
        try{
            //Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        try {
            //Create Connection
            con= DriverManager.getConnection(url,user,password);

            //Create Statement
            stm=con.createStatement();

            while (true)
            {
                try
                {
                    System.out.println();
                    System.out.println();

                    //Option for user
                    System.out.println("-> -> -> -> WELCOME TO EMPLOYEE MANAGEMENT SYSTEM <- <- <- <-");
                    System.out.println();
                    System.out.println("1.Add Employee Information ");
                    System.out.println("2.Update Employee Information ");
                    System.out.println("3.Delete Employee Information ");
                    System.out.println("4.Display Employee Information ");
                    System.out.println("5.Exist Employee Management System Application");
                    int ch=sc.nextInt();

                    switch (ch) {
                        //Add Employee
                        case 1:
                            System.out.println("Please Enter The Name of Employee :");
                            String name = sc.next();

                            System.out.println("Please Enter Department of Employee :");
                            String department = sc.next();

                            System.out.println("Please Enter Salary of Employee :");
                            int salary = sc.nextInt();

                            String insertQuery = "insert into employeeinfo(name,department,salary) values('" + name + "','" + department + "'," + salary + ")";

                            int insert = stm.executeUpdate(insertQuery);

                            if (insert > 0) {
                                System.out.println("Data Inserted.... Thank You");
                            } else {
                                System.out.println("Data Not Inserted....Please try again");
                            }

                            break;

                        //Update Information
                        case 2:
                            System.out.println("Please Enter the Employee id which you can update");
                            int id = sc.nextInt();

                            System.out.println("Please Select the Field Name Which you want to update");
                            String updateFiled = sc.next();

                            if (updateFiled.equalsIgnoreCase("name")) {
                                System.out.println("Please Enter the new Value for name ");
                                String updateName = sc.next();

                                int updateN = stm.executeUpdate("update employeeinfo set name='" + updateName + "' where id=" + id + "");

                                if (updateN > 0) {
                                    System.out.println("Your Name is Updated.... Thank you ");
                                } else {
                                    System.out.println("Your Name is Not Updated.. Please try again ");
                                }
                            } else if (updateFiled.equalsIgnoreCase("Department")) {
                                System.out.println("Please Enter the new Value for Department ");
                                String updateDepartment = sc.next();

                                int updateD = stm.executeUpdate("update employeeinfo set department='" + updateDepartment + "' where id=" + id + "");

                                if (updateD > 0) {
                                    System.out.println("Your Department value is Updated.... Thank you ");
                                } else {
                                    System.out.println("Your Department value is Not Updated.. Please try again ");
                                }
                            } else if (updateFiled.equalsIgnoreCase("Salary")) {
                                System.out.println("Please Enter the new Value for Salary ");
                                int updateSalary = sc.nextInt();

                                int updateS = stm.executeUpdate("update employeeinfo set salary='" + updateSalary + "' where id=" + id + "");

                                if (updateS > 0) {
                                    System.out.println("Your Salary is Updated.... Thank you ");
                                } else {
                                    System.out.println("Your Salary is Not Updated.. Please try again ");
                                }
                            } else {
                                System.out.println("Please Enter the Valid Field");
                            }

                            break;
                        //Delete Record
                        case 3:
                            System.out.println("Please Enter the id of Employee which you want to Delete");
                            int idDelete = sc.nextInt();

                            String deleteQuery = "delete from employeeinfo where id=" + idDelete + "";

                            int delete = stm.executeUpdate(deleteQuery);

                            if (delete > 0) {
                                System.out.println("Record Deleted... Thank you");
                            } else {
                                System.out.println("Record Not Deleted.. Please try again");
                            }

                            break;
                        //Display Information
                        case 4:
                            ResultSet res = stm.executeQuery("select * from employeeinfo");
                            System.out.println("\t id \t Name \t Department \tSalary");
                            while (res.next()) {
                                int id1 = res.getInt(1);
                                String name1 = res.getString(2);
                                String Department1 = res.getString(3);
                                int salary1 = res.getInt(4);
                                System.out.println("\t " + id1 + "\t\t " + name1 + "\t\t" + Department1 + "\t\t" + salary1);
                            }
                            break;

                        //Exit Application
                        case 5:
                            return;

                        default:
                            System.out.println("Invalid input");
                    }

                }
                catch (InputMismatchException ie)
                {
                    System.out.println("Please Enter Numerical values");
                    break;
                }
            }


        }
        catch (SQLException se)
        {
            System.out.println(se.getMessage());
        }

        //Close Resources
        finally
        {
            try {
                con.close();
                stm.close();
                sc.close();
            }
            catch (SQLException e)
            {
                System.out.println(e.getMessage());
            }


        }
    }
}
