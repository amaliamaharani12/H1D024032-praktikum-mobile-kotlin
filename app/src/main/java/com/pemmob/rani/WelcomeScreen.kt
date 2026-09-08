package com.pemmob.rani

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun WelcomeScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.gedung_teknik),
            contentDescription = "Gedung Fakultas Teknik",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Selamat datang di Prodi Informatika,\nFakultas Teknik,\nUniversitas Jenderal Soedirman",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Program Studi Informatika di Universitas Jenderal Soedirman (Unsoed) berdiri pada tahun 2008, berawal dari kebutuhan yang semakin mendesak akan tenaga ahli di bidang teknologi informasi dan komunikasi. Saat itu, perkembangan teknologi yang pesat di Indonesia dan dunia memerlukan lembaga pendidikan tinggi yang mampu mencetak lulusan dengan kompetensi tinggi di bidang informatika.\n\nPada tahun tersebut, Fakultas Sains dan Teknik (FST) Unsoed mengambil inisiatif untuk mendirikan Program Studi Informatika. Pembentukan program studi ini bertujuan untuk memenuhi tuntutan masyarakat dan industri yang membutuhkan tenaga profesional dalam bidang teknologi informasi. Kurikulum yang disusun dirancang untuk memberikan pendidikan berkualitas, menggabungkan aspek praktis dan teoritis dari informatika, seperti pemrograman, sistem informasi, jaringan komputer, dan kecerdasan buatan.",
            fontSize = 14.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.weight(1f))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            contentAlignment = Alignment.BottomEnd
        ) {
            Button(
                onClick = { /* TODO: aksi pindah halaman */ },
                shape = RoundedCornerShape(50)
            ) {
                Text("NEXT")
            }
        }
    }
}