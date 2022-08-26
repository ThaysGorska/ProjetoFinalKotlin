package encap

class Usuario(
    var nome: String,
    var email: String,
    var senha: String,
    var confirmarsenha: String,
    var nick: String,
    var idade: Int
        ) {


    var aceitaTermos = ""

    constructor(
        nome: String,
        email: String,
        senha: String,
        confirmarsenha: String,
        nick: String,
        idade: Int,
        aceitaTermos: String
    ) : this(nome, email, senha, confirmarsenha, nick, idade) {
        this.aceitaTermos = aceitaTermos
    }

            override fun toString(): String{
            return "Nome: $nome\n" +
                    "E-mail: $email\n" +
                    "Senha: $senha\n" +
                    "Confirma Senha: $confirmarsenha\n"+
                    "Nick: $nick\n" +
                    "Idade: $idade"



}

}


