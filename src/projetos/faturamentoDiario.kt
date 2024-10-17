package projetos

class faturamentoDiario(
    val fatDiario: Map<String, Double> = mapOf( //Cria um dicionário que determina um valor exato para cada dia. fiz ele HardCoded, não é a melhor forma de implementa-lo, mas para aprendizado ele irá servir.
        "1" to 22174.1664,
        "2" to 24537.6698,
        "3" to 26139.6134,
        "6" to 26742.6612,
        "8" to 42889.2258,
        "9" to 46251.174,
        "10" to 11191.4722,
        "13" to 3847.4823,
        "14" to 373.7838,
        "15" to 2659.7563,
        "16" to 48924.2448,
        "17" to 18419.2614,
        "20" to 35240.1826,
        "21" to 43829.1667,
        "22" to 18235.6852,
        "23" to 4355.0662,
        "24" to 13327.1025,
        "27" to 25681.8318,
        "28" to 1718.1221,
        "29" to 13220.495,
        "30" to 8414.61
    )
) {

    fun fatTotal(): String {
        var res = 0.0
        for ((dia, faturamento) in fatDiario) { // Existe uma função pronto para esta funcionalidade no kotlin, porém eu quis recriar o algoritmo para melhor vizualização
            res = res + faturamento
        }
        return "O Faturamento total do mês foi de R$${String.format("%.2f", res)}"
    }

    fun mediaFat(): String {
        //val dias = fatDiario
        var total = 0.0
        var media = 0.0
        for ((dia, faturamento) in fatDiario) {
            total = total + faturamento
            media = total / fatDiario.size
        }
        return "A média de faturamento do mês foi de R$${String.format("%.2f", media)}"
    }

    fun menorFat(): String {
        //val dias = fatDiario
        var res = fatDiario["1"]
        var ans = ""
        for ((dia, faturamento) in fatDiario) {
            if (faturamento < res!!) {
                res = faturamento
                ans = dia
            }
        }
        return "O menor faturamento deste mês foi R$${String.format("%.2f", res)} no dia $ans"
    }
    fun maiorFat(): String {
        var res = fatDiario["1"]
        var ans = ""
        for ((dia, faturamento) in fatDiario) {
            if (faturamento > res!!){
                res = faturamento
                ans = dia
            }
        }
        return "O maior faturamento deste mês foi R$${String.format("%.2f", res)} no dia $ans"
    }

}