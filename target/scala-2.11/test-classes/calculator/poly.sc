import calculator.{Polynomial, Signal}

object test{

  val s1 = Set(1,2)
  val s2 = Set(3,3)

  val a = Signal(1.0)
  val b = Signal(3.0)
  val c = Signal(-4.0)
  val d = Polynomial.computeDelta(a,b,c)
  val xs = Polynomial.computeSolutions(a,b,c,d)
}