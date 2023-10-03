package lessons.lesson30_sql.statement;

import lessons.lesson30_sql.model.Staff;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/po_2209", "root", null);
             Statement statement = cn.createStatement()) {

//            String query = "INSERT INTO staff(name, age,department,project) VALUE('employee11', 27,5,3)";
//            statement.execute(query);

            List<Staff> staff = new ArrayList<>();
            String query = "SELECT name, age, department, project FROM staff";
            ResultSet resultSet = statement.executeQuery(query);

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
