package serializableClasses;

import interfaces.CustomAnnotations;
import interfaces.JsonElement;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class ObjectToJson {
    @CustomAnnotations(annotation = "Converts an custom object to JSON object")
    public JSONObject convertToJson (Object object) throws IllegalAccessException {
        Class<?> myClass = object.getClass();
        Map<String, String> jsonElementsMap = new HashMap<>();

        //accessing the fields on the object class and checking if they have an annotation
        //if they do, grab the key and the value and insert it into a map of String String
        for (Field field : myClass.getDeclaredFields()) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(JsonElement.class)) {
                jsonElementsMap.put(field.getAnnotation(JsonElement.class).key(), (String) field.get(object));
            }
        }

        //using json-simple library to easily create json objects
        //using custom method of json-simple library to create json objects from map
        JSONObject jsonObject = new JSONObject(jsonElementsMap);
        return jsonObject;
    }


    public void writeIntoFile(String filePath, JSONObject jsonObject) throws IOException {
        FileWriter mWriter = null;
        try {
            //writing a file with the json object passed as parameter
            //using custom method jsonObject.toJSONString from json-simple library
            mWriter = new FileWriter(filePath);
            mWriter.write(jsonObject.toJSONString());
            mWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred: We couldn't write current file. ");
        } finally {
            mWriter.close();
        }

    }


}
