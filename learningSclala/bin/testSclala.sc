object testSclala {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def squreIt(x : Int) : Int = {x*x}              //> squreIt: (x: Int)Int
  println(squreIt(2))                             //> 4
  
  def tripleIt(x : Int) : Int = {x*x*x}           //> tripleIt: (x: Int)Int
  println(tripleIt(2))                            //> 8
  
  def transformInt(x:Int, f: Int => Int) : Int = {f(x)}
                                                  //> transformInt: (x: Int, f: Int => Int)Int
                                                  
  println(transformInt(10,squreIt))               //> 100
  
  def transformAndAddInt(x:Int, f1: Int => Int,f2:Int => Int) : Int = {f1(x)+f2(x)}
                                                  //> transformAndAddInt: (x: Int, f1: Int => Int, f2: Int => Int)Int
  println(transformAndAddInt(2,squreIt,tripleIt)) //> 12
  
}