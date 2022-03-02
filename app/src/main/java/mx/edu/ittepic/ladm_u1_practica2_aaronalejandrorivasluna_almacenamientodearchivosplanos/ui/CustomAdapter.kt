package mx.edu.ittepic.ladm_u1_practica2_aaronalejandrorivasluna_almacenamientodearchivosplanos.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import mx.edu.ittepic.ladm_u1_practica2_aaronalejandrorivasluna_almacenamientodearchivosplanos.R

class CustomAdapter: RecyclerView.Adapter<CustomAdapter.ViewHolder>(){

    val titles = arrayOf("Titulo1","Titulo2",)

    val detalles = arrayOf("informacion","epa")

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemTitle: TextView
        var itemInformacion: TextView

        init{
            itemTitle = itemView.findViewById(R.id.itemTitle)
            itemInformacion = itemView.findViewById(R.id.itemInformacion)
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.card_layout, viewGroup,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemTitle.text=titles[i]
        viewHolder.itemInformacion.text=detalles[i]
    }

    override fun getItemCount(): Int {
        return titles.size
    }
}