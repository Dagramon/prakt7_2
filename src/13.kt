fun main()
{
    try
    {
        print("Введите x: ")
        val x = readln().toDouble()
        print("Введите y: ")
        val y = readln().toDouble()
        when
        {
            Math.pow(x, 2.0) + Math.pow(y, 2.0) >= 1 && Math.pow(x, 2.0) + Math.pow(y, 2.0) <= 4 && y >= 0 ->
            {
                println("a: точка принадлежит")
            }
        }
        when
        {
            y <= x / 2 && Math.pow(x, 2.0) + Math.pow(y, 2.0) <= 1.0 ->
            {
                println("б: точка принадлежит")
            }
        }
        when
        {
            y <= 1 - Math.pow(x, 2.0) && Math.pow(x, 2.0) + Math.pow(y - 1, 2.0) <= 1.0 ->
            {
                println("в: точка принадлежит")
            }
        }
        when
        {
            Math.pow(x, 2.0) + Math.pow(y, 2.0) <= 1 && y >= 0 ->
            {
                if (Math.pow(x, 2.0) + Math.pow(y, 2.0) >= Math.pow(0.3, 2.0) && x >= 0)
                {
                    println("г: точка принадлежит")
                }
            }
        }
        when
        {
            Math.pow(x, 2.0) + Math.pow(y, 2.0) <= 1 && y >= -x && y >= x ->
            {
                println("д: точка принадлежит")
            }
        }
        when
        {
            y >= Math.pow(x, 2.0) && y <= Math.pow(Math.E, -x) && y <= Math.pow(Math.E, x) ->
            {
                println("е: точка принадлежит")
            }
        }
    }
    catch (e:Exception)
    {
        println("Неверный формат ввода")
    }
}