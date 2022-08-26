package encap

abstract class ReviewJogo(
    var notaDoJogo: Int
){

    var numCurtidas = 0
    var numDislikes = 0

    abstract fun darNota()

    abstract fun curtir()

}