object testSclala {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(63); 
  println("Welcome to the Scala worksheet");$skip(40); 
  
  def squreIt(x : Int) : Int = {x*x};System.out.println("""squreIt: (x: Int)Int""");$skip(22); 
  println(squreIt(2));$skip(43); 
  
  def tripleIt(x : Int) : Int = {x*x*x};System.out.println("""tripleIt: (x: Int)Int""");$skip(23); 
  println(tripleIt(2));$skip(59); 
  
  def transformInt(x:Int, f: Int => Int) : Int = {f(x)};System.out.println("""transformInt: (x: Int, f: Int => Int)Int""");$skip(87); 
                                                  
  println(transformInt(10,squreIt));$skip(87); 
  
  def transformAndAddInt(x:Int, f1: Int => Int,f2:Int => Int) : Int = {f1(x)+f2(x)};System.out.println("""transformAndAddInt: (x: Int, f1: Int => Int, f2: Int => Int)Int""");$skip(50); 
  println(transformAndAddInt(2,squreIt,tripleIt))}
  
}
