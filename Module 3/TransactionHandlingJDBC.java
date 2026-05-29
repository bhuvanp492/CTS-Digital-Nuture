// 33. Transaction Handling in JDBC
// Objective: Use JDBC transactions.
// Task: Simulate a money transfer between two accounts.
// Instructions:
// o Create accounts table with balances.
// o Implement a transfer method with Connection.setAutoCommit(false).
// o Commit if both debit and credit succeed, else rollback.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
class BankTransaction {
    Connection con;
    BankTransaction() {
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
    void transfer(int fromAccount, int toAccount, double amount) {

        try {
            con.setAutoCommit(false);
            String debitQuery = 
                "UPDATE accounts SET balance = balance - ? WHERE id = ?";
            PreparedStatement debitStmt = 
                con.prepareStatement(debitQuery);

            debitStmt.setDouble(1, amount);
            debitStmt.setInt(2, fromAccount);
            debitStmt.executeUpdate();
            String creditQuery = 
                "UPDATE accounts SET balance = balance + ? WHERE id = ?";
            PreparedStatement creditStmt = 
                con.prepareStatement(creditQuery);

            creditStmt.setDouble(1, amount);
            creditStmt.setInt(2, toAccount);
            creditStmt.executeUpdate();
            con.commit();
            System.out.println("Money transferred successfully.");
        } 
        catch (Exception e) {
    System.out.println(e); 
    try {
        con.rollback();
        System.out.println("Transaction failed. Rolled back.");
    } 
    catch (Exception ex) {
        System.out.println(ex);
    }
}
    }
}
public class TransactionHandlingJDBC {
    public static void main(String[] args) {
        BankTransaction bank = new BankTransaction();
        bank.transfer(1, 2, 500);
    }
}