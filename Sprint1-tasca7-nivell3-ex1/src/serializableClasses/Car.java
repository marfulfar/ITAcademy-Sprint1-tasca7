package serializableClasses;

import interfaces.JsonElement;
import interfaces.JsonSerializable;

@JsonSerializable
public class Car {

    @JsonElement(key="name")
    private String brand;
    @JsonElement(key="model")
    private String model;
    @JsonElement(key="power")
    private String power ;

    public Car(String brand, String model, String power) {
        this.brand = brand;
        this.model = model;
        this.power = power;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }
}
