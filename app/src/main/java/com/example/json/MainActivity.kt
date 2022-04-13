package com.example.json

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import org.json.JSONArray
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val json = JSONObject().apply {
            put("number", 1)
            put("nama","nurul")
            put ("bayar_spp",true)

             val kantin =JSONObject().apply {
                 put("kantin_nenek","enak")
                 put("kantin_wak_uden","b aja")
             }
                put("kantin", kantin)

            val isimapel = JSONArray().apply {
                val matematika = JSONObject().apply {
                    put("mapel", "matematika")
                }
                put(matematika)

                val kimia = JSONObject().apply {
                    put("mapel", "kimia")
                }
                put(kimia)

                val fisika = JSONObject().apply {
                    put("mapel", "fisika")
                }
                put(fisika)
            }
                put("isimapel",isimapel)
        }
        Log.i("jsonobject",json.toString(2))
    }


}