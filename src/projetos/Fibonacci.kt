package projetos

class Fibonacci {
    fun fibonacci(x: Int): String{
        var numAnterior = 1
        var numAtual = 1
        var soma = 0
        while(soma < x){
            soma = numAnterior + numAtual
            numAnterior = numAtual
            numAtual = soma
        }
        return if (soma == x) "O numero $x faz parte da sequência Fibonacci"

        else "O numero $x não faz parte da sequência Fibonacci"

    }
}