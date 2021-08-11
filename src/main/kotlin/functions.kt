//Functions

///Default Parameter Values and Named Arguments
//普通无返回类型的函数
fun printMessage(message: String) {
    println(message)
}

//无返回类型 包含可选参数的函数
fun printMessageWithPrefix(message: String, prefix: String = "info") {
    println("[${prefix}]$message")
}

//返回类型为Int的函数
fun sum(x: Int, y: Int): Int {
    return x + y
}

//A single-expression function that returns an integer (inferred).
//单行表达式函数 通过推断方式获取类型
fun multiply(x: Int, y: Int) = x * y

fun main() {
    printMessage("Hello")
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    println(sum(1, 2))
    println(multiply(2, 4))
}


