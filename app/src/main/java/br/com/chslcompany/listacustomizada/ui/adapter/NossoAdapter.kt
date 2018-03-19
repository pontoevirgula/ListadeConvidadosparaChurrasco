package br.com.chslcompany.listacustomizada.ui.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import br.com.chslcompany.listacustomizada.model.Convidado
import br.com.chslcompany.listacustomizada.R
import br.com.chslcompany.listacustomizada.model.Sexo
import com.pawegio.kandroid.inflateLayout
import kotlinx.android.synthetic.main.lista_churras_personalizado.view.*

/**
 * Created by Cliente on 25/02/2018.
 */

class NossoAdapter(private val lista : List<Convidado>,
                   private val context : Context) : RecyclerView.Adapter<NossoAdapter.ViewHolder>()
{
    var view : View? = null

    override fun getItemCount() = lista.size

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        view = context.inflateLayout(R.layout.lista_churras_personalizado,parent,false)
        return ViewHolder(view!!)
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int)
    {
        //Esse metodo junta as informações contida no ViewHolder
        // com os componentes do layout
        val convidado = lista[position]

        holder?.let { it.bindView(convidado) }
    }

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)
    {

        fun bindView(convidado: Convidado)
        {
            //val imgPessoa = itemView.imgPessoa
            val nomeConvidado = itemView.nomeConvidado
            val contribuicaoConvidado = itemView.contribuicaoConvidado
            val statusConvidado = itemView.statusConvidado

            nomeConvidado.text = convidado.nome
            contribuicaoConvidado.text = convidado.contribuicao
            statusConvidado.text = convidado.status.toString()

            // "let" verifica se itemView nao é null.
            // Se for true, o bloco é executado.
            itemView?.let {
                val sexo = convidado.sexo
                when(sexo){
                    Sexo.MASCULINO -> it.imgPessoa.setImageResource(R.drawable.man)
                    Sexo.FEMININO -> it.imgPessoa.setImageResource(R.drawable.woman)
                }
            }

        }


    }

}