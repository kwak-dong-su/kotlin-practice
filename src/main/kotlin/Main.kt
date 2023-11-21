import live.Animal
import live.Person

fun calculateFunc() {
    println(max(3, 5))
    println(add(3, 5))
    println(sub(3, 5))
    println(mul(3, 5))
}

fun variableFunc() {
    val languages = arrayListOf("Java")
    languages.add("Kotlin")
//    languages = arrayListOf("Python")
    println("languages: $languages")

    var list2 = arrayListOf("C")
    println("list2: $list2")
    list2 = arrayListOf("C++")
    println("list2: $list2")

    var num1 = 1
    num1 = 2
//    num1 = "1"

    val num2 = 1
//    num2 = 2

    "1".toString()

    var text1: String? = "1"
    var num3: Int? = null

    println(text1?.length)
}

fun objectFunc() {
    val tiger = Animal("호랑이", 4)
    println(tiger)

    val chul = Person("철수", 20)
    println(chul)

//    val func = FuncJava()
//    func.createAnimal()
}

fun operatorFunc(text: String?) {
    println(text?.length)
    println(text?.length ?: "null 변수입니다")
    println(text!!.length)
}

fun castFunc(a: Any?) {
    val value = a as? Int
    if(value is Int) println("$value * $value = ${value * value}")
    else println(a)
}


fun main(args: Array<String>) {
//    calculateFunc()

//    variableFunc()

//    objectFunc()

//    operatorFunc("안녕하세요, 반갑습니다.")
//    operatorFunc(null)

//    castFunc("안녕하세요")
//    castFunc(5)
//    castFunc(5.12313)





    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}