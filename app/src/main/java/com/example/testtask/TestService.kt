package com.example.testtask

import android.app.Service
import android.content.Intent
import android.os.IBinder

/**
 * - @Description:
 * - @Author:  yangfeng-os
 * - @Time:  2019/12/13 17:18
 */
class TestService : Service() {


    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        NewTaskActivity.showWithFlag(this)
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onBind(intent: Intent): IBinder? {
        return null
    }
}