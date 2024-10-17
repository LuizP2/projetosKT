package projetos

class indice {
    fun getIndice(indice: Int): String{
        var k = 0
        var res = 0
        while (k < indice){
            k = k + 1
            res = res + k
        }
        return "Seu índice é $res"
    }
}