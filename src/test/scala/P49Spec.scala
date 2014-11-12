package org.bfn.ninetynineprobs

import org.scalatest._

class P49Spec extends UnitSpec {

  "gray" should "return (0, 1) for 1" in {
    assert(P49.gray(1) == List("0", "1"))
  }

  it should "return (00, 01, 11, 10) for 2" in {
    assert(P49.gray(2) == List("00", "01", "11", "10"))
  }

  it should "return (000, 001, 011, 010, 110, 111, 101, 100)" in {
    assert(P49.gray(3) == List("000", "001", "011", "010", "110", "111", "101", "100"))
  }

}

