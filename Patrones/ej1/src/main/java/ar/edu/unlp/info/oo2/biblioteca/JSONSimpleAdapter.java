package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONSimpleAdapter extends VoorheesExporter {
    @Override
    public String exportar(List<Socio> socios) {
        JSONArray jsonArray = new JSONArray();
        socios.stream().forEach(socio -> jsonArray.add(this.objectSocio(socio)));
        return jsonArray.toJSONString();
    }

    private JSONObject objectSocio(Socio socio) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("nombre", socio.getNombre());
        jsonObject.put("email", socio.getEmail());
        jsonObject.put("legajo", socio.getLegajo());
        return jsonObject;
    }
}
