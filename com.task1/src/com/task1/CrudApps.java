package com.task1;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudApps 
{
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://@localhost:3306/task","root","root");
		Statement st=con.createStatement();
		System.out.println("1: to create a table");
		System.out.println("2: to insert values into the table");
		System.out.println("3: to update values in the table");
		System.out.println("4:to read values in the table");
		System.out.println("5: to delete rows from a table");
		System.out.println("6: if you want to proceed second time");
		System.out.println("Select your option");
		
		
		//st.executeUpdate("create table student(st_id int,st_name varchar(20),branch varchar(20)"));
		
		
	  Scanner sc=new Scanner(System.in);
	  int option = sc.nextInt();
	  sc.nextLine();
	  switch(option)
	{
		case 1: 
			{
				System.out.println("you have selected option 1 to create table");
				
				String create=sc.nextLine();
				st.executeUpdate(create);
				System.out.println("you have successfully created the table");
				break;
		   }
		case 2:
			{
				System.out.println("you have selected option 2 to insert values into the table");
				System.out.println("enter student id");
				int st_id=sc.nextInt();
				sc.nextLine();
				System.out.println("enter student name");
				String st_name=sc.nextLine();
				System.out.println("enter branch of the student");
				String branch=sc.nextLine();
				String insertQuery = "insert into employee (st_id, st_name, branch) VALUES (?, ?, ?)";

                PreparedStatement preparedStatement = con.prepareStatement(insertQuery);
                preparedStatement.setInt(1, st_id);
                preparedStatement.setString(2, st_name);
                preparedStatement.setString(3, branch);

                preparedStatement.executeUpdate();
                preparedStatement.close();

                
				System.out.println("you have successfully inserted values into the table");
				break;
								
			 }
		case 3:
		    System.out.println("You have selected option 3 to update values in the table");
		    System.out.println("Enter student id to update:");
		    int st_idToUpdate = sc.nextInt();
		    sc.nextLine();
		    System.out.println("Enter new student name:");
		    String new_st_name = sc.nextLine();
		    System.out.println("Enter new branch of the student:");
		    String new_branch = sc.nextLine();

		    // Assuming 'employee' is the actual name of your table
		    String updateQuery = "UPDATE employee SET st_name = ?, branch = ? WHERE st_id = ?";

		    PreparedStatement preparedStatement = con.prepareStatement(updateQuery);
		    preparedStatement.setString(1, new_st_name);
		    preparedStatement.setString(2, new_branch);
		    preparedStatement.setInt(3, st_idToUpdate);

		    int rowsAffected = preparedStatement.executeUpdate();

		    if (rowsAffected > 0) {
		        System.out.println("You have successfully updated values in the table");
		    } else {
		        System.out.println("No rows were updated. Student ID not found.");
		    }

		    preparedStatement.close();

		    break;
		case 4:
		    System.out.println("You have selected option 4 to read the data in the table");

		    // Assuming 'employee' is the actual name of your table
		    String selectQuery = "SELECT * FROM employee";

		    ResultSet resultSet = st.executeQuery(selectQuery);
		    System.out.println("Student ID\tStudent Name\tBranch");

		    while (resultSet.next()) {
		        int st_id = resultSet.getInt("st_id");
		        String st_name = resultSet.getString("st_name");
		        String branch = resultSet.getString("branch");

		        System.out.println(st_id + "\t\t" + st_name + "\t\t" + branch);
		    }

		    resultSet.close();
		case 5:
		    System.out.println("You have selected option 5 to delete rows from the table");
		    System.out.println("Enter student id to delete:");

		    int st_idToDelete = sc.nextInt();
		    sc.nextLine();

		    // Assuming 'employee' is the actual name of your table
		    String deleteQuery = "DELETE FROM employee WHERE st_id = ?";

		    PreparedStatement preparedStatement1 = con.prepareStatement(deleteQuery);
		    preparedStatement1.setInt(1, st_idToDelete);

		    int rowsAffected1 = preparedStatement1.executeUpdate();

		    if (rowsAffected1 > 0) {
		        System.out.println("You have successfully deleted the row");
		    } else {
		        System.out.println("No rows were deleted. Student ID not found.");
		    }

		    preparedStatement1.close();

		    break;


		   

		default :
		{
			System.out.println("invalid option selected");
				
				
			}
	}
		con.close();
			
	}
}
