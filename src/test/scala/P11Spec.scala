package org.bfn.ninetynineprobs

import org.scalatest._

class P11Spec extends UnitSpec {

  "encodeModified" should "leave an empty list unchanged" in {
    assert(P11.encodeModified(List()) == List())
  }

  it should "leave a list with unique elements only unchanged" in {
    val myList = List(1, 2, 3)
    assert(P11.encodeModified(myList) == myList)
  }

  it should "count consecutive duplicates" in {
    assert(P11.encodeModified(List(1, 1, 3, 3, 1, 1, 1)) ==
      List((2, 1), (2, 3), (3, 1)))
  }

  it should "mix unique and duplicate counts in its returned list" in {
    assert(P11.encodeModified(List(1, 1, 3, 2, 2, 45, 3, 2, 2)) ==
      List((2, 1), 3, (2, 2), 45, 3, (2, 2)))
  }

  it should "work with String lists as well" in {
    assert(P11.encodeModified(List("foo", "foo", "bar")) ==
      List((2, "foo"), "bar"))
  }
}

