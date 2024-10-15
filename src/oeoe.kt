import java.util.*


fun main() {
    println("Halo")

    var i = 1
    val i2 = 2
    var i3 : Int = 10
    var sh:Short = 1 //16
    var by:Byte = 0 // 8
//    Float, Double,
    var s:String = "e"
    var t = true

    var take = Scanner(System.`in`)

//    println("Type num")
//    var num = take.nextInt()
//    num += 1
//    println(num)

//    if(num > 5) {
//        println("more than 5")
//    }
//    else
//        println("less than five")
//
//    when(num) {
//        5 -> {
//            println("5")
//        }
//
//        6 -> {
//            println("6")
//        }
//        in 1<..<5->{
//        println("w")
//        }
//    }

    var p = 5

    for(o in 1..<10){
        print("$o : ")
    }

    while(p<10){
        println("$p")
        p++
    }

    do{
        println("")
        p++
    }while(p<15)

    get_something(3,2)

    var odin = 1
    odin = odin.addOne()

    var array:Array<String> = Array(size = 10) { i -> "1" }
    var ar = mutableListOf<String>()

    for (p in 1..7){
        ar.add(p.toString())
    }
    println(ar)


}


fun get_something(i:Int, l:Int){
    println("${i-l}")

}

fun ret():String{
    return "00"
}

fun Int.addOne():Int{
    return this + 1
}

