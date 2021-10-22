import org.scalatest.{FunSuite, Matchers}

import scala.math.Pi

class ApproximateTest extends FunSuite with Matchers {

  test(s"pi 1") {
    val calculatedPi = Approximate.calculatePi(1)
    f"$calculatedPi%1.1f" shouldBe f"$Pi%1.1f"
  }

  test(s"pi 2") {
    val calculatedPi = Approximate.calculatePi(2)
    f"$calculatedPi%1.1f" shouldBe f"$Pi%1.2f"
  }

  test(s"pi 3") {
    val calculatedPi = Approximate.calculatePi(3)
    f"$calculatedPi%1.1f" shouldBe f"$Pi%1.3f"
  }

  test(s"pi 5") {
    val calculatedPi = Approximate.calculatePi(5)
    f"$calculatedPi%1.1f" shouldBe f"$Pi%1.5f"
  }

  test(s"pi 10") {
    val calculatedPi = Approximate.calculatePi(10)
    f"$calculatedPi%1.1f" shouldBe f"$Pi%1.10f"
  }

  test(s"pi 12") {
    val calculatedPi = Approximate.calculatePi(12)
    f"$calculatedPi%1.1f" shouldBe f"$Pi%1.12f"
  }
}
