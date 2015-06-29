package com.netaporter.helper

/**
 * Created by iman on 24/06/15.
 */
sealed trait Validator

object Validator {

  def range(current: Int, total: Int): Boolean = current match {
    case x if 1 until total+1 contains x => true
    // case validateRange(current, total: Int) if current == total => true
    case _ => false
  }

}
