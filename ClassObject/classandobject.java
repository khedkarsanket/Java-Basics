package ClassObject;

class info {
    String name;
    int age;
    String address;

    void printinfo() {
        System.out.println("This is my personal information");
    }
}


public class classandobject {
    public static void main(String args[]){
        info myinfo = new info();
        myinfo.name = "Sanket";
        myinfo.age = 24;
        myinfo.address = "Pune, Maharashtra";

        System.out.println("My name is: "+myinfo.name);
        System.out.println("My age is: "+myinfo.age);
        System.out.println("My address is: "+myinfo.address);
        myinfo.printinfo();
    }
}
