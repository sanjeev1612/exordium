import java.util.Date

object PascalsTriangle extends App {

  for (row <- 0 to 10) {
    for (column <- 0 to row) {
      print(pascalsCoeffs(column, row) + " ")
    }
    println()
  }

  def pascalsCoeffs(column: Int, row: Int): Int = {
    if (row == column || row == 0 || column == 0) 1 else {
      pascalsCoeffs(column - 1, row - 1) + pascalsCoeffs(column, row - 1)
    }
  }

}
