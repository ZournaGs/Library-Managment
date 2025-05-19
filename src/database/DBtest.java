package src.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBtest {
    private static final String URL = "jdbc:postgresql://localhost:5432/librarymanagment";
    private static final String USER = "postgres";
    private static final String PASSWORD = "G20028910@z";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("✅ Connected to PostgreSQL!");
        } catch (SQLException e) {
            System.err.println("❌ Connection failed: " + e.getMessage());
        }
    }
}
