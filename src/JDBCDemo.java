import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo {
    public static void main(String[] args) {
        String URL =  "jdbc:mysql://localhost:3306/jdbcdemo";
        String username = "root";
        String password = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(URL , username , password);

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from student");

            while (resultSet.next()){
                System.out.println(resultSet.getString(1) + " " + resultSet.getInt(2));
                System.out.println(resultSet.findColumn("name"));
                System.out.println(resultSet.findColumn("name"));
                System.out.println(resultSet.getString(1));
                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getString(3));
                System.out.println(resultSet.getString(4));
                System.out.println(resultSet.getString(4));
            }
            connection.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}