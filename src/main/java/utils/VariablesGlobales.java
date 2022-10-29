package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class VariablesGlobales {
    //Creando Conexion a Base de Datos
    private static final String DRIVER_DB= "org.postgresql.Driver";
    private static final String URL_DB="jdbc:postgresql://ec2-54-82-205-3.compute-1.amazonaws.com:5432/d3qp48a7vbfgk";
    private static final String USSER_DB="mecrkihzryfsbz";
    private static final String PASSWORD_DB="b67a8ed93e23f7d9adf495d2e26074b4508653266670d240a303f4c6e1ca6fb8";

    public static Connection conn;

    /**
     * Un metodo que nos conectara a la BD
     */
    static {
        try {
            Class.forName(DRIVER_DB);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try{
            conn= DriverManager.getConnection(URL_DB,USSER_DB,PASSWORD_DB);
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
    }
}
