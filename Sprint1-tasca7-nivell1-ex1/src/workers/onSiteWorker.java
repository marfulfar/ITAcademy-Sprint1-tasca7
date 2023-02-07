package workers;

public class onSiteWorker extends Worker{

    private static final float MILEAGE = 15f;

    public onSiteWorker(String name, String lastName, float priceHour) {
        super(name, lastName, priceHour);
    }


    @Override
    public float calculateSalary(float numHours) {
        float salary;
        salary = (numHours*getPriceHour())+ MILEAGE;

        return salary;
    }

    @SuppressWarnings("DeprecatedIsStillUsed")
    @Deprecated
    public void printNameAndPrice(){
        System.out.println("\nDeprecated method example");
        System.out.println("Name: " + getName()+ "\nPrice per Hour: " +getPriceHour());
    }

}//closes class
