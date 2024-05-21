package ru.kmept.kmept

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import ru.kmept.kmept.antonchik.AntonchikActivity
import ru.kmept.kmept.antonchik.LohovActivity
import ru.kmept.kmept.antonchik.Slavesnov
import ru.kmept.kmept.tyan.TyanActivity
import ru.kmept.kmept.antonchik.PrudnikovActivity
import ru.kmept.kmept.ostrikov.OstrikovActivity
import ru.kmept.kmept.antonchik.PargevClas
import ru.kmept.kmept.semenpaket.semenjanclasick

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onPargevClick(view:View)
    {
        val intent = Intent(MainActivity@this, PargevClas::class.java)
        startActivity(intent)
    }
    fun onAntonchikClick(view: View) {
        val intent = Intent(MainActivity@ this, AntonchikActivity::class.java)
        startActivity(intent)
    }
    
        fun onSlavesnovClick(view: View) {
            val intent = Intent(MainActivity@this, Slavesnov::class.java)
            startActivity(intent)
        }
    
    fun onTyanClick(view: View) {
        val intent = Intent(MainActivity@this, TyanActivity::class.java)
        startActivity(intent)
    }

    fun onPrudnikovClick(view: View) {
        val intent = Intent(MainActivity@this, PrudnikovActivity::class.java)
        startActivity(intent)
    }
    
    fun onOstrikovClick(view: View) {
        val intent = Intent(MainActivity@this, OstrikovActivity::class.java)
        startActivity(intent)
    }


    fun onShekerSoldClick(view: View) {
        val intent = Intent(MainActivity@this, ShekerSold::class.java)
        startActivity(intent)
    }

    fun onVinogradovClick(view: View) {
        val intent = Intent(MainActivity@this, VinogradovActivity::class.java)
        startActivity(intent)
    }

    fun onlapaClick(view: View) {
        val intent = Intent(MainActivity@this, semenjanclasick::class.java)
        startActivity(intent)
    }
    
    fun onKugushevClick(view: View) {
        val intent  = Intent(MainActivity@this, Kugushev::class.java)
        startActivity(intent)
    }
    
    fun onlohovClick(view: View) {
        val intent = Intent(MainActivity@this, LohovActivity::class.java)
        startActivity(intent)
    }
}