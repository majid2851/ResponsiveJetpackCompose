package com.opensource.responsivejetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.majid2851.responsive_compose.sdp
import com.majid2851.responsive_compose.ssp
import com.opensource.responsivejetpackcompose.ui.theme.ResponsiveJetpackComposeTheme

class MainActivity : ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContent {
            ResponsiveJetpackComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment =Alignment.CenterHorizontally
                    )
                    {
                        Box(
                           modifier = Modifier
                               .width(100.sdp)
                               .height(100.sdp)
                               .background(
                                   color = Color.Blue
                               )
                        )
                        Spacer(modifier = Modifier.height(20.sdp))

                        Text(
                            text = "Sample Text",
                            fontSize = 15.ssp
                        )


                    }

                }
            }
        }
    }
}



