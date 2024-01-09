package accaunting;

public class Company {
    private Employee[]employees;
    private int companySize;

   public Company (int capacity){
       employees = new Employee[capacity];
       companySize = 0;



    }
    public void sortEmployeesSecondName(){
       for (int i = 0; i < companySize - 1; i++){
           for (int j = 0; j < companySize - i -1; j++){
               if (employees[j].getSecondName().compareTo(employees[j + 1].getSecondName())>0){
                   Employee temp = employees[j];
                   employees[j] = employees[j + 1];
                   employees [j + 1] = temp;

               }
           }
       }


    }

    public boolean addEmployee(Employee employee) {
       if(companySize < employees.length){
           employees[companySize] = employee;
           companySize++;
           return true;
       }
       return false;
    }

    public void display() {
       for ( int i = 0; i < companySize; i++){
           System.out.println(employees[i]);
       }
    }

    public boolean removeEmployee(Employee employee) {
       for(int i = 0; i < companySize;i++){
           if (employees[i].equals(employee)){
               employees[i] = employees[companySize -1];
               companySize --;
               return true;
           }
       }
       return false;
    }

    public double sumSalary() {
       double sum = 0;
       for (int i = 0; i < companySize; i++){
           sum = sum + employees[i].calculateSalary();


        }
       return sum;
    }
}
