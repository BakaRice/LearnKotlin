fun main() {
    //infix => 中缀
    //infix functions => 中缀函数


    //此处的times是自定义的函数名称
    //Defines an infix extension function on Int.
    //定义了一个Int的infix 扩展函数
    infix fun Int.times(str: String) = str.repeat(this)
    //调用中缀函数
    println(2 times "Bye")

    //to 是一个来自标准库的中缀函数
    //通过调用 to函数来创建一个变量 pair
    val pair = "Ferrai" to "Katrina"
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "McLaren" onto "Lucas"

    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    //中缀函数对成员函数（方法）上依然生效
    sophia likes claudia
    sophia likes sophia
}

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()

    //The containing class becomes the first parameter.
    //包含该中缀函数的类成为第一参数
    infix fun likes(other: Person) {
        likedPeople.add(other)
    }
}