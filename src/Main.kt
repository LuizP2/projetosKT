import projetos.Fibonacci
import projetos.Imc
import projetos.faturamentoDiario
import projetos.indice

fun main() {
    val imc = Imc()
    val fibonacci = Fibonacci()
    val indice = indice()
    val faturamento = faturamentoDiario()

    println(imc.calcImc(70.0, 1.68))
    println(fibonacci.fibonacci(34))
    println(fibonacci.fibonacci(9))
    println(indice.getIndice(34))
    println(indice.getIndice(9))
    println(faturamento.fatTotal())
    println(faturamento.mediaFat())
    println(faturamento.menorFat())
    println(faturamento.maiorFat())


}

/*
projetos disponíveis:

calcImc(peso: 00.0, altura: 0.00) *Double* Função que calcula seu IMC.

fibonacci(x: 0) *Int* Função que determina se o número indicado no parâmetro faz parte da sequência de Fibonacci ou não.

getIndice(indice: 0) gera uma sequência no índice K, a qual soma todos os valores anteriores do índice e nos mostra o resultado da soma.

fatTotal() mostra a soma de todos os faturamentos do mês

mediaFat() mostra a média de todos os faturamentos do mês

menorFat() mostra o menor faturamento do mês

maiorFat() mostra o maior faturamento do mês

 */