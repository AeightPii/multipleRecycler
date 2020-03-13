package com.example.btnrecycler.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.btnrecycler.R
import com.example.btnrecycler.adapter.CameraAdapter
import com.example.btnrecycler.model.CameraType
import kotlinx.android.synthetic.main.fragment_camera.view.*

/**
 * A simple [Fragment] subclass.
 */
class CameraFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var root=inflater.inflate(R.layout.fragment_camera, container, false)
        // Inflate the layout for this fragment
        var trendArray = ArrayList<CameraType>()
        trendArray.add(CameraType("Camera","New product from Sony",R.drawable.camera))
        trendArray.add(CameraType("Camera","New product from Canon",R.drawable.camtwo))
        trendArray.add(CameraType("Camera","New product from Nikon",R.drawable.camthree))



        var b = CameraAdapter(trendArray)
        root.recyclerCamera.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        root.recyclerCamera.adapter = b
        return root
    }

}
