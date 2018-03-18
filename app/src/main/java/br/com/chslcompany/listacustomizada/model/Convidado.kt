package br.com.chslcompany.listacustomizada.model

data class Convidado (
        val nome : String = "",
        val contribuicao : String = "",
        val status : Status,
        val sexo: Sexo)


{
    override fun toString(): String {
        return "Nome: $nome \n" +
                "Contribuição: $contribuicao \n" +
                "Esta Confirmado?: $status"

    }
}