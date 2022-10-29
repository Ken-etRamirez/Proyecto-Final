package modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 *
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)//Anotacion para ignorarPropiedades no especificadas y que en el JSON si vengan
@JsonInclude(JsonInclude.Include.NON_NULL)//Anotacion para no mapear datos que vengan como NULL
public class Resultado {

    @JsonProperty("title")
    private String titulo;
    @JsonProperty("byline")
    private String byline;
    @JsonProperty("abstract")
    private String abs;
    @JsonProperty("url")
    private String urlFoto;

    private static int correlativo=1;
    private int id;

    /**
     * Constructor con Metodos
     * @param titulo titulo
     * @param byline autor
     */
    public Resultado(String titulo, String byline) {
        this.id=correlativo;
        correlativo++;
        this.titulo = titulo;
        this.byline = byline;
        this.abs = abs;
        this.urlFoto = urlFoto;
    }

    public Resultado(String titulo, String byline, String abs, String urlFoto) {
        this.id=correlativo;
        correlativo++;
        this.titulo = titulo;
        this.byline = byline;
        this.abs = abs;
        this.urlFoto = urlFoto;
    }

    /**
     * GET ID
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Correlativo
     * @param correlativo ID
     */
    public static void setCorrelativo(int correlativo) {
        Resultado.correlativo = correlativo;
    }

    /**
     * GET TITULO
     * @return titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Set titulo
     * @param titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Get byLine
     * @return autor
     */
    public String getByline() {
        return byline;
    }

    /**
     * Set autor
     * @param byline autor
     */
    public void setByline(String byline) {
        this.byline = byline;
    }

    /**
     * Get abs
     * @return descripcion
     */
    public String getAbs() {
        return abs;
    }

    /**
     * Set abs
     * @param abs descripcion
     */
    public void setAbs(String abs) {
        this.abs = abs;
    }

    /**
     * Get URL
     * @return url
     */
    public String getUrlFoto() {
        return urlFoto;
    }

    /**
     * Set url
     * @param urlFoto link
     */
    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }
}
