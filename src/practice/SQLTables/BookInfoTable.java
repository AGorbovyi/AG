package practice.SQLTables;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookInfoTable {

    public static void main(String[] args) {

        final String sqliteDbUrl = "jdbc:sqlite:C:/Users/bushm/IdeaProjects/temp/sqlite_test.db";

        final String SQL_CREATE_TABLE = "CREATE TABLE IF NOT EXISTS book_info (" +
                "    book_info_id       INTEGER PRIMARY KEY AUTOINCREMENT," +
                "    is_in_library      BOOLEAN NOT NULL," +
                "    borrowed_to        INTEGER," +
                "    borrowed_date      DATE," +
                "    borrowed_duration  INTEGER," +
                "    return_date        DATE )";

        try (Connection connection = DriverManager.getConnection(sqliteDbUrl);
             Statement stmt = connection.createStatement()) {
            stmt.execute(SQL_CREATE_TABLE);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
