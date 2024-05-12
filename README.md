# HyperLogLog
Hyperloglog is a probabilistic algorithm using stochastic counting to find the number of distinct elements in datasets. It is beneficial in the large datasets.
Here is an example of the use of the Scala language of this algorithm when it comes to counting distinct words in the text. The result value is approximate, however, accuracy can be altered by manipulating the parameters of a program.

## Instructions
First to use the program, one must install the Scala compiler. To do so, enter the site and follow the given steps: https://docs.scala-lang.org/getting-started/index.html

Then to start the program one must type following commands in a terminal:
```
scalac HyperLogLog.scala
scala HyperLogLog <text filename>
```
