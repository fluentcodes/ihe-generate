package org.fluentcodes.ihe.gematik.fdv.api;

import org.fluentcodes.tools.xpect.IORuntimeException;
import org.fluentcodes.tools.xpect.IOString;
import org.fluentcodes.tools.xpect.XpectSnake;
import org.junit.Test;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.*;

public class YamlGen {
    @Test
    public void readModelsYaml() throws Exception {
        try {
            List<String> propertyNames = List.of("objectName", "fieldName", "required", "type", "$ref", "minLength", "maxLength","default","enum","format","maxItems","minItems","description","example");
            Map<String, Object> obj = new Yaml().load(new FileInputStream(new File("schema/testtreiber_fdv.yaml")));
            List<Map<String,Object>> objectList = new ArrayList<>();
            Map<String, Object> components = (Map<String, Object>) obj.get("components");
            Map<String, Object> objects = (Map<String, Object>) components.get("schemas");
            for (String objectName: objects.keySet()) {
                if (!objectName.equals("DirectoryEntry")) {
                    //continue;
                }
                Map<String, Object> object = (Map<String, Object>) objects.get(objectName);
                ArrayList<String> requiredFields = (ArrayList<String>) object.get("required");
                Map<String, Object> objectProperties = (Map<String, Object>) object.get("properties");
                if (objectProperties == null) {
                    System.out.println("no field found for " + objectName);
                    continue;
                }
                for (String fieldName: objectProperties.keySet()) {
                    Map<String, Object> propertyMap = new LinkedHashMap<>();
                    propertyMap.put("objectName", objectName);
                    propertyMap.put("fieldName", fieldName);
                    if (requiredFields != null) {
                        if (requiredFields.contains(fieldName)) {
                            propertyMap.put("required", true);
                        }
                        else {
                            propertyMap.put("required", false);
                        }
                    }
                    else {
                        propertyMap.put("required", true);
                    }
                    Map<String, Object> field = (Map<String, Object>) objectProperties.get(fieldName);
                    if (field.containsKey("items")) {
                        field.putAll((Map<String, Object>) field.get("items"));
                    }
                    for (String propertyName : field.keySet()) {
                        if (propertyName.equals("items")) {
                            continue;
                        }
                        if (!propertyNames.contains(propertyName)) {
                            System.out.println("No propertyName " + propertyName + " " + objectName + " " + fieldName);
                        }
                        propertyMap.put(propertyName, field.get(propertyName));
                    }
                    objectList.add(propertyMap);
                }
            }
            StringBuilder builder = new StringBuilder("");
            for (String key: propertyNames) {
                builder.append("\"");
                builder.append(key);
                builder.append("\";");
            }
            builder.append("\n");
            for (Map<String, Object> row: objectList) {
                for (String key: propertyNames) {
                    builder.append("\"");
                    if (row.containsKey(key)) {
                        builder.append(row.get(key));
                    }
                    builder.append("\";");
                }
                builder.append("\n");
            }
            System.out.println(builder.toString());
            new IOString()
                    .setFileName("src/test/resources/models.csv")
                    .write(builder.toString());

        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(new File("schema/testtreiber_fdv.yaml").getAbsolutePath(), e);
        }
    }

    private String extractRef(Map<String, Object> input) {
        Map<String, Object> defaultMap = (Map<String, Object>) input.get("default");
        if (defaultMap != null) {
            input = defaultMap;
        }
        Map<String, Object> content = (Map<String, Object>) input.get("content");
        if (content == null) {
            throw new IORuntimeException("Could not find content");
        }
        Map<String, Object> json = (Map<String, Object>) content.get("application/json");
        if (json == null) {
            throw new IORuntimeException("Could not find json");
        }
        Map<String, Object> schema = (Map<String, Object>) json.get("schema");
        if (schema == null) {
            throw new IORuntimeException("Could not find json");
        }
        return (String) schema.get("$ref");

    }

    @Test
    public void readPaths() throws Exception {
        try {
            List<String> propertyNames = List.of("path", "request", "response","tags", "summary", "operationId", "description","example");
            Map<String, Object> obj = new Yaml().load(new FileInputStream(new File("schema/testtreiber_fdv.yaml")));
            List<Map<String,Object>> objectList = new ArrayList<>();
            Map<String, Object> paths = (Map<String, Object>) obj.get("paths");
            for (String pathName: paths.keySet()) {
                if (!pathName.equals("/login")) {
                    //continue;
                }
                Map<String, Object> propertyMap = new LinkedHashMap<>();
                propertyMap.put("path", pathName);
                Map<String, Object> path = (Map<String, Object>) paths.get(pathName);
                Map<String, Object> post = (Map<String, Object>) path.get("post");
                if (post == null) {
                    continue;
                }
                for (String postPropertyName: post.keySet()) {
                    if (post.get(postPropertyName) instanceof Map) {
                        Map<String, Object> postProperty = (Map<String, Object>) post.get(postPropertyName);
                        if (postPropertyName.equals("requestBody")) {
                            propertyMap.put("request", extractRef(postProperty));
                        }
                        else if (postPropertyName.equals("responses")) {
                            propertyMap.put("response", extractRef(postProperty));
                        }
                        else {
                        propertyMap.put(postPropertyName, postProperty);
                        }
                    }
                    else {
                        if (!propertyNames.contains(postPropertyName)) {
                            System.out.println("Could not find propertyName " + postPropertyName + " for " + pathName);
                        }
                        propertyMap.put(postPropertyName, post.get(postPropertyName));
                    }
                }
                objectList.add(propertyMap);
            }
            StringBuilder builder = new StringBuilder("");
            for (String key: propertyNames) {
                builder.append("\"");
                builder.append(key);
                builder.append("\";");
            }
            builder.append("\n");
            for (Map<String, Object> row: objectList) {
                for (String key: propertyNames) {
                    builder.append("\"");
                    if (row.containsKey(key)) {
                        builder.append(row.get(key));
                    }
                    builder.append("\";");
                }
                builder.append("\n");
            }
            System.out.println(builder.toString());
            new IOString()
                    .setFileName("src/test/resources/paths.csv")
                    .write(builder.toString());

        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(new File("schema/testtreiber_fdv.yaml").getAbsolutePath(), e);
        }
    }
}
