// Scala program of function call-by-value 

// Creating object 
object GFG {
  // Main method
  def main(args: Array[String]) {
    // Defined function
    def ArticleCounts(i: => Int) {
      println("Tanya did article " +
        "on day one is 1 - Total = " + i)
      println("Tanya did article " +
        "on day two is 1 - Total = " + i)
      println("Tanya did article " +
        "on day three is 1 - Total = " + i)
      println("Tanya did article " +
        "on day four is 1 - Total = " + i)
    }

    var Total = 0;

    // function call
    ArticleCounts {
			println("calling function.....")
      Total += 1;
      Total

    }
  }
} 
