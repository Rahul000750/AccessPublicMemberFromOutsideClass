package AccessPublicMemberFromOutsideClass;
class APP2{
    void printfromoutsideclass(){
        APP obj = new APP();
        System.out.println("within package, outside class:"+obj.st1);
    }
}
public class APP {
    public String st1 = "I am a public member";
    void printfromclass(){
        System.out.println("within class:"+st1);
    }
    public static void main(String[] args){
        APP obj = new APP();
        obj.printfromclass();
        APP2 obj1 = new APP2();
        obj1.printfromoutsideclass();
    }
}
