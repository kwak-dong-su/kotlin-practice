import color.Color
import color.getColorName
import live.Animal
import live.Person
import robot.RobotA
import robot.RobotB

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

    val func = FuncJava()
    func.createAnimal()
    func.createAnimal("강아지", 4)

    println(tiger.hashCode())
    println(tiger == Animal("호랑이", 4))
    println(tiger === Animal("호랑이", 4))

}

fun operatorFunc(text: String?) {
    println(text?.length)
    println(text?.length ?: "null 변수입니다")
    println(text!!.length)

    var text2 = "안녕하세요, 반갑습니다. 222"
    println(text == text2)
    println(text === text2)
    println(text.hashCode())
    println(text2.hashCode())

    text2 = "안녕하세요, 반갑습니다."
    println(text == text2)
    println(text === text2)
    println(text.hashCode())
    println(text2.hashCode())
}

fun castFunc(a: Any?) {
    val value = a as? Int
    if(value is Int) println("$value * $value = ${value * value}")
    else println(a)
}

fun <T> ArrayList<T>.extensionFunc(index: Int = 0) {
    if (index < this.size) {
        println(this[index])
        this.extensionFunc(index + 1)
    }
}

fun interfaceFunc() {
    val robotA = RobotA()
    robotA.introduce()
    robotA.stop()
    robotA.move()
    robotA.move()
    robotA.stop()
    robotA.upgrade()
    robotA.upgrade(5)

    val robotB = RobotB()
    robotB.move()
    robotB.introduce()
}

fun declareDataClassFunc() {
    val animal = Animal("얼룩말", 4)
    val (name, foot) = animal
    println("$name $foot")

    animal.name = "고양이"
    println(animal)
    //compile error
//    animal.foot = 10
}

fun enumFunc() {
    println(Color.ORANGE)
    println(Color.ORANGE.rgb())
    println(Color.valueOf(Color.BLUE.name).b)
    println(getColorName(Color.YELLOW))
}

fun lambdaFunc() {
    val square = {num: Int -> num * num}
    println(square(5))

    val isGreaterThan : Int.(Int) -> Boolean = {this > it}
    println(3.isGreaterThan(5))

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

//    arrayListOf("Java", "Kotlin", "Python").extensionFunc()

//    interfaceFunc()

//    declareDataClassFunc()

//    enumFunc()

    lambdaFunc()


    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}