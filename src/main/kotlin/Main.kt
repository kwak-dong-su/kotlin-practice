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

    // val 타입이지만 리스트 내부 값은 변경 가능
    languages.add("Kotlin")

    // val 타입이므로 재할당 불가능. 컴파일 에러
//    languages = arrayListOf("Python")

    // 문자열 안에서 '$' 접두어 사용 시 변수 출력 가능
    println("languages: $languages")

    var list2 = arrayListOf("C")
    println("list2: $list2")

    // var 타입이므로 재할당 가능 (최초 할당한 타입과 동일할 경우만)
    list2 = arrayListOf("C++")
    println("list2: $list2")

    // 다른 타입으로의 재할당은 불가능 (array list -> list)
//    list2 = listOf("C#")

    var num1 = 1
    num1 = 2

    // num1은 Int 타입으로 선언했으므로 컴파일 에러 (Int -> String)
//    num1 = "1"

    val num2 = 1

    // val 타입으므로 재할당 불가능
//    num2 = 2

    // 모든 변수는 객체 타입. 해당하는 타입에 정의된 함수 호출 가능
    "1".toString()

    // 변수 선언 시 초기화 가능한 타입 선언 가능.
    // '?' 접미사는 null 허용 여부(기본적으로 코틀린 변수는 null 할당 불가)
    var text1: String? = "1"
    var num3: Int? = null

    // nullable 변수는 접근 제어자 바로 사용 불가능(컴파일 에러).
    // '?.' 연산자를 사용해 내부 변수 및 함수 접근 가능
    // text1 값이 null 일 시, text1?.length 값은 null 반환
    println(text1?.length)

    // '?.' 접근 제어자를 사용하지 않는다면 컴파일 에러
    println(num3?.compareTo(1))
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

fun highOrderFunc() {
    val result = proceed(5, 3, ::mul)
    println(result)
    val result2 = proceed(5, 3) { a: Int, b: Int -> a + b }
    println(result2)

    val reflection = ::max
    val result3 = reflection.invoke(999, 1000)
    println(result3)
}

fun controlFlowFunc() {

    when ("Hello") {
        // Checks whether obj equals to "1"
        "1" -> println("One")
        // Checks whether obj equals to "Hello"
        "Hello" -> println("Greeting")
        // Default statement
        else -> println("Unknown")
    }

    val lam = {text: String -> print(text) }
    println(lam("dsa"))
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

//    lambdaFunc()

//    highOrderFunc()

    controlFlowFunc()

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}