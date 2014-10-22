package org.bfn.ninetynineprobs

import org.scalatest._

class P32Spec extends UnitSpec {

  "gcd" should "return 1 for a=1, b=1" in {
    assert(P32.gcd(1, 1) == 1)
  }

  it should "return 4 for a=8, b=12" in {
    assert(P32.gcd(8, 12) == 4)
  }

  it should "return 9 for a=36, b=63" in {
    assert(P32.gcd(36, 63) == 9)
  }

  it should "return the same result if a and b are inverted" in {
    assert(P32.gcd(18, 6) == P32.gcd(6, 18))
    assert(P32.gcd(1000, 17) == P32.gcd(17, 1000))
  }

  it should "return 1 for coprime numbers" in {
    assert(P32.gcd(42, 17) == 1)
  }
}

