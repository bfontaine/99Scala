package org.bfn.ninetynineprobs

import org.scalatest._

class P33Spec extends UnitSpec {

  "isCoprimeTo" should "return true for a=1, b=1" in {
    assert(P33.isCoprimeTo(1, 1) == true)
  }

  it should "return true for coprimes" in {
    assert(P33.isCoprimeTo(42, 17) == true)
  }

  it should "return false if both numbers can be divided by N, N>1" in {
    assert(P33.isCoprimeTo(122, 62) == false)
  }

}

