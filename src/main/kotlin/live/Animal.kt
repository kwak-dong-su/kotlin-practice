package live

data class Animal(var name: String, val foot: Int) {
    override fun toString() = "저는 ${name}이고, 발은 ${foot}개 입니다"
}