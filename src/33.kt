fun main()
{
    try
    {
        print("Введите R: ")
        val R = readln().toDouble()
        print("Введите k: ")
        val k = readln().toDouble()
        print("Введите b: ")
        val b = readln().toDouble()
        val c = Math.pow(b, 2.0) - Math.pow(R, 2.0)
        val discriminant = Math.pow(k, 2.0) + 4 * c
        when
        {
            discriminant >= 0 -> {
                val x1 = Math.round((-k + Math.sqrt(discriminant)) / 2)
                val y1 = Math.round(k * x1 + b)
                val x2 = Math.round((-k - Math.sqrt(discriminant)) / 2)
                val y2 = Math.round(k * x2 + b)
                println("Точка 1: " + x1 + " " + y1)
                println("Точка 2: " + x2 + " " + y2)
            }
            else -> println("Решений нет")
        }
    }
    catch (e:Exception)
    {
        println("Неверный тип данных")
    }
}