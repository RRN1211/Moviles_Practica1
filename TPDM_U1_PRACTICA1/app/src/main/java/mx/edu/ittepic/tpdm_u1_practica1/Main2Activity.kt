package mx.edu.ittepic.tpdm_u1_practica1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main2Activity : AppCompatActivity() {
    var regresar : Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
       //regresar=findViewById(R.id.volver)
        regresar?.setOnClickListener {
            finish()
        }
    }
}
