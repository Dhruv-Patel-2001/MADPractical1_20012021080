//Scan student’s information and display all the data.
fun main()
{
    println("Student Enrollment No:")
    var stuenroll:String = readLine()!!.toString()

    println("Student Name:")
    var stuname:String = readLine()!!.toString()

    println("Student Age:")
    var stuage:Int = readLine()!!.toInt()

    println("Student Branch:")
    var stubranch:String = readLine()!!.toString()

    println("Student Class:")
    var stuclass:String = readLine()!!.toString()

    println("Student Batch:")
    var stubatch:String = readLine()!!.toString()

    println("Student Collage Name:")
    var stucollage:String = readLine()!!.toString()

    println("Student University Name:")
    var stuUniname:String = readLine()!!.toString()

    println("\n\n---->Student Data<----")
    println("Enrollment Name : $stuenroll")
    println("Name : $stuname")
    println("Branch : $stubranch")
    println("class : $stuclass")
    println("Batch : $stubatch")
    println("collage Name: $stucollage")
    println("University Name: $stuUniname")

}