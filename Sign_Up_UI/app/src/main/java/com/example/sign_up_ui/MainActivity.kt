package com.example.sign_up_ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.LocationOn
import androidx.compose.material.icons.rounded.Lock
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sign_up_ui.ui.theme.Sign_Up_UITheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Sign_Up_UITheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier
                            .background(Color.Yellow)
                    ) {
                        Text(
                            text = "Create Your Account",
                            fontSize = 32.sp,
                            fontWeight = FontWeight.ExtraBold,
                            modifier = Modifier
                                .padding(vertical = 60.dp)
                                .align(Alignment.CenterHorizontally)
                        )
                        TextField(value = "",
                            onValueChange ={},
                            placeholder = {
                                Text(text = "Name")
                            },
                            colors = TextFieldDefaults.outlinedTextFieldColors(Color.Red),
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                                .background(Color.Yellow),
                            leadingIcon ={
                                Icon(imageVector = Icons.Rounded.Person,contentDescription = null)
                            }
                            )
                        Spacer(modifier = Modifier.height(10.dp))
                        TextField(value = "",
                            onValueChange ={},
                            placeholder = {
                                Text(text = "Address")
                            },
                            colors = TextFieldDefaults.outlinedTextFieldColors(Color.Red),
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                                .background(Color.Yellow),
                            leadingIcon = {
                                Icon(imageVector = Icons.Rounded.LocationOn, contentDescription = null)
                            }
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        TextField(value = "",
                            onValueChange ={},
                            placeholder = {
                                Text(text = "Email")
                            },
                            colors = TextFieldDefaults.outlinedTextFieldColors(Color.Red),
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                                .background(Color.Yellow),
                            leadingIcon = {
                                Icon(imageVector = Icons.Rounded.Email, contentDescription = null)
                            }
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        TextField(value = "",
                            onValueChange ={},
                            placeholder = {
                                Text(text = "Password")
                            },
                            colors = TextFieldDefaults.outlinedTextFieldColors(Color.Red),
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                                ,
                            leadingIcon = {
                                Icon(imageVector = Icons.Rounded.Lock, contentDescription = null)
                            }
                        )
                        Spacer(modifier = Modifier.height(30.dp))
                        Row {
                            Checkbox(checked = true, onCheckedChange =null
                                ,
                                modifier = Modifier
                                    .padding(start = 60.dp)
                            )
                            Text(text = "I read and agree Terms and Condition",
                                modifier=Modifier
                                    .padding(start = 10.dp)
                            )
                        }

                        Spacer(modifier = Modifier.height(10.dp))
                        Button(onClick = { /*TODO*/ },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 80.dp),
                            shape = RoundedCornerShape(13.dp)
                            ) {
                            Text(text = "Register")
                        }
                    }
                }
            }
        }
    }
}
