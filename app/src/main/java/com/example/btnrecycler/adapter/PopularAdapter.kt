package com.example.btnrecycler.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.btnrecycler.R
import com.example.btnrecycler.model.CameraType
import com.example.btnrecycler.model.Popular

import kotlinx.android.synthetic.main.item_camera.view.*
import kotlinx.android.synthetic.main.item_latest.view.*
import kotlinx.android.synthetic.main.item_popular.view.*

class PopularAdapter(var personList: ArrayList<Popular>) :   //Obj array list ko argu a nay nae htae
    RecyclerView.Adapter<PopularAdapter.PersonViewHolder>() {

    inner class PersonViewHolder(itemView: View) ://view nae call ya mal
        RecyclerView.ViewHolder(itemView) {
        fun bindPerson(person: Popular) {
            itemView.p_name.text = person.pName
            itemView.p_brand.text = person.pBrand
            itemView.p_price.text = person.pPrice
            itemView.dis_value.text=person.disVal
            itemView.p_crossPrice.text=person.crossPrice
            itemView.p_image.setImageResource(person.pImg)
            val aa=itemView.p_new
            aa.visibility = if (person.pNew!==null && person.pNew!!){
                View.VISIBLE
            } else{
                View.INVISIBLE

            }
            val bb=itemView.p_discount
            bb.visibility=if (person.pDisc!==null && person.pDisc!!){
                View.VISIBLE
            } else{
                View.INVISIBLE

            }
            val cc=itemView.cross_dis
            cc.visibility=if (person.crossDis!==null && person.crossDis!!){
                View.VISIBLE
            } else{
                View.INVISIBLE

            }
        }
    }

    //..............rec put mal layout...rec puttin work
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        var view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_popular, parent, false)
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