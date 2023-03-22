package com.example.project_4

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity(){
    private lateinit var textinputmass:EditText
    private lateinit var textinputacc:EditText
    private lateinit var button: Button
    private lateinit var total: TextView
    private lateinit var calcbutton: Button
    private lateinit var convert: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        textinputmass= findViewById<EditText?>(R.id.massid)
        textinputacc = findViewById<EditText?>(R.id.accele)
        button = findViewById<Button?>(R.id.buttons)
        total = findViewById<TextView?>(R.id.force)
        calcbutton = findViewById<Button?>(R.id.cal)
        convert = findViewById<TextView?>(R.id.newtokg)

        button.setOnClickListener()
        {
            var num1 = textinputmass.text.toString().toDouble()
            var num2 = textinputacc.text.toString().toDouble()
            var tot: Double = num1*num2

            var result = (tot*100.0).roundToInt()/100.0
            total.text = "Force: $result Newtons"
            calcbutton.setOnClickListener()
            {

                var kilo = result*0.10197;

                var rounded = (kilo*100.0).roundToInt()/100.0
                convert.text = "$result Newtons = $rounded Kilograms"

            }
        }


    }

}