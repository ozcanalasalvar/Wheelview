package com.ozcanalasalvar.wheelview

import android.R
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.content.ContextCompat
import com.ozcanalasalvar.wheelview.screen.TextPickerScreen
import com.ozcanalasalvar.wheelview.ui.theme.WheelviewTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val window: Window = this.getWindow()

// clear FLAG_TRANSLUCENT_STATUS flag:

// clear FLAG_TRANSLUCENT_STATUS flag:
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)

// add FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS flag to the window

// add FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS flag to the window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)

// finally change the color

// finally change the color
        window.statusBarColor = ContextCompat.getColor(this, R.color.white)
        setContent {
            WheelviewTheme {
                // A surface container using the 'background' color from the theme
                //SlotScreen()

                TextPickerScreen()
            }
        }
    }
}