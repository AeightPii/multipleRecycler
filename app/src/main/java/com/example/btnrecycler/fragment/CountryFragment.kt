package com.example.btnrecycler.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager

import com.example.btnrecycler.R
import com.example.btnrecycler.adapter.CountryAdapter
import com.example.btnrecycler.model.CameraType
import com.example.btnrecycler.model.CountryType
import kotlinx.android.synthetic.main.fragment_country.view.*

/**
 * A simple [Fragment] subclass.
 */
class CountryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var root=inflater.inflate(R.layout.fragment_country, container, false)
        var trendArray = ArrayList<CountryType>()
        trendArray.add(CountryType("Japan",R.drawable.japan))
        trendArray.add(CountryType("Korea",R.drawable.korea))
        trendArray.add(CountryType("China",R.drawable.china))
        trendArray.add(CountryType("International",R.drawable.inter))
         val a=CountryAdapter(trendArray)
        root.recyclerCountry.layoutManager=GridLayoutManager(context,2)
        root.recyclerCountry.adapter=a
        return root
    }

}
