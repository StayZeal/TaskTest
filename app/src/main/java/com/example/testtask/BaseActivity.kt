package com.example.testtask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

/**
 * - @Description:
 * - @Author:  yangfeng-os
 * - @Time:  2019/12/13 17:31
 */
open class BaseActivity : AppCompatActivity() {

    fun setTitle(title: String) {
        try {
            titleTv.text = javaClass.canonicalName
        } catch (t: Throwable) {
            t.printStackTrace()
        }
    }


    fun addBtn() {
        try {
            newTaskBtn.setOnClickListener {
                NewTaskActivity.show(this)
            }
            newTaskBtnFlag.setOnClickListener {
                NewTaskActivity.showWithFlag(this)
            }
            newTaskBtnByService.setOnClickListener {
                startService(Intent(this, TestService::class.java))
            }

        } catch (e: Throwable) {
            e.printStackTrace()
        }
    }
}