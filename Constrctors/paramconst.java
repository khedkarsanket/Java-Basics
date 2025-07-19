package Constrctors;

class Car {
   String model;
   int price;
   
   Car(String m, int p){
        model = m;
        price = p;
   }

   void display(){
    System.out.println("Model: "+model+" \nPrice: "+price);
   }

   public static void main(String[] args) {
    Car mycar = new Car("Honda City", 50000);
    mycar.display();
   }
}
