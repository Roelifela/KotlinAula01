fun main(){

//    val inteiro = 1
//    val numeroGrande = 1L
//    val numeroGrande2 = 123456789098765432
//    val inteiro1: Int = 1
//    val numeroGrande3: Long = 7654321
//    val texto = "Rodrigo"
//    val texto1: String = "Cordeiro"
//    val ehMaior = true
//    val ehMaior1: Boolean = false
//
//    println(5 == 5)
//


println (retornaMaiorNumero(3, 2, 1))

}

fun retornaMaiorNumero(num1: Int, num2: Int, num3: Int) {

    var maior: Int

    if (num1 > num2 && num1 > num3){
        maior = num1
    }else if (num2 > num1 && num2 > num3){
        maior = num2
    }else if (num3 > num1 && num3 > num2){
        maior = num3
    }


}