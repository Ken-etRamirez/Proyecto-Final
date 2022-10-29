package modelo;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Consumiendo {
    public static final String URL_API="https://api.nytimes.com/svc/topstories/v2/world.json?api-key=Lz8GjVMyE78YPMKThm3ymLDpQVwxIWHf";

    public static void consumiendoAPI() throws IOException, InterruptedException {
        //Haciendo la peticion a la API
        /**
         * Haciendo peticion GET
         */
        HttpClient client= HttpClient.newHttpClient();
        HttpRequest request= HttpRequest.newBuilder()
                .GET()
                .header("accept","aplication/json")
                .uri(URI.create(URL_API))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        //Parseo a Json usando JACKSON
        ObjectMapper mapper= new ObjectMapper();

        /**
         * Obteniendo la cadena y parseando a objeto usando JACKSON
         */
        GetTopStories rs = mapper.readValue(response.body(), GetTopStories.class);
        for(Resultado my : rs.getResults()) {
            System.out.println("Mis resultados: " + my);
        }
    }

}
