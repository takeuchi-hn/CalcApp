package jp.techacademy.taichi.takeuchi.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val intent = Intent(this, secondActivity::class.java)
        intent.putExtra("VALUE1", 10)
        intent.putExtra("VALUE2", 20)
        startActivity(intent)
    }
}