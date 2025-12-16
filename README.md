# HyperLogLog
Hyperloglog is a probabilistic algorithm using stochastic counting to find the number of distinct elements in datasets.
Here is an example of the use of the Scala language for this algorithm. The result value is approximate; however, accuracy can be altered by manipulating the parameters of a program (e.g., number of buckets, hash functions).

## Instructions
First to use the program, one must install the Scala compiler. To do so, enter the site and follow the given steps: https://docs.scala-lang.org/getting-started/index.html

Then, to start the program, one must type the following commands in a terminal:
```
scalac HyperLogLog.scala
scala DistinctWords <text filename>
```
