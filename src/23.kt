fun main()
{
    try
    {
        print("Введите x: ")
        val x = readln().toDouble()
        print("Введите y: ")
        val y = readln().toDouble()
        print("Введите r: ")
        val r = readln().toDouble()
        print("Введите R: ")
        val R = readln().toDouble()
        when
        {
            r < R ->
            {
                when
                {
                    Math.pow(x, 2.0) + Math.pow(y, 2.0) >= Math.pow(r, 2.0) && Math.pow(x, 2.0) + Math.pow(y, 2.0) <= Math.pow(R, 2.0) -> println("Точка попадает в кольцо")
                    else -> println("Точка не попадает в кольцо")
                }
            }
            else -> println("r должно быть меньше R")
        }
    }
    catch (e:Exception)
    {
        println("Неверный формат ввода")
    }
}