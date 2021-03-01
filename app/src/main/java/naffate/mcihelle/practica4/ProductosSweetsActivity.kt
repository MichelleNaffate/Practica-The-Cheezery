package naffate.mcihelle.practica4

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView

class ProductosSweetsActivity : AppCompatActivity() {
    var sweets = ArrayList<Product>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productos_sweets)
        agregarProducto()

        var listView: ListView = findViewById(R.id.viewSweets)as ListView
        var adaptador: AdaptorProductos = AdaptorProductos(this,sweets)

        listView.adapter = adaptador
    }

    fun agregarProducto(){

        sweets.add(Product("Blueberry cake", R.drawable.blueberrycake, "Vanilla cake flavor, topped with cheese topping and blueberries.", 6))
        sweets.add(Product("Chocolate cupcake", R.drawable.chocolatecupcake, "Chocolate cupcakes topped with butter cream and cherries", 3))
        sweets.add(Product("Lemon tartalette", R.drawable.lemontartalette, "Pastry shell with a lemon flavored filling", 4))
        sweets.add(Product("Red Velvet cake", R.drawable.redvelvetcake, "Soft, moist, buttery cake topped with an easy cream cheese frosting.", 6))
        sweets.add(Product("Cherry cheesecake", R.drawable. strawberrycheesecake, "This cherry topped cheesecake is positively creamy and delicious and will be your new favorite dessert.", 7))
        sweets.add(Product("Tiramisu", R.drawable.tiramisu, "Coffee-flavored Italian dessert", 6))

    }

    private class AdaptorProductos:BaseAdapter{
        var productos = ArrayList<Product>()
        var contexto: Context? =null
        constructor(contexto: Context, productos: ArrayList<Product>){
            this.productos = productos
            this.contexto = contexto
        }



        override fun getItem(position: Int): Any {
            return productos[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getCount(): Int {
            return productos.size
        }
        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var prod =productos[position]
            var inflador = LayoutInflater.from(contexto)
            var vista = inflador.inflate(R.layout.producto_view, null)
            var imagen = vista.findViewById(R.id.producto_img)as ImageView
            var nombre = vista.findViewById(R.id.producto_nombre)as TextView
            var desc = vista.findViewById(R.id.producto_descripcion)as TextView
            var precio = vista.findViewById(R.id.producto_precio)as TextView


            imagen.setImageResource(prod.image)
            nombre.setText(prod.name)
            desc.setText(prod.description)
            precio.setText("$${prod.price}")

            return vista
        }
    }
       }