package com.example.btnrecycler.adapter

import android.text.SpannableString
import android.text.style.StrikethroughSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.btnrecycler.R
import com.example.btnrecycler.model.CameraType
import com.example.btnrecycler.model.LatestType

import kotlinx.android.synthetic.main.item_camera.view.*
import kotlinx.android.synthetic.main.item_latest.view.*

class LatestAdapter(var personList: ArrayList<LatestType>) :   //Obj array list ko argu a nay nae htae
    RecyclerView.Adapter<LatestAdapter.PersonViewHolder>() {

    inner class PersonViewHolder(itemView: View) ://view nae call ya mal
        RecyclerView.ViewHolder(itemView) {
        fun bindPerson(person: LatestType) {
            itemView.lst_name.text = person.lstName
            itemView.lst_type.text = person.lstType
            itemView.lst_image.setImageResource(person.lstImg)
            itemView.lst_price.text=person.lstPrice
            itemView.lst_discount.text=person.lstTxt

            val a=itemView.lst_linear
            a.visibility = if (person.lstDis!==null && person.lstDis!!){
                View.VISIBLE
            } else{
                View.INVISIBLE

            }
        }
    }

    //..............rec put mal layout...rec puttin work
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        var view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_latest, parent, false)
        return PersonViewHolder(view)
    }

    //............rec mr output ml count a yay a twat
    override fun getItemCount(): Int {
        return personList.size
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        holder.bindPerson(personList[position])//array tae insert
    }


}