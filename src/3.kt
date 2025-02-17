fun main()
{
    try
    {
    print("Введите x: ")
    val x = readln().toDouble()
    print("Введите y: ")
    val y = readln().toDouble()
    print("Введите z: ")
    val z = readln().toDouble()
    var max:Double; var min:Double
    when
    {
        x > z -> max = x
        z > x -> max = z
        else -> max = x
    }
    when
    {
        x < z && x < y -> min = x
        y < z && y < x -> min = y
        z < x && z < y -> min = z
        else -> min = x
    }
        println("max (x,z) = " + max + " min(x,y,z) = " + min)
    println("L = " + (2 * max - 3 * min))
    }
    catch (e:Exception)
    {
        println("Неверный тип данных")
    }
}