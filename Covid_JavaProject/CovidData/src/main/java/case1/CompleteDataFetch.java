package case1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CompleteDataFetch {
 

public static void main(String[] args) throws ClassNotFoundException, SQLException{
Class.forName("org.postgresql.Driver");

 

Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/covid","postgres","ritikaSQL");

 

PreparedStatement stmt = conn.prepareStatement("select * from coviddatatable");

 

ResultSet result=stmt.executeQuery();
while (result.next()) {
System.out.println(result.getString(1) + " " + result.getString(2)+ " " + result.getString(3)+ " " + result.getString(4)+ " " + result.getString(5)+ " " + result.getString(6));
}
conn.close();
}
}