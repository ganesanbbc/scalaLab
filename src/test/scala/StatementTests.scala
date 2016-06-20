import org.scalatest.{BeforeAndAfter, FunSuite}

/**
  * Created by shanmg02 on 19/06/2016.
  */
class StatementTests extends FunSuite with BeforeAndAfter {

  var statementSample: StatementSample = _

  before {
    statementSample = new StatementSample
  }

  test("Switch Case Sample 1") {
    val expectedValue = "One"
    var actualValue = statementSample.simpleSwitch(1);
    assert(expectedValue == actualValue)
  }


  test("Switch Case Sample default") {
    val expectedValue = "Other"
    var actualValue = statementSample.simpleSwitch(5);
    assert(expectedValue == actualValue)
  }


}
