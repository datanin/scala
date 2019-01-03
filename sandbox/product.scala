val conf = new SparkConf().setAppName("reduce").setMaster("local[*]")
val sc = new SparkContext(conf)

val inputIntegers = List(1, 2, 3, 4, 5)
val integerRdd = sc.parallelize(inputIntegers)

val product = integerRdd.reduce((x, y) => x * y)
