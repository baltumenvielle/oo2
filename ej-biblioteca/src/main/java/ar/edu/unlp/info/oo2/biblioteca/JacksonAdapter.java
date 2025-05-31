package ar.edu.unlp.info.oo2.biblioteca;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.stream.Collectors;
import java.util.List;

public class JacksonAdapter extends VoorheesExporter {
    @Override
    public String exportar(List<Socio> socios) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(socios);
        }
        catch (Exception e) {
            throw new RuntimeException("Error al exportar con Jackson", e);
        }
    }
}
