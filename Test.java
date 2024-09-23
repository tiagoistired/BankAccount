public class Test
{
public static void main(String[] args)
{
    BankAccount savings = new BankAccount( "Tiago", 1424, .93,  "Shminkle");
    savings.logIn( "Tiago", "Shminkle");
    System.out.println(savings.getBalance());
    savings.deposit( 50.00);
    System.out.println(savings.getBalance());
    savings.withdraw( 25.00);
    System.out.println(savings.getBalance());
    savings.logOut();
    savings.deposit(1000.00);
    System.out.println(savings.getBalance());
}
} 