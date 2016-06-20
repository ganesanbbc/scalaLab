import scala.annotation.switch

/**
  * Created by shanmg02 on 19/06/2016.
  */
class StatementSample {



  
  def simpleSwitch(i: Int) : String= {

    val x = (i: @switch) match {
      case 1  => "One"
      case 2  => "Two"
      case _  => "Other"
    }
    return x
  }


}
