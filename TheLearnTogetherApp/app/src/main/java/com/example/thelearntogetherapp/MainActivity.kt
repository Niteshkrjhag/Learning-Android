package com.example.thelearntogetherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.thelearntogetherapp.ui.theme.TheLearnTogetherAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TheLearnTogetherAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    Learn_Together(
                        header = stringResource(id = R.string.Header),
                        body1 = stringResource(id = R.string.body1),
                        body2 = stringResource(id = R.string.body2)
                    )

                }
            }
        }
    }
}

@Composable
fun Text_DEC(header: String,body1: String,body2: String){
Column(
    verticalArrangement = Arrangement.Center,
    modifier = Modifier
){
    Text(
        text = header,
        fontSize = 24.sp,
        modifier = Modifier
            .padding(16.dp,130.dp,16.dp,16.dp)
    )
    Text(
        text = body1,
        textAlign = androidx.compose.ui.text.style.TextAlign.Justify,
        modifier = Modifier
            .padding(16.dp,0.dp,16.dp,0.dp)
    )
    Text(
        text = body2,
        textAlign = androidx.compose.ui.text.style.TextAlign.Justify,
        modifier = Modifier
            .padding(16.dp)
    )
}
}

@Composable
fun Learn_Together(header:String,body1:String,body2:String, modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Box(modifier){
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 0.dp, 0.dp, 200.dp),
            contentScale = ContentScale.Fit
        )
//        Spacer(modifier = Modifier.height(16.dp))
        Text_DEC(header = header, body1 = body1, body2 = body2)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TheLearnTogetherAppTheme {
        Learn_Together(
            header = stringResource(id = R.string.Header),
            body1 = stringResource(id = R.string.body1),
            body2 = stringResource(id = R.string.body2)
        )
    }
}