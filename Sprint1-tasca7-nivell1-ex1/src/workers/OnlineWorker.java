package workers;

public class OnlineWorker extends Worker{

    private static final float INTERNET = 10f;


    public OnlineWorker(String name, String lastName, float priceHour) {
        super(name, lastName, priceHour);
    }


    @Override
    public float calculateSalary(float numHours) {
        float salary;
        salary=(numHours*getPriceHour())+INTERNET;

        return salary;
    }

    @SuppressWarnings("DeprecatedIsStillUsed")
    @Deprecated
    public void printNameAndLastName(){
        System.out.println("\nDeprecated method example");
        System.out.println("Name: " + getName()+ "\nLast name: " +getLastName());
    }



}//closes class
