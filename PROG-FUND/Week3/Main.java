class Bank 
{

private int balance = 3000;

public int getBalance(){
return this.balance;
}

public void setBalance(int balance)
{
this.balance = balance;

}

}

public class Main{
public static void main(String[] args)
{
Bank b1 = new Bank();
b1.setBalance(5000);

System.out.println(b1.getBalance());


}
}