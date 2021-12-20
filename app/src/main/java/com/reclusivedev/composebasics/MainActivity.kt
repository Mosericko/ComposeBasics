package com.reclusivedev.composebasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.reclusivedev.composebasics.ui.theme.ComposeBasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBasicsTheme {
                Surface(color = MaterialTheme.colors.background) {
                    /*Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        GenericSurface()
                        GenericSurface(bgColor = MaterialTheme.colors.secondary)
                        GenericSurface(bgColor = MaterialTheme.colors.primaryVariant)
                        GenericSurface(bgColor = MaterialTheme.colors.secondaryVariant)
                    }*/
                    BoxComposable()
                }
            }
        }
    }
}


/*@Preview(showBackground = true)
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
}*/

//Box composable
@Composable
fun BoxComposable() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .background(MaterialTheme.colors.primary)
                .width(100.dp)
                .height(100.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Text(
                text = "I Love Jetpack Compose",
                fontSize = 40.sp,
                color = MaterialTheme.colors.background
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun BoxPreview() {
    ComposeBasicsTheme {
        BoxComposable()
    }
}
//All Composable inside a box Composable layout are stacked on top of each other
//--similar to the Frame Layout in View System