package tringapps.com.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //findViewById(R.id.test).setOnClickListener { validateFields()  }
    }

    override fun onResume() {
        super.onResume()
    }

    fun validateFields() = println("test method for onclick")
}
