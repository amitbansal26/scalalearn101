object Functions extends App {

  def aFunction(a:String, b:Int) : String = {
    a + " " + b
  }
println(aFunction("hello", 3))

def aParameterLessFunction():Int = 42
println(aParameterLessFunction())

def aRepeatedFunction(aString:String, n:Int):String = {
  if(n==1) aString
  else aString + " " + aRepeatedFunction(aString, n-1)
}
println(aRepeatedFunction("amit", 11))

// When you need loops use recursion
def aFunctionWithSideEffects(aString:String):Unit =  println(aString)
}
