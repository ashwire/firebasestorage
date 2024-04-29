package com.example.firebasestorage.ui.theme.screens.clothing

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.google.firebase.database.collection.R

@Composable
fun ClothingScreen(navHostController: NavHostController){
    val mContext = LocalContext.current
    Column (modifier = Modifier.fillMaxSize()){
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentAlignment = Alignment.BottomStart
        ) {
            val mContext = LocalContext.current
            Image(
                painter = painterResource(id=com.example.firebasestorage.R.drawable.cl3),
                contentDescription = "cloth",
                modifier = Modifier
                    .fillMaxSize()
                    .clickable {
                               Toast.makeText(mContext,"Clicked on main image",
                                   Toast.LENGTH_LONG).show()
                    },
                contentScale = ContentScale.Crop
            )
            Text(
                text = "WINTER COLLECTION",
                fontSize = 35.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.White,

            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Column (modifier = Modifier
            .verticalScroll(rememberScrollState())
            .padding(start = 20.dp)) {
            Row {
                Column {
                    Box(modifier = Modifier.size(width = 160.dp, height = 180.dp)) {
                        Card {
                            Image(
                                painter = painterResource(id = com.example.firebasestorage.R.drawable.cl1),
                                contentDescription = "cloth",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )

                        }
                        //end of card
                    }

                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Lorem",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Default
                    )
                    Row {
                        Text(
                            text = "Ksh.2000",
                            fontSize = 15.sp,
                            color = Color.Black
                        )
                        Spacer(modifier = Modifier.width(30.dp))
                        Text(text = "Pay",
                            color = Color.Blue,
                            modifier = Modifier.clickable {
                                val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                            })


                    }
                }
                Spacer(modifier = Modifier.width(10.dp))
                Column {
                    Box(modifier = Modifier.size(width = 160.dp, height = 180.dp)) {
                        Card {
                            Image(
                                painter = painterResource(id = com.example.firebasestorage.R.drawable.cl2),
                                contentDescription = "cloth",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )

                        }
                        //end of card
                    }

                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Lorem",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Default
                    )
                    Row {
                        Text(
                            text = "Ksh.2000",
                            fontSize = 15.sp,
                            color = Color.Black
                        )
                        Spacer(modifier = Modifier.width(30.dp))
                        Text(text = "Pay",
                            color = Color.Blue,
                            modifier = Modifier.clickable {
                                val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                            })


                    }
                }


            }
            //End of Row1
            Spacer(modifier = Modifier.height(20.dp))
            Row {
                Column {
                    Box(modifier = Modifier.size(width = 160.dp, height = 180.dp)) {
                        Card {
                            Image(
                                painter = painterResource(id = com.example.firebasestorage.R.drawable.cl3),
                                contentDescription = "cloth",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )

                        }
                        //end of card
                    }

                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Lorem",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Default
                    )
                    Row {
                        Text(
                            text = "Ksh.2000",
                            fontSize = 15.sp,
                            color = Color.Black
                        )
                        Spacer(modifier = Modifier.width(30.dp))
                        Text(text = "Pay",
                            color = Color.Blue,
                            modifier = Modifier.clickable {
                                val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                            })


                    }
                }
                Spacer(modifier = Modifier.width(10.dp))
                Column {
                    Box(modifier = Modifier.size(width = 160.dp, height = 180.dp)) {
                        Card {
                            Image(
                                painter = painterResource(id = com.example.firebasestorage.R.drawable.cl4),
                                contentDescription = "cloth",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )

                        }
                        //end of card
                    }

                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Lorem",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Default
                    )
                    Row {
                        Text(
                            text = "Ksh.2000",
                            fontSize = 15.sp,
                            color = Color.Black
                        )
                        Spacer(modifier = Modifier.width(30.dp))
                        Text(text = "Pay",
                            color = Color.Blue,
                            modifier = Modifier.clickable {
                                val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                            })


                    }
                }


            }
            //End of Row2
            Spacer(modifier = Modifier.height(20.dp))

            Row {
                Column {
                    Box(modifier = Modifier.size(width = 160.dp, height = 180.dp)) {
                        Card {
                            Image(
                                painter = painterResource(id = com.example.firebasestorage.R.drawable.igman),
                                contentDescription = "cloth",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )

                        }
                        //end of card
                    }

                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Lorem",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Default
                    )
                    Row {
                        Text(
                            text = "Ksh.2000",
                            fontSize = 15.sp,
                            color = Color.Black
                        )
                        Spacer(modifier = Modifier.width(30.dp))
                        Text(text = "Pay",
                            color = Color.Blue,
                            modifier = Modifier.clickable {
                                val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                            })


                    }
                }
                Spacer(modifier = Modifier.width(10.dp))
                Column {
                    Box(modifier = Modifier.size(width = 160.dp, height = 180.dp)) {
                        Card {
                            Image(
                                painter = painterResource(id = com.example.firebasestorage.R.drawable.cl1),
                                contentDescription = "cloth",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )

                        }
                        //end of card
                    }

                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Lorem",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Default
                    )
                    Row {
                        Text(
                            text = "Ksh.2000",
                            fontSize = 15.sp,
                            color = Color.Black
                        )
                        Spacer(modifier = Modifier.width(30.dp))
                        Text(text = "Pay",
                            color = Color.Blue,
                            modifier = Modifier.clickable {
                                val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                            })


                    }
                }


            }
            //End of Row1
            Spacer(modifier = Modifier.height(20.dp))








        }

        }





    }



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ClothingScreenPreview(){
    ClothingScreen(rememberNavController())
}