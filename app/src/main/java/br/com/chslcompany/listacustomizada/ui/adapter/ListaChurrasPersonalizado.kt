package br.com.chslcompany.listacustomizada.ui.adapter

import android.content.Context
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import br.com.chslcompany.listacustomizada.model.Convidado
import br.com.chslcompany.listacustomizada.R
import br.com.chslcompany.listacustomizada.model.Sexo
import com.pawegio.kandroid.inflateLayout
import kotlinx.android.synthetic.main.lista_churras_personalizado.view.*

class ListaChurrasPersonalizado (lista : List<Convidado>, context : Context)
: BaseAdapter()
{

    var lista : List<Convidado>? = null
    var context : Context? = null

    init { this.lista = lista ; this.context = context }

    override fun getCount() =  lista!!.size

    override fun getItem(position: Int) = lista!!.get(position)

    override fun getItemId(position: Int): Long { return 0}




    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view : View? ; var convidado : Convidado? = null ; var holder : ViewHolder? = null

       if(convertView == null)
       {
           view = context?.inflateLayout(R.layout.lista_churras_personalizado, parent, false)
           convidado = getItem(position)
           holder = ViewHolder(view!!)
           view.tag = holder
       }
       else view = convertView ; holder = view.tag as ViewHolder


       //populando as views
        holder.nomeConvidado?.text = convidado?.nome
        holder.contribuicaoConvidado?.text = convidado?.contribuicao
        holder.statusConvidado?.text = convidado?.status.toString()

       val sexo = convidado?.sexo

       when(sexo){
           Sexo.MASCULINO -> view.imgPessoa?.setImageResource(R.drawable.man)
           Sexo.FEMININO -> view.imgPessoa?.setImageResource(R.drawable.woman)
       }

      return view
    }

     class ViewHolder(view : View){

       var imgPessoa : ImageView? = null
       var nomeConvidado : TextView? = null
       var contribuicaoConvidado : TextView? = null
       var statusConvidado : TextView? = null

       init{
          imgPessoa = view.imgPessoa
          nomeConvidado = view.nomeConvidado
          contribuicaoConvidado = view.contribuicaoConvidado
          statusConvidado = view.statusConvidado
       }

    }
}



