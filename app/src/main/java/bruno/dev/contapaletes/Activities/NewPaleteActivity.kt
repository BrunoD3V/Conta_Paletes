package bruno.dev.contapaletes.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import bruno.dev.contapaletes.R
import kotlinx.android.synthetic.main.activity_new_palete.*

class NewPaleteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_palete)

        loadSpinner()
        loadButton()
    }

    private fun loadSpinner() {
        val warehouseList: MutableList<String> = ArrayList()
        warehouseList.add("Armazem - B1")
        warehouseList.add("Armazem - B2")
        warehouseList.add("Armazem - B3")

        val adapter: ArrayAdapter<String> =
            ArrayAdapter(this, R.layout.spinner_warehouse, warehouseList)
        spinner_warehouse.adapter = adapter
    }

    private fun loadButton() {

    }
}