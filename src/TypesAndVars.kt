/**
 * Created by Adrian on 02/04/2017.
 */
fun main(args: Array<String>) {
   var_declarations()
}

fun var_declarations() {
    var a:Int = 64;
    var b:Long = 123;
    var c:Float = 2.3f;
    var d:Double = 12.3;
    println("$a $b $c $d")

    val e:Int;
    e = a ;
    println("$e")

    replaceBuffer(StringBuffer("test"));
}

/**
 * Replace T by Uppercase
 */
fun replaceBuffer(f:StringBuffer) {
    f.replace(0,1,"T")
    println(f);
}

