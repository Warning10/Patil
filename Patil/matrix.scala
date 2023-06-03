object MatrixMultiplication {
  def multiplyMatrix(matrix1: Array[Array[Int]], matrix2: Array[Array[Int]]): Array[Array[Int]] = {
    val rows1 = matrix1.length
    val cols1 = matrix1(0).length
    val cols2 = matrix2(0).length
    
    val result = Array.ofDim[Int](rows1, cols2)
    
    for (i <- 0 until rows1) {
      for (j <- 0 until cols2) {
        var sum = 0
        for (k <- 0 until cols1) {
          sum += matrix1(i)(k) * matrix2(k)(j)
        }
        result(i)(j) = sum
      }
    }
    
    result
  }
  
  def printMatrix(matrix: Array[Array[Int]]): Unit = {
    for (row <- matrix) {
      for (element <- row) {
        print(element + " ")
      }
      println()
    }
  }
  
  def main(args: Array[String]): Unit = {
    val matrix1 = Array(Array(1, 2, 3), Array(4, 5, 6))
    val matrix2 = Array(Array(7, 8), Array(9, 10), Array(11, 12))
    
    val result = multiplyMatrix(matrix1, matrix2)
    printMatrix(result)
  }
}
