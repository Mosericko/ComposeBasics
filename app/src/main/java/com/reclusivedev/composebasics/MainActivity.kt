package com.reclusivedev.composebasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.reclusivedev.composebasics.ui.theme.ComposeBasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBasicsTheme {
                Surface(color = MaterialTheme.colors.background) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        GenericSurface()
                        GenericSurface(bgColor = MaterialTheme.colors.secondary)
                        GenericSurface(bgColor = MaterialTheme.colors.primaryVariant)
                        GenericSurface(bgColor = MaterialTheme.colors.secondaryVariant)
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeBasicsTheme {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            GenericSurface()
            GenericSurface(bgColor = MaterialTheme.colors.secondary)
            GenericSurface(bgColor = MaterialTheme.colors.primaryVariant)
            GenericSurface(bgColor = MaterialTheme.colors.secondaryVariant)


        }
    }
}

@Composable
fun GenericSurface(bgColor: Color = MaterialTheme.colors.primary) {
    Surface(
        modifier = Modifier
            .width(200.dp)
            .height(50.dp),
        color = bgColor
    ) {}
}