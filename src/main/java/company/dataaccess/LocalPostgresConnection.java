package company.dataaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LocalPostgresConnection extends MyConnection{
    public static Connection connection = null;

    //The static block is used to preempt the data base connection
    static {
        try {
            DriverManager.registerDriver(new org.postgresql.Driver());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public LocalPostgresConnection() {
        this.url = "jdbc:postgresql://localhost:5432/postgres";
        this.username = "postgres";
        this.password = "enter123";
        this.schema = "inventoryapp";

        testDBConnection();
    }

    public void testDBConnection(){
        try{
            // tests if database is connected
            System.out.println("connecting to "+schema+"....");

            this.connection=getConnection();

            if(connection != null) {
                System.out.println("Connection Successful");
                //call the application
            } else {
                System.out.println("Connection failed");
            }
        } catch(SQLException s){
            s.printStackTrace();
        } finally {
            if(connection != null) {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    // this will only happen if the connection has already been closed
                    throwables.printStackTrace();
                }
            }

        }

    }

    @Override
    public Connection getConnection() throws SQLException {
        Connection connect = null;
        try{
            connect = DriverManager.getConnection(url,username,password);}
        catch (SQLException throwables){
            // this will only happen if the connection has already been closed
            throwables.printStackTrace();
        }
        return connect;
    }
}
