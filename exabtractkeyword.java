public class exabtractkeyword {
public static void main(String[] args) {
    Horse h1=new Horse();
    h1.eat();
    h1.walk();
   System.out.println(h1.color);
    Chicken c1=new Chicken();
    c1.eat();
    c1.walk();
   // Animal a1=new Animal();
}
}
abstract class Animal{
    String color;
    Animal()
    {
        color="brown";
    }
    void eat()
    {
        System.out.println("animal eats");
    }
    abstract void walk();
}
class Horse extends Animal{
    void changecolor()
    {
        color="dark brown";
    }
    void walk()
    {
        System.out.println("walk on 4 legs");
    }
}
class Chicken extends Animal{
    void changecolor()
    {
        color="brown";
    }
    void walk()
    {
        System.out.println("walks on 2 legs");
    }
}
