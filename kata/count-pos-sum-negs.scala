object Kata {

  // Expects (0, 0) for empty array
  def countPositivesSumNegatives(integers: Array[Int]): (Int, Int) = {
    var posNumber = 0
    var  negNumber = 0

    for(number <- integers) { 
      if(number >= 0) posNumber = posNumber + 1
      else negNumber = negNumber + negNumber
    }
    (posNumber, negNumber) 
  }
}
