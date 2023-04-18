package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var dispList: MutableMap<String, String> = mutableMapOf()
    var copiedList = dispList.toMutableMap()
    var numList = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8)
    lateinit var tvVersion: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvVersion = findViewById(R.id.tvVersion)
        tvVersion.text = BuildConfig.VERSION_NAME
        dispList["one"] = "This is one"
        dispList["two"] = "This is two"
        disp(dispList)
        dispList.keys.toList().forEach {
            Log.d("####", "=>" + dispList[it])
        }

        copiedList.remove("one")

        Log.d("####", "copied map:" + dispList["one"])

        val s = numList.map { 5 }

        s.forEach {
            Log.d("####", "numList:" + it)
        }

        updateList(numList, 100)

        numList.forEach {
            Log.d("####", "numList:" + it)
        }

        if (true) {

        }

        if (false) {

        }


    }

    private fun updateList(listToBeUpdated: MutableList<Int>, number: Int) {
        listToBeUpdated.add(number)
    }

    private fun disp(displayList: MutableMap<String, String>) {
        displayList["one"] = "Is this one"
        displayList["two"] = "Is this two"
        displayList.remove("two")
    }

    private fun sampleFunc() {
        // empty intentionally
    }
}