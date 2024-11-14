package markerinterfaceexamples;


class Employee implements Cloneable{
    public int id;
    public String name;
    public double salary;

    Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary= salary;

    }

    public String toString(){
        return "id: "+id +" "+" name: "+name+" "+" salary: "+salary;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e1=new Employee(101, "Amit", 80000);
        System.out.println(e1);

        Employee e2=(Employee) e1.clone();
        System.out.println(e2);
    }
    
}