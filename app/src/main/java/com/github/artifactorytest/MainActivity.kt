package com.github.artifactorytest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.github.mathutils.MathUtils

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MathUtils.sum(1,2)
    }
}
