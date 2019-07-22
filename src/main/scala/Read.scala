import org.apache.spark.sql.SparkSession

object Read {


  def main(args: Array[String]): Unit = {
    println("this works" )

    val spark_ = SparkSession.builder().appName("Test_app").master("local").getOrCreate()
    val x  = spark_.read.csv("/Users/deepakkumarlakshmipathi/Desktop/craigslist-carstrucks-data/craigslistVehicles.csv")
    x.show(3)
  }
}
