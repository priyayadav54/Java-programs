
package employee.management.system;
import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    public Conn(){
    try{
    Class.forName("oracle.jdbc.driver.OracleDriver");
    System.out.println("ok");
    c = DriverManager.getConnection("Jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","Priyadav@1432");
    s = c.createStatement();
    }catch(Exception e){
        e.printStackTrace();
        }
    
    }
}
