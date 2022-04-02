fun main() {
    oddNumbers()

    println(names(arrayOf("Brenda", "Macharia", "Nkimalantoi", "Bree")))

    serveDrinks(5)
    serveDrinks(13)
    serveDrinks(23)

    div()

}
//Create a function that prints out all the odd numbers between 1 and 100
fun oddNumbers() {
    for (number in 1..100) {


        if (number % 2 !== 0) {
            println(number)
        }
    }
    }
//Create a function that takes in an array of names and returns the number of
//names longer than 5 characters
fun names(n:Array<String>):Int {
    var num=0
    n.forEach{m->
        if (m.length>5){
            num++
        }
    }
    return num
}
//You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age.
fun serveDrinks(x:Int) {
    if (x < 6) {
        println("Under 6 years-You get milk.")
    }
    else if (x < 15 && x > 6) {
        println("Under 15 years but over 6 years-You get fanta orange.")
    }
    else{
        println("Above 15 years-You get cocacola.")
    }
}
//Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number.
fun div(){
    for (x in 1..100){
        if (x%3==0) {
            println("Fizz")
        }else if (x%5==0){
            println("Buzz")
        }
        if (x%3==0 && x%5==0){
            println("FizzBuzz")
        }
    }
}



