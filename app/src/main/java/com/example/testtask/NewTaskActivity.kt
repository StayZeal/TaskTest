package com.example.testtask

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class NewTaskActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("")
        addBtn()
    }

    companion object {
        fun show(context: Context) {
            val intent = Intent(context, NewTaskActivity::class.java)
            context.startActivity(intent)
        }

        fun showWithFlag(context: Context) {
            val intent = Intent(context, NewTaskActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(intent)
        }
    }
}
