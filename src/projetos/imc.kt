package projetos

class Imc{

fun calcImc(peso: Double, altura: Double): String{
    if (peso != 0.00 && altura != 0.00){
        val imc = peso.toFloat() / (altura.toFloat() * altura.toFloat())
        return "Seu imc é: $imc"
    }else{
        return "Peso ou altura inválidos"
    }

}
}