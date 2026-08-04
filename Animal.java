public class Animal {
   void eat(){
    System.out.println("animal eats");

   }
   void sleep(){
    System.out.println("animal sleep");
   } 
}
class Bird extends Animal{
    void eat(){
        System.out.println("birds eats insects");
    }
    void sleep(){
        System.out.println("birds can sleep");
    }
    void fly(){
        System.out.println("birds can fly");
    }
    public static void main(String args[]){
        Bird B=new Bird();
        B.eat();
        B.sleep();
        B.fly();
    }
}
