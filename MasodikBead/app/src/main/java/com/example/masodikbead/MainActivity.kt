package com.example.masodikbead

import android.content.res.ColorStateList
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    var wifiOnOff: Boolean = false
    var locationOnOff: Boolean = false
    var bluetoothOnOff: Boolean = false
    var screenRotationOnOff: Boolean = true

    lateinit var wifi_btn: FloatingActionButton
    lateinit var location_btn: FloatingActionButton
    lateinit var bluetooth_btn: FloatingActionButton
    lateinit var screenRotaion_btn: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigation)
        val navController = findNavController(R.id.fragmentContainerView)

        val appBarConfiguration = AppBarConfiguration(setOf(R.id.first_Fragment_home, R.id.second_Fragment_video, R.id.third_Fragment_text))
        setupActionBarWithNavController(navController, appBarConfiguration)

        bottomNavigationView.setupWithNavController(navController)

        wifi_btn = findViewById(R.id.house_wifi_btn)
        location_btn = findViewById(R.id.house_location_btn)
        bluetooth_btn = findViewById(R.id.house_bluetooth_btn)
        screenRotaion_btn = findViewById(R.id.house_screen_btn)

        wifi_btn.setOnClickListener { view ->
            if(!wifiOnOff){
                wifi_btn.setImageResource(R.drawable.ic_wifi_on)
                wifi_btn.setBackgroundTintList(ColorStateList.valueOf(resources.getColor(R.color.blue)))
                wifiOnOff = true
            }else{
                wifi_btn.setImageResource(R.drawable.ic_wifi_off)
                wifi_btn.setBackgroundTintList(ColorStateList.valueOf(resources.getColor(R.color.grey)))
                wifiOnOff = false
            }
        }

        location_btn.setOnClickListener { view ->
            if(!locationOnOff){
                location_btn.setImageResource(R.drawable.ic_location_on)
                location_btn.setBackgroundTintList(ColorStateList.valueOf(resources.getColor(R.color.blue)))
                locationOnOff = true
            }else{
                location_btn.setImageResource(R.drawable.ic_location_off)
                location_btn.setBackgroundTintList(ColorStateList.valueOf(resources.getColor(R.color.grey)))
                locationOnOff = false
            }
        }

        bluetooth_btn.setOnClickListener { view ->
            if(!bluetoothOnOff){
                bluetooth_btn.setImageResource(R.drawable.ic_bluetooth_on)
                bluetooth_btn.setBackgroundTintList(ColorStateList.valueOf(resources.getColor(R.color.blue)))
                bluetoothOnOff = true
            }else{
                bluetooth_btn.setImageResource(R.drawable.ic_bluetooth_off)
                bluetooth_btn.setBackgroundTintList(ColorStateList.valueOf(resources.getColor(R.color.grey)))
                bluetoothOnOff = false
            }
        }

        screenRotaion_btn.setOnClickListener { view ->
            if(!screenRotationOnOff){
                screenRotaion_btn.setImageResource(R.drawable.ic_screen_rotation_on)
                screenRotaion_btn.setBackgroundTintList(ColorStateList.valueOf(resources.getColor(R.color.blue)))
                screenRotationOnOff = true
            }else{
                screenRotaion_btn.setImageResource(R.drawable.ic_screen_rotation_off)
                screenRotaion_btn.setBackgroundTintList(ColorStateList.valueOf(resources.getColor(R.color.grey)))
                screenRotationOnOff = false
            }
        }
    }
}