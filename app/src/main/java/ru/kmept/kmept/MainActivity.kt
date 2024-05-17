package ru.kmept.kmept

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import ru.kmept.kmept.antonchik.AntonchikActivity
import ru.kmept.kmept.ostrikov.OstrikovActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onAntonchikClick(view: View) {
        val intent = Intent(MainActivity@this, AntonchikActivity::class.java)
        startActivity(intent)
    }

    fun onOstrikovClick(view: View) {
        val intent = Intent(MainActivity@this, OstrikovActivity::class.java)
        startActivity(intent)
    }
}