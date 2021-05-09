object GradeCalculate {

  def main(args:Array[String])
  {
    val grade:Int = 68

   /*val gradepercent = grade match    // switch case
      {
      case 1 =>
      case 2 =>
      case 3 =>
      case _ =>
    }*/

    if(grade>= 90 && grade <= 100)
      {
        println("Congrats You Got Grade A")

      }

    else if (grade>= 80 && grade < 90)
    {
      println("Congrats You Got Grade B")

    }

    else if (grade>= 70 && grade < 80)
    {
      println("Congrats You Got Grade C")

    }


    else
      {
        println("You Are Failed")
      }
  }
}
