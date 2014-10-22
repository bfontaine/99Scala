package org.bfn.ninetynineprobs

import org.scalatest._

class P34Spec extends UnitSpec {

  "totient" should "return 0 if m=0" in {
    assert(P34.totient(0) == 0)
  }

  it should "return 0 if m<0" in {
    assert(P34.totient(-12) == 0)
  }

  it should "return 1 if m=1" in {
    assert(P34.totient(1) == 1)
  }

  it should "return m-1 if m is a prime number" in {
    assert(P34.totient(17) == 16)
  }

}

