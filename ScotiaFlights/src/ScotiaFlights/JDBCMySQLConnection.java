package ScotiaFlights;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class JDBCMySQLConnection 
{
	//static reference to itself jdbcdb
    private static JDBCMySQLConnection instance = new JDBCMySQLConnection();
    public static final String URL = "jdbc:mysql://comp-server.uhi.ac.uk/pe09004012";
    public static final String USER = "pe09004012";
    public static final String PASSWORD = "struangallacher";
    public static final String DRIVER_CLASS = "com.mysql.jdbc.Driver"; 
     
    //private constructor
    private JDBCMySQLConnection() {
        try {
            //Step 2: Load MySQL Java driver
            Class.forName(DRIVER_CLASS);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    
     
    private Connection createConnection() {
 
        Connection connection = null;
        try {
            //Step 3: Establish Java MySQL connection
            connection = DriverManager.getConnection(URL, USER,PASSWORD);
        } catch (SQLException e) {
            System.out.println("ERROR: Unable to Connect to Database.");
        }
        return connection;
    }   
     
   
    public static Connection getConnection() 
    {
        return instance.createConnection();
    }
    
    public static void createTable()throws Exception{
        try{
            Connection connection = getConnection();
            PreparedStatement create = null;
connection.prepareStatement("CREATE TABLE IF NOT EXISTS flight(flightnos varchar(5) NOT NULL, seatnos int(2), status varchar(5) NOT NULL, passengertype varchar(8) NOT NULL, passengername varchar(30) NOT NULL, passengeremail varchar(15) NOT NULL, PRIMARY KEY(flightnos))");
            
            create.executeUpdate();
        }catch(Exception e){System.out.println(e);}
            finally{System.out.println("function complete");}
        }

    private static class connection {

        public connection() {
        }
    }
    }

