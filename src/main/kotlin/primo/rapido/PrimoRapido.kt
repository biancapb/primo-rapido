package primo.rapido


import kotlin.math.sqrt

fun main() {

    println("Informe a quantidade de linhas: ")
    val numberOfLines = readLine()!!.toInt() //número de linhas

    for (i in 1..numberOfLines) {
        //recebe um valor para verificar se é ou não primo
        println("\nInforme o $i º valor: ")
        val value = readLine()!!.toDouble()
        if (!primeOrNotPrime(value)) {
            println("Not Prime")
        } else if (primeOrNotPrime(value)) {
            println("Prime")
        }
        println("------------------------")
    }
}

//função para verificar se o valor é ou não primo, retorna um booleano
fun primeOrNotPrime(value: Double) : Boolean {
    //raiz quadrada
    val squareRoot: Int

    //se o valor for menor que dois, significa que não é primo
    if (value < 2) {
        return false
    }
    //se o valor for igual a dois, ele é primo :)
    if (value == 2.0) {
        return true
    }
    //se o resto da divisão do valor por 2 for igual a 0, ele não é primo
    if (value % 2 == 0.0) {
        return false
    }

    //raiz quadrada do valor
    squareRoot = sqrt(value).toInt()

    for (i in 3..squareRoot step 2) {
        //se o resto da divisão do valor pelo iteraçao for igual a zero, ele não é primo
        if (value % i == 0.0) {
            return false
        }
    }
    return true
}