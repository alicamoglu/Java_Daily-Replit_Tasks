package day26_ConstructorsCont_StaticsIntro.RestaurantTask;

import java.time.LocalDate;

public class Server {
    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean fullTime;
    public LocalDate hire_date;

    public Server(String name, int employeeID, double hourlyRate, boolean fullTime, LocalDate hire_date) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
        this.hire_date = hire_date;
    }
    public void takeOrder(){
        System.out.println(name + " is taking an order");
    }
    public void cleanTable(){
        System.out.println(name + " is cleaning the table");
    }


    public String toString() {
//        String full_time = "";
//        if (fullTime){
//            full_time = "full-time";
//        }else {
//            full_time = "part-time";
//        }
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
//                ", fullTime=" + full_time +     // defined in line 28
                ", isFullTime=" + (fullTime?"full-time":"Part-time") +     // todo
                ", hire_date=" + hire_date +
                '}';
    }

}
/*        4.1  Create a class called Server
        Attributes:
        name (String), employeeID (int), hourlyRate (double), fullTime (boolean), hire_date (LocalDate)
        Add A constructor that can set all the fields
        Actions: (all void methods)
        takeOrder(): server's name + "is taking an order"
        cleanTable(): server's name + "is cleaning the table"
        toString(): Returns (String) all the information of a Server
        -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"*/
