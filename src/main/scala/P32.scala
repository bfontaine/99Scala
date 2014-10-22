package org.bfn.ninetynineprobs

object P32 {

  /**
   * Determine the greatest common divisor of two positive integer numbers. Use
   * Euclid's algorithm.
   **/
  def gcd(a : Integer, b : Integer) : Integer = {
    if (b == 0)
      a
    else
      gcd(b, a%b)
  }

}
