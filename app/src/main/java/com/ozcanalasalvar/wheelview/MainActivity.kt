package com.ozcanalasalvar.wheelview


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.ozcanalasalvar.wheelview.screen.ImagePickerScreen
import com.ozcanalasalvar.wheelview.screen.TextPickerScreen
import com.ozcanalasalvar.wheelview.ui.theme.WheelviewTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WheelviewTheme {
                // A surface container using the 'background' color from the theme
                //SlotScreen()

                TextPickerScreen()

                //ImagePickerScreen()
            }
        }
    }
}