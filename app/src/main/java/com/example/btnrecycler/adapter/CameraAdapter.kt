package com.example.btnrecycler.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.btnrecycler.R
import com.example.btnrecycler.model.CameraType

import kotlinx.android.synthetic.main.item_camera.view.*

class CameraAdapter(var personList: ArrayList<CameraType>) :   //Obj array list ko argu a nay nae htae
    RecyclerView.Adapter<CameraAdapter.PersonViewHolder>() {

    inner class PersonViewHolder(itemView: View) ://view nae call ya mal
        RecyclerView.ViewHolder(itemView) {
        fun bindPerson(person: CameraType) {
            itemView.txt_camera.text = person.camera
            itemView.txt_made_in.text = person.madein
            itemView.con_camera.setBackgroundResource(person.imgCamera)
        }
    }

    //..............rec put mal layout...rec puttin work
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        var view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_camera, parent, false)
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