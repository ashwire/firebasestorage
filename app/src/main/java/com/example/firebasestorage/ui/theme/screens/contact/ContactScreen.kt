package com.example.firebasestorage.ui.theme.screens.contact

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.ui.theme.screens.about.AboutScreen

@Composable
fun ContactScreen(navHostController: NavHostController){

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ContactScreenPreview(){
    ContactScreen(rememberNavController())
}