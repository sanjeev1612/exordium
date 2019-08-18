import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import PascalsTriangle.pascalsCoeffs

@RunWith(classOf[JUnitRunner])
class PascalSuite extends FunSuite {
    test("pascal: col=0,row=2") {
      assert(pascalsCoeffs(0,2) === 1)
  }

    test("pascal: col=1,row=2") {
      assert(pascalsCoeffs(1,2) === 2)
  }

    test("pascal: col=1,row=3") {
      assert(pascalsCoeffs(1,3) === 3)
  }

}
