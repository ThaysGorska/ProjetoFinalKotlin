package encap

abstract class Jogos(
    var nomejogo: String,
    var anojogo: Int,
    var produtora: String,
    var classeindicativa: Int,
    notaDoJogo: Int
) : ReviewJogo(notaDoJogo) {

    init {
        checarDados()
    }

    fun checarDados() {
        if (nomejogo == "" || anojogo == null || produtora == "" || classeindicativa == null) {
            throw Exception("Favor preencher todos os campos corretamente!")
        }
    }

    override fun darNota() {
        
        println("Dar nota de 1 a 5 para o jogo: ")
        println("1 para ruim e 5 para gostei muito")
        var nota = readln().toInt()

        nota = notaDoJogo

        if (nota in 1..5) {
            println("Nota cadastrada com sucesso!")

        } else {
            println("Valor de $nota inválido! Digite um novo valor.")
        }

    }

    override fun curtir() {

        do {
            var count = 0

            println("Você curtiu o jogo? ")
            println("Sim ou Não")
            val resp = readln()

            if (resp == "Sim" || resp == "sim") {
                count++
                numCurtidas += count
                println("Like: $numCurtidas")

            } else if (resp == "Não" || resp == "não") {
                count++
                numDislikes += count
                println("Dislike : $numDislikes")

            } else {
                println("Resposta inválida!")
            }

        } while (resp != "Sim" && resp != "sim" && resp != "Não" && resp != "não")
    }

    override fun toString(): String {
        return println("Informações do jogo:\nNome: $nomejogo\nAno de Lançamento: $anojogo\nDesenvolvedora: $produtora\nClassificação Indicativa: $classeindicativa\n").toString()
    }
}
