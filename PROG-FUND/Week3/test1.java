#Another Example of calling Instance Variable

class Test1{
int x = 10;//instance variable

public static void main(String[] args)
{
//System.out.println(x);//invalid

//To call Instance variable
Test1 t = new Test1();
Test1 t1 = new Test1();
System.out.println(t.x);
System.out.println(t1.x);


}

public void m1()//Instance method
{
System.out.println(x);//valid
}
}
