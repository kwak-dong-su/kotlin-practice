package robot

class RobotA : Robot {
    private var isMoving = false
    private var grade = 1

    override fun move() {
        if(!isMoving) {
            println("이동합니다.")
            isMoving = !isMoving
        } else {
            println("이미 이동 중입니다.")
        }
    }

    override fun stop() {
        if(isMoving) {
            println("정지합니다.")
            isMoving = !isMoving
        } else {
            println("이미 정지 상태입니다.")
        }
    }

    override fun upgrade() {
        println("${++grade}단계로 업그레이드.")
    }

    override fun upgrade(grade: Int) {
        this.grade += grade
        println("${this.grade}단계로 업그레이드.")
    }
}