package org.bfn.ninetynineprobs

import org.scalatest._

class P06Spec extends UnitSpec {

  "isPalindrome" should "return true on an empty list" in {
    assert(P06.isPalindrome(List()))
  }

  "isPalindrome" should "return true on an one-element list" in {
    assert(P06.isPalindrome(List(2)))
  }

  "isPalindrome" should "return true on an odd palindrome list" in {
    assert(P06.isPalindrome(List(2, 3, 2)))
    assert(P06.isPalindrome(List(1, 2, 3, 4, 3, 2, 1)))
    assert(P06.isPalindrome(List(1, 8, 3, 4, 3, 8, 1)))
  }

  "isPalindrome" should "return true on an even palindrome list" in {
    assert(P06.isPalindrome(List(2, 2)))
    assert(P06.isPalindrome(List(1, 2, 3, 4, 4, 3, 2, 1)))
    assert(P06.isPalindrome(List(1, 8, 3, 4, 4, 3, 8, 1)))
  }

  "isPalindrome" should "return false on an odd non-palindrome list" in {
    assert(!P06.isPalindrome(List(1, 2, 3)))
    assert(!P06.isPalindrome(List(1, 2, 3, 4, 5)))
  }

  "isPalindrome" should "return false on an even non-palindrome list" in {
    assert(!P06.isPalindrome(List(1, 2)))
    assert(!P06.isPalindrome(List(1, 2, 3, 4, 6, 7)))
  }

  "isPalindrome" should "work on String lists as well" in {
    assert(P06.isPalindrome(List("foo")))
    assert(P06.isPalindrome(List("foo", "qux", "foo")))
    assert(!P06.isPalindrome(List("foo", "bar")))
    assert(!P06.isPalindrome(List("foo", "bar", "qux")))
  }
}
