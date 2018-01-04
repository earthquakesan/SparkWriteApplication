package org.ermilov

import org.apache.spark.{SparkConf, SparkContext}

object SparkWriteApplication extends App {
  val config = new SparkConf().setMaster("spark://spark-master:7077").setAppName("SparkWriteApplication")
  val sc = new SparkContext(config)

  val numbersRdd = sc.parallelize((1 to 10000).toList)
  numbersRdd.saveAsTextFile("hdfs://namenode:8020/tmp/numbers-as-text")
}

