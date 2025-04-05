package com.example.cuadrantcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cuadrantcompose.ui.theme.CuadrantComposeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CuadrantComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // ✅ Aplica padding a ComposeQuadrant()
                        ComposeQuadrant(modifier = Modifier.padding(innerPadding))

                }
            }
        }
    }
}

@Composable
fun Box(text1: String, text2: String, backgroundColor: Color, modifier: Modifier = Modifier){
    Column(modifier=modifier
        .fillMaxSize()
        .background(backgroundColor)
        .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = text1,
            fontWeight = FontWeight.Bold,
            modifier=Modifier
                .padding(bottom = 16.dp)

        )
        Text(
            text = text2,
            textAlign = TextAlign.Justify
        )
    }


}
@Composable
fun ComposeQuadrant(modifier: Modifier=Modifier) {
    Column(Modifier.fillMaxSize()) {
        Row(Modifier.weight(1f)){
            Box(
                text1 = stringResource(R.string.first_tittle),
                text2 = stringResource(R.string.frist_text),
                Color(0xFFEADDFF), modifier = Modifier.weight(1f))
            Box(text1 = stringResource(R.string.second_tittle),
                    text2= stringResource(R.string.second_text),
                    Color(0xFFD0BCFF),
                 modifier = Modifier.weight(1f))
        }
        Row(Modifier.weight(1f)){
            Box(
                text1 = stringResource(R.string.tree_tittle),
                text2 = stringResource(R.string.trhee_Text),
                Color(0xFFB69DF8), modifier = Modifier.weight(1f))

            Box(text1 = stringResource(R.string.four_tittle),
                text2= stringResource(R.string.four_text),
                Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f))
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CuadrantComposeTheme {
        ComposeQuadrant()
    }
}

