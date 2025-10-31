package com.learn.myapplication1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.learn.myapplication1.ui.theme.MyApplication1Theme

class Tugas1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplication1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(modifier = Modifier.padding(innerPadding)) {
                        TugasSatu()
                    }
                }
            }
        }
    }
}

@Composable
fun TugasSatu() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "Data Mahasiswa",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Blue,
            modifier = Modifier.padding(10.dp)
        )

        Text(
            text = "Nama: Sylvia Bunga Sutirah",
            fontSize = 18.sp,
            color = Color.Black,
            modifier = Modifier.padding( start = 10.dp)
        )

        Text(
            text = "Jurusan: Manajemen Informatika",
            fontSize = 18.sp,
            color = Color.Black,
            modifier = Modifier.padding(start = 10.dp)
        )

        Text(
            text = "Universitas: STMIK Mardira Indonesia",
            fontSize = 18.sp,
            color = Color.Black,
            modifier = Modifier.padding(start = 10.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TugasSatuPreview() {
    MyApplication1Theme {
        TugasSatu()
    }
}
