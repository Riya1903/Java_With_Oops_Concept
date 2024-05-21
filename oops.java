public class oops {
public static void main(String args[])
{
    Pen p1=new Pen();//created a pen object called p1
    p1.setcolor("blue");
    System.out.println(p1.getcolor());
    p1.settip(5);
    System.out.println(p1.gettip());
    p1.setcolor("yellow");
    System.out.println(p1.getcolor());

}
}
class Bankaccount{
    Password

class Pen{
    String color;
    int tip;
    void setcolor(String newcolor)
    {
        color=newcolor;
    }
    void settip(int newtip)
    {
        tip=newtip;
    }
}
class Student{
    String name;
    int age;
    float percentage;
    void calcpercentage(int phy,int chem,int math)
    {
        percentage=(phy+chem+math)/3;
    }
}
