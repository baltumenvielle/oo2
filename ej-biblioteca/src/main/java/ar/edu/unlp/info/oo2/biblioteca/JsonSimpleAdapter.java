package ar.edu.unlp.info.oo2.biblioteca;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.util.stream.Collectors;
import java.util.List;

public class JsonSimpleAdapter extends VoorheesExporter {
    @Override
    public String exportar(List<Socio> socios) {
        return socios.stream()
                .map(socio -> {
                    JSONObject obj = new JSONObject();
                    obj.put("nombre", socio.getNombre());
                    obj.put("email", socio.getEmail());
                    obj.put("legajo", socio.getLegajo());
                    return obj;
                })
                .collect(Collectors.toCollection(JSONArray::new))
                .toJSONString();
    }
}
