public class examplestatickeyword {
@SuppressWarnings("static-access")
public static void main(String[] args) {
    Student s1=new Student();
    s1.schoolname="JVM";
    Student s2=new Student();
    System.out.println(s2.schoolname);
    Student s3=new Student();
    s3.schoolname="abc";
}
}
class Student{
     static int returnpercentage(int phy,int chem,int math)
    {
        return(phy+math+chem)/3;
    }
    String name;
    int roll;
    static String schoolname;
    void setname(String name)
    {
        this.name=name;
    }
    String getname()
    {
        return this.name;
    }
}
