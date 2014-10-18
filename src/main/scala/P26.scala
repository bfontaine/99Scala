package org.bfn.ninetynineprobs

object P26 {

  /**
   * Generate the combinations of K distinct objects chosen from the N elements
   * of a list.
   * In how many ways can a committee of 3 be chosen from a group of 12 people?
   * We all know that there are C(12,3) = 220 possibilities (C(N,K) denotes the
   * well-known binomial coefficient). For pure mathematicians, this result may
   * be great. But we want to really generate all the possibilities.
   **/
  def combinations[T](count : Int, ls : List[T]) : List[List[T]] =
    Nil // TODO

}
