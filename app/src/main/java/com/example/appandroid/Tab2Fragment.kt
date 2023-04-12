package com.example.appandroid

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import androidx.fragment.app.Fragment

class Tab2Fragment : Fragment() {
    @SuppressLint("MissingInflatedId")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_tab2, container, false)

        // Agregar AlertDialog para sumar dos números
        val button = view.findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val builder = AlertDialog.Builder(requireContext())
            builder.setTitle("Suma de dos números")
            val layout = LinearLayout(requireContext())
            layout.orientation = LinearLayout.VERTICAL
            val input1 = EditText(requireContext())
            input1.hint = "Primer número"
            layout.addView(input1)
            val input2 = EditText(requireContext())
            input2.hint = "Segundo número"
            layout.addView(input2)
            builder.setView(layout)
            builder.setPositiveButton("Sumar") { _, _ ->
                val num1 = input1.text.toString().toIntOrNull() ?: 0
                val num2 = input2.text.toString().toIntOrNull() ?: 0
                val suma = num1 + num2
                val resultBuilder = AlertDialog.Builder(requireContext())
                resultBuilder.setMessage("La suma de $num1 y $num2 es $suma")
                resultBuilder.setPositiveButton("Ok") { _, _ -> }
                resultBuilder.show()
            }
            builder.setNegativeButton("Cancelar") { dialog, _ ->
                dialog.cancel()
            }
            builder.show()
        }
        return view
    }
}
