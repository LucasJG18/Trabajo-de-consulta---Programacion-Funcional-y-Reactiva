//1. Integracion Simpson 1/3
def integracion(f: Double => Double, a: Double, b: Double): Double = {
  val xm = (a + b) / 2.0
  (b - a) * ((f(a) + 4 * f(xm) + f(b)) / 6.0)
}

//2.
val i1 = integracion(x => -x*x + 8*x - 12, 3, 5)
val i2 = integracion(x => 3*x*x, 0, 2)
val i3 = integracion(x => x + 2*x*x - x*x*x + 5*x*x*x*x, -1, 1)
val i4 = integracion(x => (2*x + 1) / (x*x + x), 1, 2)
val i5 = integracion(x => math.exp(x), 0, 1)
val i6 = integracion(x => 1 / math.sqrt(x - 1), 2, 3)
val i7 = integracion(x => 1 / (1 + x*x), 0, 1)

//3.
def error(valorReal: Double, valorObtenido: Double): Double =
  math.abs(valorReal - valorObtenido)

val e1 = error(7.33, i1)
val e2 = error(8.0, i2)
val e3 = error(3.333, i3)
val e4 = error(1.09861, i4)
val e5 = error(1.71828, i5)
val e6 = error(0.828427, i6)
val e7 = error(0.785398, i7)