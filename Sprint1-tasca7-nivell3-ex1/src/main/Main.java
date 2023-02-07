package main;

import interfaces.CustomAnnotations;
import org.json.simple.JSONObject;
import serializableClasses.Car;
import serializableClasses.ObjectToJson;
import interfaces.Path;

import java.io.IOException;
import java.lang.reflect.Method;

public class Main {

    @Path()
    //("C:\\Users\\marca\\Desktop\\stuff2\\json.txt")
    //using path annotation to send the path to the file
    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, IOException {

        //creating a custom object
        Car myCar1 = new Car("ferrari","f18","2500");

        //using annotations convert car object to Json String
        ObjectToJson otj = new ObjectToJson();
        Method myMethod = otj.getClass().getMethod("convertToJson", Object.class);
        CustomAnnotations ca = myMethod.getAnnotation(CustomAnnotations.class);
        System.out.println(ca.annotation());
        JSONObject jsonObject = otj.convertToJson(myCar1);

        //writing a file with the String object
        otj.writeIntoFile(Path.pathName,jsonObject);

    }
}