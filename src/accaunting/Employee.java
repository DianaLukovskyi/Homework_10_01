package accaunting;

 public abstract class Employee {
     private int id;
     private String name;
     private String secondName;
     private double hour;

     public int getId() {
         return id;
     }

     public String getName() {
         return name;
     }

     public String getSecondName() {
         return secondName;
     }

     public double getHour() {
         return hour;
     }

     public Employee(int id, String name, String secondName, double hour) {
         this.id = id;
         this.name = name;
         this.secondName = secondName;
         this.hour = hour;
     }
     public abstract   double calculateSalary();

     @Override
     public String toString() {
         return "Employee{" +
                 "id=" + id +
                 ", name='" + name + '\'' +
                 ", secondName='" + secondName + '\'' +
                 ", hour=" + hour +
                 '}';
     }





     }


