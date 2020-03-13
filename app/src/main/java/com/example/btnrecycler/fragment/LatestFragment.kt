package com.example.btnrecycler.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.btnrecycler.R
import com.example.btnrecycler.adapter.CameraAdapter
import com.example.btnrecycler.adapter.LatestAdapter
import com.example.btnrecycler.model.CameraType
import com.example.btnrecycler.model.LatestType
import kotlinx.android.synthetic.main.fragment_camera.view.*
import kotlinx.android.synthetic.main.fragment_latest.view.*

/**
 * A simple [Fragment] subclass.
 */
class LatestFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var root = inflater.inflate(R.layout.fragment_latest, container, false)
        var lstArray = ArrayList<LatestType>()
        lstArray.add(LatestType("Embrassio","Chair","15000Ks",true,"20000Ks",R.drawable.chairthree))
        lstArray.add(LatestType("Toyota","Car","180000Ks",false,"20000",R.drawable.w12))
        lstArray.add(LatestType("Mark II","Car","171000Ks",true,"1800000Ks",R.drawable.w15))
        lstArray.add(LatestType("Fararri","Racing Car","780000Ks",true,"950000Ks",R.drawable.w2))
        lstArray.add(LatestType("Embrassio","Chair","15000Ks",false,"20000",R.drawable.chairthree))
        lstArray.add(LatestType("Embrassio","Chair","15000Ks",true,"20000Ks",R.drawable.chairthree))


        var b = LatestAdapter(lstArray)
        root.recyclerLatest.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        root.recyclerLatest.adapter = b
        return root
    }

}
