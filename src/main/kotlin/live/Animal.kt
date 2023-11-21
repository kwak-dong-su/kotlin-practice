package live

class Animal(private val name: String, private val foot: Int) {
    override fun toString() = "저는 ${name}이고, 발은 ${foot}개 입니다"
}