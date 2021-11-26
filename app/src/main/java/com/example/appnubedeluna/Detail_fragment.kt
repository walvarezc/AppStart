package com.example.appnubedeluna

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class DetalFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmento: View = inflater.inflate(R.layout.fragment_detail, container, false)

        val detail1: Button = fragmento.findViewById(R.id.btn_1)
        val detail2: Button = fragmento.findViewById(R.id.btn_2)
        val detail3: Button = fragmento.findViewById(R.id.btn_3)

        detail1.setOnClickListener(View.OnClickListener {
            val datos = Bundle()
            datos.putString("Extra Grande", resources.getString(R.string.txt_Tarea_1))

            activity?.supportFragmentManager?.beginTransaction()
                ?.setReorderingAllowed(true)
                ?.replace(R.id.fragment_container_view, DetailFragment::class.java, datos, "detail")
                ?.addToBackStack("")
                ?.commit()
        })

        return fragmento
    }   }