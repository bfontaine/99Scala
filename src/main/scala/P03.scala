package org.bfn.ninetynineprobs

import java.util.NoSuchElementException

object P03 {
  /**
   * Find the Kth element of a list.
   **/
  def nth[T](k : Int, ls : List[T]) : T = (k, ls) match {
    case (0, head :: _) => head
    case (n, _ :: tail) => if (n < 0) throw new NoSuchElementException()
                           else nth(n-1, tail)
    case _ => throw new NoSuchElementException()
  }
}
