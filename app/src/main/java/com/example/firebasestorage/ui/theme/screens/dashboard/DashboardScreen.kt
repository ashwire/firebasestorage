package com.example.firebasestorage.ui.theme.screens.dashboard

import android.content.Intent
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
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
import com.example.firebasestorage.R
import com.example.firebasestorage.AddDetailsActivity

import com.example.firebasestorage.navigation.ROUT_CLOTHING
import com.example.firebasestorage.ui.theme.lBlue

@Composable
fun DashboardScreen(navController: NavHostController){
    Column(modifier = Modifier.fillMaxSize()) {
        TopAppBar(
            title = { Text(text = "Amazon Shop") },
            backgroundColor = lBlue
        )
        //END OF TOPAPPBAR
        Spacer(modifier = Modifier.height(30.dp))


        Row(modifier = Modifier.padding(start = 20.dp)) {
            Column {
                Text(text = "Amazon",
                    fontSize = 35.sp,
                    color = lBlue,
                    fontWeight = FontWeight.ExtraBold,
                    fontFamily = FontFamily.Default)
                Text(text = "Shop from A to Z")
            }
            Spacer(modifier = Modifier.width(20.dp))

            Image(painter = painterResource(id = R.drawable.img),
                contentDescription = "jp",
                modifier = Modifier.size(100.dp))
        }
        //End of Row
        Spacer(modifier = Modifier.height(30.dp))

        Column (modifier = Modifier.padding(start = 20.dp)){
            val mContext = LocalContext.current

            Row {
                Card(modifier = Modifier
                    .size(width = 150.dp, height = 100.dp)
                    .clickable {
                        mContext.startActivity(Intent(mContext,AddDetailsActivity::class.java))
                    }
                )
                {
                    Column {
                        Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center)
                        {
                            Image(painter = painterResource(id = R.drawable.cl),
                                contentDescription = "jp",
                                modifier = Modifier.size(50.dp))

                        }
                        Text(text ="Clothing", fontSize = 15.sp, color = lBlue,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }

                }
                Spacer(modifier = Modifier.width(10.dp))

                Card(modifier = Modifier.size(width = 150.dp, height = 100.dp))
                {
                    Column {
                        Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center)
                        {
                            Image(painter = painterResource(id = R.drawable.elec),
                                contentDescription = "elec",
                                modifier = Modifier.size(50.dp))

                        }
                        Text(text ="Electronics", fontSize = 15.sp, color = lBlue,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }

                }

            }
            //End of Row
            Spacer(modifier = Modifier.height(20.dp))

            Row {
                Card(modifier = Modifier.size(width = 150.dp, height = 100.dp))
                {
                    Column {
                        Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center)
                        {
                            Image(painter = painterResource(id = R.drawable.hm),
                                contentDescription = "hm",
                                modifier = Modifier.size(50.dp))

                        }
                        Text(text ="Home", fontSize = 15.sp, color = lBlue,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }

                }
                Spacer(modifier = Modifier.width(10.dp))

                Card(modifier = Modifier.size(width = 150.dp, height = 100.dp))
                {
                    Column {
                        Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center)
                        {
                            Image(painter = painterResource(id = R.drawable.bt),
                                contentDescription = "bt",
                                modifier = Modifier.size(50.dp))

                        }
                        Text(text ="Beauty", fontSize = 15.sp, color = lBlue,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }

                }

            }
            //End of Row
            Spacer(modifier = Modifier.height(20.dp))

            Row {
                Card(modifier = Modifier.size(width = 150.dp, height = 100.dp))
                {
                    Column {
                        Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center)
                        {
                            Image(painter = painterResource(id = R.drawable.pa),
                                contentDescription = "pa",
                                modifier = Modifier.size(50.dp))

                        }
                        Text(text ="Pharmacy", fontSize = 15.sp, color = lBlue,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }

                }
                Spacer(modifier = Modifier.width(10.dp))

                Card(modifier = Modifier.size(width = 150.dp, height = 100.dp))
                {
                    Column {
                        Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center)
                        {
                            Image(painter = painterResource(id = R.drawable.gr),
                                contentDescription = "jp",
                                modifier = Modifier.size(50.dp))

                        }
                        Text(text ="Groceries", fontSize = 15.sp, color = lBlue,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }

                }

            }
            //End of Row
            Spacer(modifier = Modifier.height(20.dp))

            Row {
                Card(modifier = Modifier.size(width = 150.dp, height = 100.dp))
                {
                    Column {
                        Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center)
                        {
                            Image(painter = painterResource(id = R.drawable.img),
                                contentDescription = "jp",
                                modifier = Modifier.size(50.dp))

                        }
                        Text(text ="Clothing", fontSize = 15.sp, color = lBlue,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }

                }
                Spacer(modifier = Modifier.width(10.dp))

                Card(modifier = Modifier.size(width = 150.dp, height = 100.dp))
                {
                    Column {
                        Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center)
                        {
                            Image(painter = painterResource(id = R.drawable.img),
                                contentDescription = "jp",
                                modifier = Modifier.size(50.dp))

                        }
                        Text(text ="Clothing", fontSize = 15.sp, color = lBlue,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }

                }

            }
            //End of Row

        }










    }

}

@Preview(showBackground = true, )
@Composable
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())
}