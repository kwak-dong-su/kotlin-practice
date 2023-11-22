package robot

interface Robot {
    fun introduce() = println("저는 로봇입니다.")
    fun move()
    fun stop()
    fun upgrade()
    fun upgrade(grade: Int)
}