public class hierarchicalinheritance {
    public static void main(String[] args) {
        Mammal m1=new Mammal();
    m1.eat();
    Bird b1=new Bird();
    b1.breathe();
    }
}
class Animal{
    String color;
    void eat()
    {
        System.out.println("eats");
    }
    void breathe()
    {
        System.out.println("breathes");
    }
    }
    class Mammal extends Animal{
        void walk()
        {
            System.out.println("walks");
        }
    }
    class Fish extends Animal{
        void swim()
        {
            System.out.println("swim");
        }
    }
    class Bird extends Animal
    {
        void fly()
        {
            System.out.println("fly");
        }
    }
    
