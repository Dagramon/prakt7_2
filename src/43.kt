fun main() {
    println("Введите k1:")
    val k1 = readln().toDouble()
    println("Введите b1:")
    val b1 = readln().toDouble()
    println("Введите k2:")
    val k2 = readln().toDouble()
    println("Введите b2:")
    val b2 = readln().toDouble()
    println("Введите радиус e:")
    val e = readln().toDouble()
    when
    {
        (k1 == k2 && b1 == b2) ->
            {
            println("Прямые совпадают.")
            when
            {
                (Math.abs(b1) <= e) -> println("Прямая пересекает e-окрестность начала координат.")
                else -> println("Прямая не пересекает e-окрестность начала координат.")
            }
        }
        else ->
            {
            val x = (b2 - b1) / (k1 - k2)
            val y = k1 * x + b1
            val distance = Math.sqrt(x * x + y * y)
            when {
                (distance <= e) -> println("Точка пересечения находится в e окрестности начала координат" + x + " " + y)
                else -> println("Точка пересечения не находится в e окрестности начала координат" + x + " " + y)
            }
        }
    }
}