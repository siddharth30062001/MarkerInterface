package custominterface;

//custom marker interface
interface Car{

}

//custom marker interface
interface Engine{

}


public class Status implements Engine{

    static void isWorking(){
        System.out.println("Engine is working properly");
    }
    
}
