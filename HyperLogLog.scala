import scala.io.Source
import scala.util.hashing.{MurmurHash3 => mh3}
object DistinctWords {
  import scala.math._
  def main(args: Array[String]): Unit = {
    if (args.length > 0)
    { 
// I check if the filename was given.
      val alpha = 0.697 //I define coefficient (value of it results from probabilistic analysis).
      val m = pow(2,10).toInt //I define the number of buckets (the greater number of buckets, the grater precision.
      val file = args(0)  // I save the input filename.
      val fileSource = Source.fromFile(file) // I save words from input file.
      val words = fileSource.mkString.split("\\W+").map(_.toLowerCase).toList // I save words in the type String and I change big letter to lower case.
      fileSource.close() // I close the input file.
      val Zj = Array.fill(m)(0) //I define array of buckets.
      val hash = words.map(s=>mh3.stringHash(s)) //I define the value hashes, which takes the word (from file) and then changes it on the target hash value.
      for(i<-hash){ // I create the loop, which will go through the entire hashes.
        val zeros = Integer.numberOfLeadingZeros(i) + 1 //I define temp, which represents number of leading zeros.
        val j = abs(i%m) //I define an index, which is the rest from the division number i by 2^10. (For example: for index 5 we have bucket, which will count number of zeros for numbers, which divided by m gives the rest 5.)
        if(Zj(j)<zeros) //Stochastic Counting Alghoritm.
          Zj(j) = zeros//If the condition is met, I change value of each bucket.
      }
      val Zjp = Zj.map(pow(2,_)) //I define the table, which contains a number of distinct words (2 to power of maximal number of leading zeros).
      val harmonicZjp = (m*m/Zjp.map(1/_).sum*alpha).toInt//I define harmonic mean multiplied by number of buckets and alpha.
      println(s"The number of distinct words = $harmonicZjp")
    }
  }
}