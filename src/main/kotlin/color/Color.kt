package color

enum class Color(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255);

    fun rgb() = (r * 256 + g) * 256 + b
}

fun getColorName(color: Color) = when(color) {
    Color.RED -> "빨강"
    Color.ORANGE -> "주황"
    Color.YELLOW -> "노랑"
    Color.GREEN -> "초록"
    Color.BLUE -> "파랑"
}