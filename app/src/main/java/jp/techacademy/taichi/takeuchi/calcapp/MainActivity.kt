package jp.techacademy.taichi.takeuchi.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        if(editText1.getText().toString() != "" && editText2.getText().toString() != "" ){
            when (v?.id) {
                R.id.button1 -> {
                    val intent = Intent(this, secondActivity::class.java)
                    intent.putExtra(
                        "VALUE1",
                        editText1.text.toString().toDouble()
                                + editText2.text.toString().toDouble())
                    startActivity(intent)
                }
                R.id.button2 -> {
                    val intent = Intent(this, secondActivity::class.java)
                    intent.putExtra(
                        "VALUE1",
                        editText1.text.toString().toDouble()
                                - editText2.text.toString().toDouble())
                    startActivity(intent)
                }
                R.id.button3 -> {
                    val intent = Intent(this, secondActivity::class.java)
                    intent.putExtra(
                        "VALUE1",
                        editText1.text.toString().toDouble()
                                * editText2.text.toString().toDouble())
                    startActivity(intent)
                }
                R.id.button4 -> {
                    val intent = Intent(this, secondActivity::class.java)
                    intent.putExtra(
                        "VALUE1",
                        editText1.text.toString().toDouble()
                                / editText2.text.toString().toDouble())
                    startActivity(intent)
                }
            }
        }else {
            if (v != null) {
                v.setOnClickListener { view ->
                    Snackbar.make(view, "数値が未入力です", Snackbar.LENGTH_INDEFINITE)
                        .setAction("Close"){
                        }.show()
                }
            }
        }//end if
        }//end onClick

}