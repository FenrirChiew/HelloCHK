package my.edu.tarc.hellochk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

// InstanceName : Type/ClassName
class MainActivity : AppCompatActivity() {
    // onCreate() = main()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Load UI to Memory
        // R = Resources
        setContentView(R.layout.activity_main)

        // Linking UI to program code
        //Declare variable here
        // val = value (constant), var = variable
        val imageViewQR: ImageView = findViewById(R.id.imageViewQR)
        val textViewName: TextView = findViewById(R.id.textViewName)
        val buttonShow: Button = findViewById(R.id.buttonShow)
        val buttonHide: Button = findViewById(R.id.buttonHide)

        // Insert event handler
        buttonShow.setOnClickListener {
            imageViewQR.visibility = View.VISIBLE
            textViewName.visibility = View.VISIBLE
        }
        buttonHide.setOnClickListener {
            imageViewQR.visibility = View.INVISIBLE
            textViewName.visibility = View.INVISIBLE
        }
    }
}