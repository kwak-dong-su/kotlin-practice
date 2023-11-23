package live

data class Person(var name: String, val age: Int) {
    override fun toString() = "제 이름은 ${name}이고, ${age}살 입니다"
}