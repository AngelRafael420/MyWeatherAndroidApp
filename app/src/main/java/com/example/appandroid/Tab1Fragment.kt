package com.example.appandroid

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView


class Tab1Fragment : Fragment() {
    @SuppressLint("MissingInflatedId")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_tab1, container, false)

        // Agregar ListView con tres filas
        val listView = view.findViewById<ListView>(R.id.ListView)
        val list = listOf("Item 1", "Item 2", "Item 3")
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, list)
        listView.adapter = adapter

        return view
    }
}

