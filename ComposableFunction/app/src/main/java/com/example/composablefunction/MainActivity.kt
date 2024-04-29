package com.example.composablefunction

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
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
import androidx.compose.ui.unit.sp
import com.example.composablefunction.ui.theme.ComposableFunctionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposableFunctionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}


@Composable
fun cardContent(header:String,Body:String,color:Color,modifier: Modifier = Modifier){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(color)
            .fillMaxSize()
            .padding(16.dp)
//                    modifier = Modifier.padding(8.dp)
    ) {
        Text(
            text = header,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
//             .weight(0.0F,false)
        )
        Text(
            text = Body,
            textAlign = TextAlign.Justify
        )
    }
}


@Composable
fun Greeting() {
Column(
    Modifier.fillMaxWidth()
) {
Row(Modifier.weight(1f)){
    cardContent(header = stringResource(id = R.string.first_Header),
        Body = stringResource(id =R.string.first_Paragraph ),
        color = Color(R.color.Q1),
        modifier = Modifier.weight(1f))
    cardContent(header = stringResource(id = R.string.second_Header),
        Body = stringResource(id =R.string.first_Paragraph ),
        color = Color(R.color.Q1),
        modifier = Modifier.weight(1f))
}
    Row(Modifier.weight(1f)){
        cardContent(header = stringResource(id = R.string.Third_Header),
            Body = stringResource(id =R.string.first_Paragraph ),
            color = Color(R.color.Q1),
            modifier = Modifier.weight(1f))
        cardContent(header = stringResource(id = R.string.fourth_Header),
            Body = stringResource(id =R.string.first_Paragraph ),
            color = Color(R.color.Q1),
            modifier = Modifier.weight(1f))
    }
}
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposableFunctionTheme {
        Greeting()
    }
}