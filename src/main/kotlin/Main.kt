fun main(args: Array<String>) {

    var new = threeNames("mercy", "angeth", "esther")
    println(new.contentToString())
    println(getAverage())
    //Given a list of Person objects, each with the attributes, name, age, height,
//and weight. Sort the list in order of descending age
    data class ClassMates(val name: String, val age: Int, val height: Int, val weight: Int)

    val mates = listOf(
        ClassMates("Winfrida", 23, 180, 70),
        ClassMates("Joyce", 20, 175, 55),
        ClassMates("Annet", 22, 163, 45),
    )
    var sortedList = mates.sortedByDescending { it.age }
    println(sortedList)
    arr()
}

//3. Create a function that takes in 3 names and returns a string array containing all 3 names. (2 points)

fun threeNames(person1: String,person2: String,person3:String):Array<String>{
  return arrayOf( person1,person2,person3)
}




//4. Write a function that takes in a list of Car objects each with a registration
//and mileage attribute and returns the average mileage of all the vehicles in the list. (3)

data class Car(var registration: Int,var mileage: Double)

fun getAverage(): Double{
    var myCar = Car(88,10.0)
    var friendsCar = Car(10,60.2)
    var ourValue = listOf(myCar,friendsCar)
    var sum = 0.0
    for (i in ourValue){
        sum += i.mileage
    }
    var finalList = ourValue.size
     var newList = sum /finalList

    return newList

}
//Create one function that is given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements (1 point)
//(ii) prints out the index of 158 (1 point)
//(iii) prints out the elements in ascending order.

fun arr(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var addition  = numbers[1]+numbers[4]
    println(addition)
    println(numbers.indexOf(158))
    println(numbers.sorted())
}

