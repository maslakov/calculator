object test{

  import calculator.{Polynomial, Signal}

  val s1 = Set(1,2)
  val s2 = Set(3,3)

  val a = Signal(8.0)
  val b = Signal(-6.0)
  val c = Signal(1.0)

  val d = Polynomial.computeDelta(a,b,c)
  d()
  val xs = Polynomial.computeSolutions(a,b,c,d)
  xs()

}