package teo.android.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mangMonHoc: List<String> = listOf("IOS", "Android", "PHP", "C#")

        list.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, mangMonHoc)



    }
}
