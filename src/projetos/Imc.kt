package projetos

class Projetos{

fun calcImc(peso: Double, altura: Double): String{
    if (peso  != 0.00 && altura != 0.00){
        val imc = peso / (altura * altura)
        return "seu imc é: $imc"
    }else{
        return "Peso ou altura inválidos"
    }
}
}