package naffate.mcihelle.practica4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnCold: Button = findViewById(R.id.button_coldDrink) as Button
        btnCold.setOnClickListener {
            var intent: Intent = Intent(this, ProductoColdActivity::class.java)
            startActivity(intent)

        }

        var btnHot: Button = findViewById(R.id.button_hotdrink) as Button
        btnHot.setOnClickListener {
            var intent: Intent = Intent(this, ProductosHotActivity::class.java)
            startActivity(intent)

        }
        var btnSweets: Button= findViewById(R.id.button_sweets) as Button
        btnSweets.setOnClickListener {
            var intent3: Intent = Intent(this, ProductosSweetsActivity::class.java)
            startActivity(intent3)
        }
        var btnSalties: Button= findViewById(R.id.button_salties) as Button
        btnSalties.setOnClickListener {
            var intent3: Intent = Intent(this, ProductosSaltiesActivity::class.java)
            startActivity(intent3)
        }

    }
}