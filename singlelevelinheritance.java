public class singlelevelinheritance {
    public static void main(String[] args) {
        Fish shark= new Fish();
        shark.eat();
    }

}
//base class
class Animal
{
    String color;
    void eat(){
        System.out.println("eat");
    }
    void breath()
    {
        System.out.println("breathes");
    }
}
//derived class
class Fish extends Animal{
    int fins;
    void swim()
    {
        System.out.println("swim in waterS");
    }
}