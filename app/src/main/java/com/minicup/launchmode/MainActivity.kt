package com.minicup.launchmode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.minicup.launchmode.stantard.StandardAActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.intentFor

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        standard.setOnClickListener{
            startActivity(intentFor<StandardAActivity>())
        }


    }
}
