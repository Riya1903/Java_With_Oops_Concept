public class overloading {
public static void main(String args[])
{
    Calculator cal=new Calculator();
    System.out.println(cal.sum(1,2));
    System.out.println(cal.sum((float)1.0,(float)2.0));
    System.out.println(cal.sum(1,2,5));

}
}
class Calculator
{
    int sum(int a,int b)
    {
        return a+b;
    }
    float sum(float a,float b)
    {
        return a+b;
    }
    int sum(int a,int b,int c)
    {
        return a+b+c;
    }
}