package com.minicup.launchmode.single_top

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.minicup.launchmode.R
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.error

class SingleTopAActivity : AppCompatActivity(),AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_standard_a)
    }


    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        error { "onNewIntent:SingleTopAActivity" }
    }
}
