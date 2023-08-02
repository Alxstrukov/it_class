package lesson30_sql.prepared;

import lesson30_sql.model.Staff;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/po_2209";
    private static final String USER = "root";
    private static final String PASS = null;

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String query = "SELECT name, age, department, project FROM staff WHERE age > ? AND department = ?";

        try (Connection cn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement ps = cn.prepareStatement(query)) {
            List<Staff> staff = new ArrayList<>();
            ps.setInt(1, 20);
            ps.setInt(2, 3);
            ResultSet resultSet = ps.executeQuery(); //объект данного класса это оображение виртуальной таблицы

            while (resultSet.next()) {
                String name = resultSet.getString(1);
                int age = resultSet.getInt("age");
                int department = resultSet.getInt("department");
                int project = resultSet.getInt(4);
                staff.add(new Staff(name, age, department, project));
            }
            staff.forEach(System.out::println);


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
