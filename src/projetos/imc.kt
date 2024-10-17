package projetos

class Imc{
    fun calcImc(peso: Double, altura: Double): String{
        if (peso != 0.00 && altura != 0.00){
            val imc = peso / (altura * altura)
            return obterSaude(imc)
        }else{
            return "Peso ou altura inválidos"
        }

    }
    private fun obterSaude(imc: Double): String {
        if (imc <= 18.5) { //declara a saúde do usuário
            return "seu imc é ${String.format("%.2f", imc)} ele está abaixo do peso, regulamente sua alimentação!"
        } else if (imc > 18.5 && imc <= 24.99) {
            return "seu imc é ${String.format("%.2f", imc)} ele está normal, continue assim!"
        } else if (imc in 25.0..29.99) {
            return "seu imc é ${String.format("%.2f", imc)} ele está acima do normal, tome cuidado!"
        } else {
            return "seu imc é ${String.format("%.2f", imc)} ele está alarmante! Procure um nutricionista o quanto antes."
        }
    }
}