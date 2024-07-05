package com.example.practiceleakcanary

import android.content.Context
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext


//object LeakyContainer {
//    var leakyReference: Context? = null
//}
@Composable
fun LeakyComposable() {

    val context = LocalContext.current

    Button(onClick = {
        //LeakyContainer.leakyReference = context
    }) {
        Text("Click me to leak context")
    }
}
