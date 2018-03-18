package br.com.chslcompany.listacustomizada


import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import br.com.chslcompany.listacustomizada.R
import br.com.chslcompany.listacustomizada.model.Convidado
import br.com.chslcompany.listacustomizada.model.Sexo
import br.com.chslcompany.listacustomizada.model.Status
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val listAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,listaDeConvidados())
        listaChurras.adapter = listAdapter
        


        fab.setOnClickListener { view -> Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show() }
    }

    private fun listaDeConvidados() : List<Convidado>
    {

        return listOf(
            Convidado("Ronaldo", "4kg de carne", Status.CONFIRMADO, Sexo.MASCULINO),
            Convidado("Cristiane", "Arroz e maionese", Status.CONFIRMADO, Sexo.FEMININO),
            Convidado("Loma", "caixa de som e Refri", Status.NAO_VAI, Sexo.FEMININO),
            Convidado("Acauan", "NADA", Status.NAO_RESPONDEU, Sexo.MASCULINO),
            Convidado("Whinderson", "2kg de asa", Status.CONFIRMADO, Sexo.MASCULINO)
        )


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId

        if (id == R.id.action_settings)    return true

        return super.onOptionsItemSelected(item)
    }
}
