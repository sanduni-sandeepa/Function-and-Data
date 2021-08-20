class Account(id: String, n:Int, b: Double)
{

  val nic = id
  val acc_number = n
  var balance: Double = b ;

  def applyInterest(): Account = {
    if(balance > 0 ){
      balance  = balance * 1.05
      return this
    }
    else {
      balance = balance * 1.1
      return this
    }
  }
  override def toString = "NIC: " + nic + " Acc_number: " +  acc_number + " Balance: " + balance + " ";
}
object Q4 extends App {

  var Bank = List(new Account("923123345", 20, 10000), new Account("234986453", 34, -100), new Account("90675347", 41, 2500), new Account("789226543", 50, -10), new Account("876543891", 55, 2000)) ;

  println("1 - To Get List of Accounts with Negative Balance\n2 - To Get Total of All Account Balances\n3 - To Get Account Details after Interest Update")

  print("\nEnter number : ") ;
  val x = scala.io.StdIn.readInt() ;

  if (x==1) {
    var overdraft_accounts : List[Account]= Bank.filter((x) => x.balance < 0)
    println("\n- List of Accounts with Negative Balance -")
    println(overdraft_accounts)
  }
  else if (x==2) {
    var sum_of_account_balance = Bank.map(x => x.balance).reduce((x,y) => x + y)
    print("\n- Total of all Account Balances -> ")
    println(sum_of_account_balance)
  }
  else if (x==3) {
    //var update_with_interest :  = Bank.map((x) => ( if (x.balance <= 0) x.balance + (x.balance * 0.1) else  x.balance + (x.balance * 0.5) );
    var update_with_interest = Bank.map((x) => x.applyInterest())
    println("\n- List of Accounts with Updated Balance After Interest is Adding -")
    println(update_with_interest)

  }
}
