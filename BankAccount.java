public class BankAccount
{
  private String Name;
  private int accountNum;
  private double Balance;
  private String password;
  private boolean isLoggedIn;

  public BankAccount(String Name, int accountNum, double balance, String password)
  {
    this.Name = Name;
    this.accountNum = accountNum;
    this.Balance = balance;
    this.password = password;
    this.isLoggedIn = false;

  }

  public boolean logIn(String username, String password)
  {
    if( username.equals(this.Name) && password.equals(this.password))

    {
      isLoggedIn = true;
      return true;
    }

    else
    {
      return false;
    }

  }

  public boolean logOut()
  { 
    isLoggedIn = false;
    return isLoggedIn;
  }

  public double getBalance()
  {
    if(isLoggedIn == true) 
    {
      return Balance;
    }
    else
    {
      throw new IllegalStateException("Not logged in, Try Again");
    }
  }

  public double deposit(double amount)
  {
    if (isLoggedIn == true)
    {
      Balance = Balance + amount;
      return Balance;
    }
    else
    {
      throw new IllegalStateException("Not logged in, Try Again");
    }

  }

  public double withdraw(double amount)
  {
    if (isLoggedIn == true)
    {
      Balance = Balance - amount;
      return Balance;
    }
    else
    {
      throw new IllegalStateException("Not logged in, Try Again");
    }

  }

}