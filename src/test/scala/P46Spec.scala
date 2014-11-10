package org.bfn.ninetynineprobs

import org.scalatest._

class P46Spec extends UnitSpec {

  "and" should "return true on true,true" in {
    assert(true == P46.and(true, true))
  }

  it should "return false on everything else" in {
    assert(false == P46.and(false, true))
    assert(false == P46.and(true, false))
    assert(false == P46.and(false, false))
  }

  "or" should "return false on false,false" in {
    assert(false == P46.or(false, false))
  }

  it should "return true on everything else" in {
    assert(true == P46.or(true, false))
    assert(true == P46.or(false, true))
    assert(true == P46.or(true, true))
  }

  "nand" should "return false on true,true" in {
    assert(false == P46.nand(true, true))
  }

  it should "return true on everything else" in {
    assert(true == P46.nand(false, true))
    assert(true == P46.nand(true, false))
    assert(true == P46.nand(false, false))
  }

  "nor" should "return true on false,false" in {
    assert(true == P46.nor(false, false))
  }

  it should "return false on everything else" in {
    assert(false == P46.nor(true, false))
    assert(false == P46.nor(false, true))
    assert(false == P46.nor(true, true))
  }

  "xor" should "return true on true,false and false,true" in {
    assert(true == P46.xor(true, false))
    assert(true == P46.xor(false, true))
  }

  it should "return false on everything else" in {
    assert(false == P46.xor(true, true))
    assert(false == P46.xor(false, false))
  }

  "impl" should "return true on *,true" in {
    assert(true == P46.impl(true, true))
    assert(true == P46.impl(false, true))
  }

  it should "return true on false,false" in {
    assert(true == P46.impl(false, false))
  }

  it should "return false on true,false" in {
    assert(false == P46.impl(true, false))
  }

  "equ" should "return true on true,true and false,false" in {
    assert(true == P46.equ(true, true))
    assert(true == P46.equ(false, false))
  }

  it should "return false on everything else" in {
    assert(false == P46.equ(true, false))
    assert(false == P46.equ(false, true))
  }
}

