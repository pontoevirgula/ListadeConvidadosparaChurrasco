package br.com.chslcompany.listacustomizada.model

/**
 * Created by Carlos on 21/02/2018.
 */

enum class Status
{
     CONFIRMADO { override fun toString(): String = "Confirmado" },
     NAO_RESPONDEU { override fun toString(): String = "Sem resposta"},
     NAO_VAI { override fun toString(): String = "Não vai"}

}