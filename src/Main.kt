import projetos.Fibonacci
import projetos.Imc
import projetos.indice

fun main() {
    val imc = Imc()
    val fibonacci = Fibonacci()
    val indice = indice()

    println(imc.calcImc(70.0, 1.68))
    println(fibonacci.fibonacci(34))
    println(fibonacci.fibonacci(9))
    println(indice.getIndice(34))
    println(indice.getIndice(9))



}

/*
projetos disponíveis:

calcImc(peso: 00.0, altura: 0.00) *Double* Função que calcula seu IMC

fibonacci(x: 0) *Int* Função que determina se o número indicado no parâmetro faz parte da sequência de Fibonacci ou não
 */