package bruno.dev.contapaletes.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import bruno.dev.contapaletes.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        moveToNewPaleteActivity()
        moveToSearchActivity()
    }

    private fun moveToNewPaleteActivity(){
        val btnNewPalete : ImageView = findViewById(R.id.btn_nova_palete)
        btnNewPalete.setOnClickListener {
            val intent = Intent(this,NewPaleteActivity::class.java)
            startActivity(intent)
        }
    }

    private fun moveToSearchActivity(){
        val btnSearchPalete : ImageView = findViewById(R.id.btn_procurar_palete)
        btnSearchPalete.setOnClickListener {
            val intent = Intent(this,SearchActivity::class.java)
            startActivity(intent)
        }
    }
}