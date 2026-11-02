package Config;

import java.sql.*;

public class db_Connection {

    // Conexion a Azure 
    static String URL = "jdbc:sqlserver://hnboptica.database.windows.net:1433;"
            + "databaseName=optica_bd;"
            + "encrypt=true;"
            + "trustServerCertificate=false;";

    // Usuario de Azure
    static String USER = "Optica";

    // Contraseña de Azure
    static String PASSWORD = "Cosacomun1!";

    public static Connection conectar() {

        Connection con = null;

        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Exitosa");

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return con;
    }
}

