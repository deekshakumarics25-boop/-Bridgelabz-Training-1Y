package com.gla;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/school";
        String user = "root";
        String pwd = "Richa123@";

        String selectteacher = "Select * from teacher";

      // String createTable = "create table teacher (id int primary key auto_increment, name varchar(20), department varchar(20))";

        String insertData = "Insert into teacher(name, department) values('Krunal', 'Operations'), ('Amit', 'PowerBI')";

        String dropTable = "drop table teacher";

        try (Connection con = DriverManager.getConnection(url, user, pwd);
             Statement stmt = con.createStatement()) {

        //    int rowsUpdated1 = stmt.executeUpdate(createTable);
            int rowsUpdated2 = stmt.executeUpdate(insertData);

            boolean res1 = stmt.execute(insertData);

            if (res1) {
                ResultSet rs = stmt.getResultSet();
                while (rs.next()){
                    System.out.println("id:"+rs.getInt("id"));
                    System.out.println("name:"+rs.getString("name"));
                    System.out.println("department:"+rs.getString("department"));
                }
            }else{
                int rowsUpdated= stmt.getUpdateCount();
            }
            try (ResultSet rs = stmt.executeQuery(selectteacher)) {
                while (rs.next()) {
                    System.out.println("id : " + rs.getInt("id"));
                    System.out.println("name : " + rs.getString("name"));
                    System.out.println("department : " + rs.getString("department"));
                }

            }
            int drop = stmt.executeUpdate(dropTable);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
