public class Code {
    public static void main(String[] args) {
        Employee obj=new Employee(101,"Ankit",35000);
        System.out.print(obj);
    }
}
class Employee{
    private int id;
    private String name;
    private double salary;lloo
    public Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public String toString(){
        return this.id+","+this.name+","+this.salary;
    }
}

    

