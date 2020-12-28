import org.apache.spark.sql.SparkSession


object samplefile {
  def main(args: Array[String]): Unit = {
    val spark: SparkSession = SparkSession.builder().master("local[1]")
      .appName("SparkByExamples.com")
      .getOrCreate()
    val rddFromFile = spark.sparkContext.textFile("C:\\Users\\lokke\\Desktop\\Scala\\samplefile.txt", 4)
    println("Number of Partitions: " + rddFromFile.getNumPartitions)
    // println("Action: First element: " + rddFromFile.first())
    // println("Action: RDD converted to Array[Int] : ")
    // rddCollect.foreach(println)
  }


}
