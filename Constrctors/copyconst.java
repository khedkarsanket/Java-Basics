package Constrctors;

class Copy {
    String model;
    int price;

    Copy(String m, int p){
        model = m;
        price = p;
    }

    Copy(Copy c){
        model = c.model;
        price = c.price;
    }

    void display(){
        System.out.println("Model: "+model+"\nPrice: "+price);
    }
    
    public static void main(String[] args) {
        Copy car1 = new Copy("Honda", 50000);
        Copy car2 = new Copy(car1);
        car2.display();
       }  
}
