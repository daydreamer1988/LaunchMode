package com.minicup.launchmode.stantard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.minicup.launchmode.R
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.error

class StandardDActivity : AppCompatActivity(),AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_standard_a)
        error { "onCreate:StandardDActivity" }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        error { "onNewIntent:StandardDActivity" }
    }

}
