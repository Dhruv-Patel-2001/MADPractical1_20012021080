fun main(){
    print("Enter the number: ")
    val n1 = readLine()!!.toInt()
    if (n1%2==0){
        println("$n1 is Even !!")
    }
    else{
        println("$n1 is Odd !!")
    }
}