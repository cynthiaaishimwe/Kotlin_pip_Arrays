fun main(args: Array<String>) {

    val new = threeNames("mercy","angeth","esther")
 println(new.contentToString())
    println(getAverage())
}
//3. Create a function that takes in 3 names and returns a string array containing all 3 names. (2 points)

fun threeNames(person1: String,person2: String,person3:String):Array<String>{
  return arrayOf( person1,person2,person3)
}

//Given a list of Person objects, each with the attributes, name, age, height,
//and weight. Sort the list in order of descending age


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