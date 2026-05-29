// 32. Insert and Update Operations in JDBC
// Objective: Perform insert/update SQL queries from Java.
// Task: Add and modify student data using JDBC.
// Instructions:
// o Create a StudentDAO class.
// o Implement methods to insert new records and update student details.
// o Use PreparedStatement for parameterized queries.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
class StudentDAO {
    Connection con;
    StudentDAO() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb",
                "root",
                "root123"
            );
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
    void insertStudent(int id, String name, int age) {
        try {
            String query = "INSERT INTO students VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, age);
            ps.executeUpdate();
            System.out.println("Student record inserted successfully.");
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
    void updateStudent(int id, String name) {
        try {
            String query = "UPDATE students SET name = ? WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, name);
            ps.setInt(2, id);
            ps.executeUpdate();
            System.out.println("Student record updated successfully.");
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class JDBCInsertUpdate {
    public static void main(String[] args) {

        // Create a StudentDAO class object
        StudentDAO dao = new StudentDAO();

        // Insert new student record
        dao.insertStudent(4, "Bhuvan", 20);

        // Update student details
        dao.updateStudent(4, "Bhuvan Kumar");
    }
}