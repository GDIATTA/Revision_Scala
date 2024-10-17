package org.jetbrains.scala
import Array._
object Hello {
  val greeting: String = "Hello, world!"
  def main(args:Array[String]): Unit = {
    println("Hello\tWorld\n\n");
  }
  {
    var myVar: String = "Foo";
    println(myVar);
  }
  {
    var myVar =20;
    val myVal = "Hello Scala new without datatype";
    println(myVar); println(myVal);
    println(greeting);
  }
  {
    var palindrome = "Dot saw I was Tod";
    var len = palindrome.length();
    println("String Length is : " +len);
    println(palindrome.concat("Zara"));
  }
  {
    var floatVar = 12.456
    var intVar = 2000
    var stringVar = "Hello, Scala!"

    var fs = printf("The value of the float variable is " + "%f, while the value of the integer " + "variable is %d, and the string" + "is %s", floatVar, intVar, stringVar);

    println(fs);
  }
  {
    val name = "James"

    println(s"Hello, $name");
    println(s"1 + 1 = ${1 + 1}");
  }
  {
    var myList = Array(1.9, 2.9, 3.9);
    for (i <- myList){
      println(i);
    }
    var total = 0.0;

    for ( i <- 0 to (myList.length - 1)) {
      total += myList(i);
    }
    println("Total is " + total);
    // Finding the largest element
    var max = myList(0);

    for ( i <- 1 to (myList.length - 1) ) {
      if (myList(i) > max) max = myList(i);
    }
    println("Max is " + max);
  }
  {
    var myMatrix = ofDim[Int](3,3)

    // build a matrix
    for (i <- 0 to 2) {
      for ( j <- 0 to 2) {
        myMatrix(i)(j) = j;
      }
    }

    // Print two dimensional array
    for (i <- 0 to 2) {
      for ( j <- 0 to 2) {
        print(" " + myMatrix(i)(j));
      }
      println();
    }
  }
    {
      println( "Returned Value : " + addInt(5,7) );
    }
  {
    for (i <- 1 to 10)
      println( "Factorial of " + i + ": = " + factorial(i) )
  }

  def addInt( a:Int, b:Int ) : Int = {
    var sum:Int = 0
    sum = a + b

    return sum
  }
  def factorial(n: BigInt): BigInt = {
    if (n <= 1)
      1
    else
      n * factorial(n - 1)
  }

}
