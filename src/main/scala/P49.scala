package org.bfn.ninetynineprobs

object P49 {

  /**
   * An n-bit Gray code is a sequence of n-bit strings constructed according to
   * certain rules. For example,
   *  n = 1: C(1) = ("0", "1").
   *  n = 2: C(2) = ("00", "01", "11", "10").
   *  n = 3: C(3) = ("000", "001", "011", "010", "110", "111", "101", "100").
   *
   * Find out the construction rules and write a function to generate Gray
   * codes.
   **/
  def gray(n : Integer) : List[String] = {
    if (n == 0) List("")
    else {
      val g = gray(n-1)
      g.map("0" + _) ::: g.reverse.map("1" + _)
    }
  }

}
