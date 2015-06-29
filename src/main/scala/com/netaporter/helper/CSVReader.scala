package com.netaporter.helper

import java.io.FileNotFoundException

import scala.io.Source

/**
 * Created by iman on 23/06/15.
 */

trait CSVReader

object CSVReader {

  def loadFlatDatabase: List[List[Any]] = {
    val content =
      try {
        Source.fromInputStream(getClass.getResourceAsStream("/product-data.csv")).getLines().drop(1).toList map (_.split(",").toList)
      } catch {
        case ex: FileNotFoundException => {
          //Do Something
          List()
        }
      }

    content
  }

}
