package com.example.btnrecycler.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.btnrecycler.R
import com.example.btnrecycler.adapter.PopularAdapter
import com.example.btnrecycler.model.Popular
import kotlinx.android.synthetic.main.fragment_popular.view.*

/**
 * A simple [Fragment] subclass.
 */
class PopularFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val r=inflater.inflate(R.layout.fragment_popular, container, false)
        val a=ArrayList<Popular>()
        a.add(Popular(true,true,"50% off","IPhone 11","Apple","780000Ks","1400000",true,R.drawable.iphone))
        a.add(Popular(true,false,"50% off","Racing Car","Fararri","780000Ks","1400000",true,R.drawable.w2))
        a.add(Popular(false,false,"50% off","Car","Mark II","100000Ks","14070000",true,R.drawable.w12))
        a.add(Popular(false,true,"50% off","IPhone 11","Apple","780000Ks","1400000",false,R.drawable.w15))

        val adapter=PopularAdapter(a)
        r.recyclerPopular.layoutManager= LinearLayoutManager(context)
        r.recyclerPopular.adapter=adapter
        return r
    }

}
