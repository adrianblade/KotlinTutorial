import sun.security.pkcs11.wrapper.CK_C_INITIALIZE_ARGS

/**
 * Created by Adrian on 02/04/2017.
 */
public class Customer(customerId: Int) {
    val id = customerId
    var name : String = ""

    fun doSomething() {
        println("Some code")
    }
}

public class Employee(val id: Int, val name: String, val email: String) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other?.javaClass != javaClass) return false

        other as Employee

        if (id != other.id) return false
        if (name != other.name) return false
        if (email != other.email) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + name.hashCode()
        result = 31 * result + email.hashCode()
        return result
    }
}

fun String.convertSpacesToUnderscores(): String {
    return this.replace("","_")
}


fun main (args: Array<String>) {

    val employee1 = Employee(1, "Pepe","pepe@")
    val employee2 = Employee(1, "Pepe","pepe@")
    val employee3 = employee1

    println(employee1)
    println(employee1.hashCode())
    println(employee1.equals(employee2))
    println(employee1.equals(employee3))
}
