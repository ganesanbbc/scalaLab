
var x = 3
x + 2

for(i <- 1 to 10){
  x+=1
}

def lambda = { x: Int ⇒ x + 1 }
var x1 = lambda(1)

val lambda4 = new Function1[Int, Int] {
  def apply(v1: Int): Int = v1 + 10
}

lambda4(1)

val a = List(1, 2, 3)
val b = List(1, 2, 3, 4)

( a eq b)
(a == b)

val a1: List[String] = Nil
val b1: List[Int] = Nil

a1 eq Nil
a1 == Nil


val a3 = List(1,2)
//a3.headOption
a3.head
//a3.tail
