package com.hasitha.spark

import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.log4j._
import scala.math._

object MaxTemperatures {
  
  def parseLine(line:String) ={
    val fields = line.split(",")
    val stationId = fields(0)
    val entryType = fields(2)
    val temperature = fields(3).toFloat * 0.1f * (9.0f / 5.0f) + 32.0f
    (stationId,entryType,temperature)
  }
  
  def main(args : Array[String]) {
    
    Logger.getLogger("org").setLevel(Level.ERROR)
    
    val sc = new SparkContext("local[*]","MaxTemperatures")
    
    val lines = sc.textFile("../1800.csv")
    
    lines.foreach(println)
    
    val parsedline = lines.map(parseLine)
    
    parsedline.foreach(println)
    
    }
  }