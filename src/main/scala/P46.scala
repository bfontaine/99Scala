package org.bfn.ninetynineprobs

object P46 {

  def and(a : Boolean, b : Boolean) = a && b
  
  def or(a : Boolean, b : Boolean) = a || b

  def nand(a : Boolean, b : Boolean) = !and(a, b)

  def nor(a : Boolean, b : Boolean) = !or(a, b)

  def xor(a : Boolean, b : Boolean) = a^b

  def impl(a : Boolean, b : Boolean) = or(!a, b)

  def equ(a : Boolean, b : Boolean) = a == b
}
