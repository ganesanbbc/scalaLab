/**
  * Created by shanmg02 on 19/06/2016.
  */
object ListSample extends App {


  readList

  def readList: Unit = {
    var a = List(1, 2, 3)
    println(a)
    println("Read Using Head::" + a.head)
    println("Read Using HeadOption : " + a.headOption)
    println("Read Using Tail:" + a.tail)
    println("Reading Length:" + (a.length))
    println("Reading using Index:" + a(1))
    println("Reading using Last Index(Length):" + a(a.length - 1))
    for (i <- a) {
      println("Item::" + i)
    }
  }


  compareList

  def compareList: Unit = {
    var a = List(1, 2, 3)
    var b = List(1, 2, 3)
    println("is Same Collection::" + (a eq b))

    println("Equal By Data::" + (a == b))

    var c = a
    println("a == c Same Collection::" + (a eq c))

    a = Nil
    println("Cleared A data :" + a)
  }

  filterList

  def filterList: Unit = {
    var a = List(1, 2, 3, 4, 5, 6)
    var sliceList = a.slice(0, 2);
    println("sliceList action:" + (sliceList))

    var oddNumberFilterList = a.filterNot(item => item % 2 == 0)
    println("filterList action:" + (oddNumberFilterList))

    var filterList = a.filterNot(item => (item == 1 || item == 2))
    println("filterList action:" + (filterList))

    var filterList1 = a.filter(item => (item == 1 || item == 2))
    println("filterList action:" + (filterList1))
  }


}
