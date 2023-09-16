object Recursion extends App {
def factorial(n:Int):Int =
  if(n<=1) 1
  else {
    println("Computing factorial of  " + (n-1))
    val result = n*factorial(n-1)
    println("Computed factorial of  " + n)
    result
  }
 //println(factorial(6))
def anotherFactorial(n:BigInt):BigInt = {
  def factHelper(x: BigInt, accumalator: BigInt):BigInt = {
    if(x<=1) accumalator
    else factHelper(x-1, x*accumalator)
  }
  factHelper(n, 1)
}
println(anotherFactorial(50))
  /**
   * 1. Concatenate a string n times
   * 2. isPrime function tail recursive
   * 3. Fibonacci function tail recursive
   */
def concatenateTailRec(aString:String , n:Int, accumalator:String): String = {
 if(n<=0) accumalator
 else concatenateTailRec(aString, n-1, aString + " " + accumalator)
}
  println(concatenateTailRec("amit", 1000, ""))



def isPrime(n:Int):Boolean = {
  def isPrimeTailRec(t: Int, isStillPrime:Boolean):Boolean = {
    if(!isStillPrime) false
    else if (t <= 1) true
    else isPrimeTailRec(t-1, n%t != 0)
  }
  isPrimeTailRec(n/2, true)
}

println(isPrime(2003))
println(isPrime(1997))
println(isPrime(1998))

def fibbonaci(n: Int): Int = {
  def fibTailRec(i: Int, last: Int, nextToLast: Int): Int = {
   if(i>=n) last
   else fibTailRec(i+1, last + nextToLast, last)
  }
  if(n<= 2) 1
  else fibTailRec(2,1,1)
}
println(fibbonaci(8))
}