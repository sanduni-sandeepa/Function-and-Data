class account(id: String, n:Int, b: Double){

 val nic = id
 val acc_number = n
 var balance: Double = b ;

 def deposit(amount: Double) = this.balance += amount ;

 def withdraw(amount: Double) = this.balance -= amount ;

 def transfer(acc: Account, amount: Double) = {
   this.withdraw(amount);
   acc.deposit(amount);
 }

 override def toString = "NIC: " + nic + " Acc_number: " +  acc_number + " Balance: " + balance + " ";
}
object Q3 extends App {

 val account1 = new Account("12345", 1 , 10000);
 val account2 = new Account("67891", 2 , 20000);

 println("Initial Details of accounts");
 println("account 01 -> "+ account1);
 println("account 02 -> "+ account2);

 print("\nEnter Amount to Transfer : Rs. ") ;
 val x = scala.io.StdIn.readInt() ;

 account1.transfer(account2,x) ;

 println("\nFinal details of accounts after transfer Rs." + x + " from account 01 to account 02 " )
 println("account 01 -> " + account1);
 println("account 02 -> " + account2);
}
