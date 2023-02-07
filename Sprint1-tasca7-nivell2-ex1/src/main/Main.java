package main;

import org.json.simple.JSONObject;
import serializableClasses.Car;
import serializableClasses.ObjectToJson;
import interfaces.Path;

import java.io.IOException;

public class Main {

    @Path()
    //("C:\\Users\\marca\\Desktop\\stuff2\\json.txt")
    //using path annotation to send the path to the file
    public static void main(String[] args) throws IllegalAccessException, IOException {

        //creating a custom object
        Car myCar1 = new Car("ferrari","f18","2500");

        //using annotations convert car object to Json String
        ObjectToJson otj = new ObjectToJson();
        JSONObject jsonObject = otj.convertToJson(myCar1);

        //writing a file with the String object
        otj.writeIntoFile(Path.pathName,jsonObject);

    }
}