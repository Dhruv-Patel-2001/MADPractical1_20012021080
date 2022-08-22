fun factLoop(num:Int):Int{
    var fact=1
    for (i in 1..num) {
        fact *= i
    }
    return fact
}

tailrec fun factTailrec(n:Int):Int {
    return if (n==1) 1 else n * factTailrec(n-1)
}

fun main() {
    print("Enter Number : ")
    val num : Int = readLine()!!.toInt()
    println("Factorial of 5 : ${factLoop(num)}")
    println("By Tailrec Keyword, Factorial of 5 : ${factTailrec(num)}")
}