import scala.annotation.tailrec

object Approximate {

  def doRounding(precision: Int, value: Double) = {
    BigDecimal(value).setScale(precision, BigDecimal.RoundingMode.HALF_UP).toDouble
  }

  def calculatePi(precision: Int): Double = {
    val desiredPi = doRounding(precision, Math.PI)

    @tailrec
    def leibniz(iteration: Int, result: Double): Double = {
      val accum = result + math.pow(-1.0, iteration) * (1.0 / ((2.0 * iteration) + 1.0))
      if(desiredPi == doRounding(precision, accum * 4.0)) {
        println(s"iteration = ${iteration}")
        accum * 4.0
      }
      else {
        leibniz(iteration + 1, accum)
      }
    }

    leibniz(0, 0.0)
  }
}
