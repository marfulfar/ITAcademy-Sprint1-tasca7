package main;


import workers.OnlineWorker;
import workers.onSiteWorker;
import workers.Worker;

public class Main {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

//exercise 1
        //creating 3 different workers, one form each class, passing as an argument same price hour
        //and printing correspondents salaries to see override function
        final float numHours = 30f;

        System.out.println("Printing 3 different salaries given the same price per hour");
        Worker worker = new Worker("Ariadna","Pla",15);
        System.out.println("worker salary: " + worker.calculateSalary(numHours));

        OnlineWorker onlineWorker = new OnlineWorker("Pepe", "Brualla", 15);
        System.out.println("online worker salary: " + onlineWorker.calculateSalary(numHours));

        onSiteWorker onSiteWorker = new onSiteWorker("Andreu","Guzman",15);
        System.out.println("on-site worker salary: " + onSiteWorker.calculateSalary(numHours));

//Exercise 2
        //Calling one deprecated method for each worker and printing that method.
        //In each class we suppress warnings for deprecated
        onlineWorker.printNameAndLastName();
        onSiteWorker.printNameAndPrice();


    }//closes main
}//closes class