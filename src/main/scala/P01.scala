package org.bfn.ninetynineprobs

import java.util.NoSuchElementException

object P01 {
  def last[T](ls : List[T]) : T = ls match {
    case head :: Nil => head
    case head :: tail => last(tail)
    case _ => throw new NoSuchElementException()
  }
}
