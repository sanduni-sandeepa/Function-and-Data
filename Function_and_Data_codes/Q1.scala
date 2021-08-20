class Rational (x: Int, y:Int){
  def numerator = x;
  def denominator = y;

  def negation = new Rational(-1 * this.numerator, this.denominator);

  override def toString = numerator +"/"+ denominator ;

}

object Q1 extends App
{
  println("- NEGATION -" )
  print("Enter numerator : ")
  val x1 = scala.io.StdIn.readInt()
  print("Enter denominator : ")
  val x2 = scala.io.StdIn.readInt()

  val x = new Rational(x1, x2)

  println("\nNegation of " + x1 + "/" + x2 + " ---> " + x.negation)
}
