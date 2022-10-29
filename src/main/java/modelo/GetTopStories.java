package modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)//Anotacion para ignorarPropiedades no especificadas y que en el JSON si vengan
@JsonInclude(JsonInclude.Include.NON_NULL)//Anotacion para no mapear datos que vengan como NULL
public class GetTopStories {
    @JsonProperty("results")
    public List<Resultado> results;
}
