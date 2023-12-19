package robot

interface Robot {
    // 기본으로 적용할 default 함수를 적용할 수 있음 (Java 또한 마찬가지)
    // introduce() 미구현 시엔 println("저는 로봇입니다.") 함수를 호출
    fun introduce() = println("저는 로봇입니다.")
    fun move()
    fun stop()
    fun upgrade()
    fun upgrade(grade: Int)
}