
class rational(n:Int, d:Int){

  if (d<=0) {
    println("\n!!! zero division is not allow")
  }

  //Requirement
  require(d>0, "d must be greater than 0")

  //numorator
  def numer = n/math.abs(gcd(n,d))

  //denominator
  def denom = d/math.abs(gcd(n,d)) ;

  //contructor to single parameter object
  def this(n:Int) = this(n, 1)

  def gcd(a:Int, b:Int):Int = if(b == 0) a else gcd(b, a%b)

  def +(r:rational) = new rational((this.numer*r.denom) + (r.numer*this.denom), this.denom*r.denom)

  def neg = new rational(-numer, denom)

  def -(r:rational) = this + r.neg

  override def toString = numer+"/"+denom ;
}


object aa extends App{

  println("\n- SUBTRACTION -" )

  print("x\nEnter x numerator : ")
  val x1 = scala.io.StdIn.readInt()
  print("Enter x denominator : ")
  val x2 = scala.io.StdIn.readInt()

  print("\ny\nEnter y numerator : ")
  val y1 = scala.io.StdIn.readInt()
  print("Enter y denominator : ")
  val y2 = scala.io.StdIn.readInt()

  print("\nz\nEnter z numerator : ")
  val z1 = scala.io.StdIn.readInt()
  print("Enter z denominator : ")
  val z2 = scala.io.StdIn.readInt()

  val x = new rational(x1, x2)
  val y = new rational(y1, y2)
  val z = new rational(z1, z2)

  val r2 = x - y - z
  println("\n\nSubtrction of " + x1 + "/" + x2 + " - " + y1 + "/" + y2 + " - " + z1 + "/" + z2 + " = "  + r2)
}

