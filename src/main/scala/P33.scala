package org.bfn.ninetynineprobs

object P33 {

  def isCoprimeTo(a : Integer, b : Integer) =
    P32.gcd(a, b) == 1

}
