package saavedra.salazar.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val USUARIO = "josue"
    val PASS ="hola123"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnIngresar.setOnClickListener{
            //Obteniendo los datos
            val usuario = txtUsuario.text.toString()
            val pass = txtContraseña.text.toString()
            if (!cadenaVacia(usuario) and !cadenaVacia(pass)) {
                if (verificarDatos(usuario,pass)){
                    mensaje("Datos correctos")
                }else{
                   mensaje("Datos incorrectos")
                }
            }else{

                mensaje("Datos Vacíos")
            }
        }
    }

    fun verificarDatos(usuario:String, pass:String):Boolean{
           return usuario.equals(USUARIO) and pass.equals(PASS)
    }

    fun mensaje(mensaje:String){
        Toast.makeText(this,mensaje,Toast.LENGTH_LONG).show()
    }

    fun cadenaVacia(cadenaVerificar:String):Boolean{
        return cadenaVerificar.isEmpty()
    }

    /*
    1.-Leer usuario
    2.-Leer contraseña
    3.-Verificar que no esten vacios


     */
}
