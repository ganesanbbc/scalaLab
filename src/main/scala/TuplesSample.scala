/**
  * Created by shanmg02 on 19/06/2016.
  */
object TuplesSample extends App {

  println("Hello I'm Here")


  def fixedTuples() = {
    var tupleVar1 = new Tuple2("date", "date2")
    println(tupleVar1)
  }

  fixedTuples()


  def freeFlowTuples() = {
    var tupleVar1 = ("date", "date2")
    println(tupleVar1._1);
    println(tupleVar1._2);
  }

  freeFlowTuples()

  def tupleSampleAction() = {
    var swapTuple = ("data1", 1).swap
    println(swapTuple)
  }


  tupleSampleAction()


}