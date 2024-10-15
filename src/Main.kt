//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //val car:Car = Car()
    //car.turnOn()
    ///car.reDraw()
    //car.lenght = 100

    //val cabr1:Cabr = Cabr()
    //cabr1.roof()
    //cabr1.turnOn()

    val kangaroo = Kangaroo()
    val el = Elephant()
    val snake = Snake()

    kangaroo.move()
    el.move()
    snake.move()
    println("////")

    val animals = mutableListOf<Animal>()
    animals.add(el)
    animals.add(snake)
    animals.add(kangaroo)

    for (i in animals) {
        println(i.move())
    }
    println(kangaroo.material)

    val furniture:Furniture = Furniture("dsp", 1000, "123")
    println(kangaroo.toString())


}


