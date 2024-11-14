package markerinterfaceexamples;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class EmployeeUsingSerializable implements Serializable {

    public int id;
    public String name;
    public double salary;

    EmployeeUsingSerializable(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary= salary;

    }

    public String toString(){
        return "id: "+id +" "+" name: "+name+" "+" salary: "+salary;
    }


    public static void main(String[] args) {
        
        try{
        EmployeeUsingSerializable e1=new EmployeeUsingSerializable(101, "Sachin",5000);
        FileOutputStream f1=new FileOutputStream("EmployeeDemo.txt");
        ObjectOutputStream o1=new ObjectOutputStream(f1);
        o1.writeObject(e1);
        o1.flush();
        o1.close();

        System.out.println("Data has been read from the File");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    
}