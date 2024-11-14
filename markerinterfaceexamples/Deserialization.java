package markerinterfaceexamples;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {

    public static void main(String[] args) {
        
        try{
        ObjectInputStream obj1=new ObjectInputStream(new FileInputStream("EmployeeDemo.txt"));
        EmployeeUsingSerializable e=(EmployeeUsingSerializable)obj1.readObject();

        System.out.println(e.id +" "+e.name+" "+e.salary);
    }
    catch(Exception e){
        e.printStackTrace();
    }
    
}
}
