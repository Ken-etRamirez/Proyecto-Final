package dao;

import modelo.Resultado;
import utils.VariablesGlobales;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ResultadoDAO {
    /**
     * Creamos un METODO DAO para obtener la data
     * @return Un objeto que contiene el Query y lo plasma
     */
    public List<Resultado> getAllDB(){
        List<Resultado> noticias= new ArrayList<>();

        try {
            Statement statement= VariablesGlobales.conn.createStatement();
            String consulta="select * from noticias";

            ResultSet rs= statement.executeQuery(consulta);

            while(rs.next()){
                noticias.add(new Resultado(  rs.getString("title"),rs.getString("byline")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return noticias;
    }
}
