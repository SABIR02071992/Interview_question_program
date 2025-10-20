fun main(){


    arrayList()
    number(40,10)
    number(20,12)
}

fun arrayList() {
   val list = ArrayList<String>()
    list.add("sabir")
    list.add("husain")
    list.add("sartaj")
    list.add("ahmad")
    println(list)

    val string: String = "leo_Ana_John"
    val yourArray: List<String> = string.split("_")
}
private fun number(num1:Int,num2:Int):Int{
    val value = num1+num2
    println(value)
    return value
}






