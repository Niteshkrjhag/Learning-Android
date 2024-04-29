package com.example.businesscardapp

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
//                    color = Color(R.color.App_Background_Color)
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Top(name:String,companyName:String){
    Column(
        Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val image = painterResource(id = R.drawable.android_logo)
Box(
    modifier = Modifier
        .background(Color(R.color.App_Background_Color))
){

    Image(painter = image,
        contentDescription = null,
//            contentScale = ContentScale.Fit,
        modifier = Modifier
            .height(100.dp)
            .width(300.dp),
        alpha = 0.9F
    )
}
        Text(
        text = name,
        fontSize = 24.sp,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Bold,
        )
        Text(
            text = companyName,
            fontSize = 18.sp,
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.Light,
            color = Color(R.color.Dark_Green),
            modifier = Modifier
                .padding(top = 1.dp)
        )
    }
//    Spacer(modifier = Modifier.height(.dp))
    Bottom(phoneNo = "2123", socialMediaHandle ="@AndroidDev", email ="jen.doe@android.com" )
}
@Composable
fun Bottom(phoneNo:String,socialMediaHandle:String,email:String,modifier: Modifier=Modifier){

        Column(
            Modifier.fillMaxWidth()
                .padding(top = 700.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(bitmap = Ima){

            }
            Text(
                text = phoneNo,
                fontSize = 16.sp,
                fontWeight = FontWeight.Light,
            )
            Text(
                text = socialMediaHandle,
                fontSize = 16.sp,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Light,
            )
            Text(
                text = email,
                fontSize = 16.sp,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Light,
            )
    }
}
@Composable
fun Greeting() {
   Top("nitesh","kumar")
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardAppTheme {
        com.example.businesscardapp.Top(name = "nitesh", companyName = " Arjun  " )
    }
}