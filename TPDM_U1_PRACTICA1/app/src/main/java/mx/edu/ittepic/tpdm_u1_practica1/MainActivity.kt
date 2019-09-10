package mx.edu.ittepic.tpdm_u1_practica1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    var fotosview : ImageButton?=null
    var fotosview1 : ImageButton?=null
    var fotosview2 : ImageButton?=null
    var fotosview3 : ImageButton?=null
    var fotosview4 : ImageButton?=null
    var fotosview5 : ImageButton?=null
    var fotosview6 : ImageButton?=null
    var fotosview7 : ImageButton?=null
    var fotosview8 : ImageButton?=null
    var fotosview9 : ImageButton?=null
    var fotosview10 : ImageButton?=null
    var fotosview11 : ImageButton?=null
    var fotosview12 : ImageButton?=null
    var fotosview13 : ImageButton?=null
    var fotosview14 : ImageButton?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fotosview=findViewById(R.id.img0)
        fotosview1=findViewById(R.id.img1)
        fotosview2=findViewById(R.id.img2)
        fotosview3=findViewById(R.id.img3)
        fotosview4=findViewById(R.id.img4)
        fotosview5=findViewById(R.id.img5)
        fotosview6=findViewById(R.id.img6)
        fotosview7=findViewById(R.id.img7)
        fotosview8=findViewById(R.id.img8)
        fotosview9=findViewById(R.id.img9)
        fotosview10=findViewById(R.id.img10)
        fotosview11=findViewById(R.id.img11)
        fotosview12=findViewById(R.id.img12)
        fotosview13=findViewById(R.id.img13)
        fotosview14=findViewById(R.id.img14)



        fotosview?.setOnClickListener {
            val cambio=Intent(this,Main2Activity::class.java)
            startActivity(cambio)
        }

        fotosview1?.setOnClickListener {
            val cambio = Intent(this, Main3Activity::class.java)
            startActivity(cambio)
        }
        fotosview2?.setOnClickListener {
            val cambio = Intent(this, Main4Activity::class.java)
            startActivity(cambio)
        }
        fotosview3?.setOnClickListener {
            val cambio = Intent(this, Main5Activity::class.java)
            startActivity(cambio)
        }
        fotosview4?.setOnClickListener {
            val cambio = Intent(this, Main6Activity::class.java)
            startActivity(cambio)
        }
        fotosview5?.setOnClickListener {
            val cambio = Intent(this, Main7Activity::class.java)
            startActivity(cambio)
        }
        fotosview6?.setOnClickListener {
            val cambio = Intent(this, Main8Activity::class.java)
            startActivity(cambio)
        }
        fotosview7?.setOnClickListener {
            val cambio = Intent(this, Main9Activity::class.java)
            startActivity(cambio)
        }
        fotosview8?.setOnClickListener {
            val cambio = Intent(this, Main10Activity::class.java)
            startActivity(cambio)
        }
        fotosview9?.setOnClickListener {
            val cambio = Intent(this, Main11Activity::class.java)
            startActivity(cambio)
        }
        fotosview10?.setOnClickListener {
            val cambio = Intent(this, Main12Activity::class.java)
            startActivity(cambio)
        }
        fotosview11?.setOnClickListener {
            val cambio = Intent(this, Main13Activity::class.java)
            startActivity(cambio)
        }
        fotosview12?.setOnClickListener {
            val cambio = Intent(this, Main14Activity::class.java)
            startActivity(cambio)
        }
        fotosview13?.setOnClickListener {
            val cambio = Intent(this, Main15Activity::class.java)
            startActivity(cambio)
        }
        fotosview14?.setOnClickListener {
            val cambio = Intent(this, Main16Activity::class.java)
            startActivity(cambio)
        }
         }
}
