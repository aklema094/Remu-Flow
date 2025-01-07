package remuflow;

public class Main {

    public static void main(String[] args){
        RemuFlow rf = new RemuFlow();
        FulllTimeEmployee ft = new FulllTimeEmployee("Aklema", 1, "Full Time", 50000);
        PartTimeEmployee pt = new PartTimeEmployee("Sultana", 2, "Part time", 5, 500);
        
        rf.addEmployee(ft);
        rf.displayEmployee();
        rf.removeEmployee(1);
        rf.displayEmployee();
        rf.removeEmployee(1);
    }

}
