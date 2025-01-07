
package remuflow;


public class FulllTimeEmployee extends Employee{
    
    double monthlySalary;
    
     FulllTimeEmployee(String name, int id, double salary){
         super(name,id);
         this.monthlySalary = salary;
     }
    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
       
}
