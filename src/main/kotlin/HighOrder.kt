fun proceed(operand: Int, times: Int, operation: (Int, Int) -> Int): Int {
    return if (times > 0) proceed(operation(operand, operand), times - 1, operation) else operand
}