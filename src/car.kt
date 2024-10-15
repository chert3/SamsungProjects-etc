import java.awt.Color

open class Car(

    private var color:Color = Color.red,
    var lengh:Int = 20,
    private var model:String = "Aue car"

) {
    open fun turnOn() {
        //get it work
    }
    fun reDraw() {
        //e
    }

//    getter setter
    fun getLenght():Int {
        return lengh
    }
    fun setLenght(l:Int) {
        this.lengh = 1
    }

}