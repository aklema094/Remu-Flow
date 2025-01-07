
package remuflow;

abstract class Employee {
    private String name;
    private String category;
    private int id;
    
    Employee(String name, int id){
        this.name = name;
        this.id = id;
    }
    public String name(){
        return name;
    }
    public String category(){
        return category;
    }
    public int getId(){
       return id; 
    } 
    abstract public double calculateSalary();
    
    @Override
    public String toString(){
        return "ID : "+id+"\nName : "+name+"\nCategory : "+category+"\n Salary : "+calculateSalary()+" ";
    }
    
}
