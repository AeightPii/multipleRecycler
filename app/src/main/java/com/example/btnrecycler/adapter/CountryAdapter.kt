package com.example.btnrecycler.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.btnrecycler.R
import com.example.btnrecycler.model.CameraType
import com.example.btnrecycler.model.CountryType

import kotlinx.android.synthetic.main.item_camera.view.*
import kotlinx.android.synthetic.main.item_country.view.*

class CountryAdapter(var personList: ArrayList<CountryType>) :   //Obj array list ko argu a nay nae htae
    RecyclerView.Adapter<CountryAdapter.PersonViewHolder>() {

    inner class PersonViewHolder(itemView: View) ://view nae call ya mal
        RecyclerView.ViewHolder(itemView) {
        fun bindPerson(person: CountryType) {
            itemView.country_name.text = person.country
            itemView.countryImg.setBackgroundResource(person.countryImg)
        }
    }

    //..............rec put mal layout...rec puttin work
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        var view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_country, parent, false)
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