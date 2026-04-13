package co.uptc.edu.yaml;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class ManagerYaml {

    private String path = "config.yaml";

    public List<String> listString() throws Exception {

        List<String> list = new ArrayList<>();

        try (InputStream is = ManagerYaml.class
                .getClassLoader()
                .getResourceAsStream(path)) {

            if (is == null) {
                throw new RuntimeException("Archivo no encontrado: " + path);
            }

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(is, StandardCharsets.UTF_8));

            String linea;

            while ((linea = br.readLine()) != null) {

                

                if (!linea.isEmpty()) {
                    list.add(linea);
                }
            }

        } catch (Exception e) {
            throw new Exception("Error leyendo archivo YAML", e);
        }

        return list;
    }
}