package org.bfn.ninetynineprobs

object P34 {

  private def totientAcc(m : Integer, r : Integer, acc : Integer) : Integer =
    if (m <= 0 || r > m)
      acc
    else
      totientAcc(m, r+1, if (P33.isCoprimeTo(r, m)) acc + 1 else acc)

  def totient(m : Integer) = totientAcc(m, 1, 0)

}
