#Default Values of different data types using Instance Variables


class Test2{
int x;//instance variable
double d;
boolean b;
String s;

public static void main(String[] args)
{
//System.out.println(x);//invalid

//To call Instance variable
Test2 t = new Test2();

System.out.println(t.x);//0
System.out.println(t.d);//0.0
System.out.println(t.b);//false
System.out.println(t.s);//null


}
}