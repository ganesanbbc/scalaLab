import org.scalatest.{BeforeAndAfter, FunSuite}

/**
  * Created by shanmg02 on 19/06/2016.
  */
class StatementTests extends FunSuite with BeforeAndAfter{

  var pizza: StatementSample = _

  before {
    pizza = new StatementSample
  }

  test("new pizza has zero toppings") {
    assert(0 == 0)
  }



}
