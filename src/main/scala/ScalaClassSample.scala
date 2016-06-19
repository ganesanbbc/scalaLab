/**
  * Created by shanmg02 on 19/06/2016.
  */
object ScalaClassSample extends App {

  val user1 = new User("Ganesh", 25, 100.34f, true);
  println(user1)
}


class User(name: String, age: Int, salary: Float, isPermanent: Boolean) {

  override def toString = s"User(Name:" + name + " and Age: " + age + ", Salary: " + salary + "and isPermanent:" + isPermanent + ")"
}

