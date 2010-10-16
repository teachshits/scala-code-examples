/** Turn command line arguments to uppercase */
object Main {
  def main(args: Array[String]) {
    val res = for (a <- args) yield a.toUpperCase
    
    for (a <- args) println("Argument: " + a)
  }
}
