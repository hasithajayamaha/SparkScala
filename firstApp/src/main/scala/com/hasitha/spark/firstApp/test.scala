package com.hasitha.spark.firstApp

import org.apache.spark._
import org.apache.log4j._
import java.text._

object test {
  
  def parseLine(line: String) = {
      // Split by commas
      val fields = line.split(",")
      //val format = new java.text.SimpleDateFormat("dd-MM-yyyy")
      // Extract the age and numFriends fields, and convert to integers
      val ticketno = fields(1).toInt
      val sector = fields(2).toString()
      val fltdate = fields(3)
      val carrier = fields(4)
      // Create a tuple that is our result.
      (ticketno, sector, fltdate, carrier)
  }
  
  def main(args: Array[String]) {
    println("Start")
    
    Logger.getLogger("org").setLevel(Level.ERROR)
    
    val appName = "firstApp"
    val sc = new SparkContext("local[*]", appName)   
    val data = sc.textFile("../itn.csv")
    val rdd = data.map(parseLine)  
    
    rdd.foreach(println)
    
    println("end")
  }
}