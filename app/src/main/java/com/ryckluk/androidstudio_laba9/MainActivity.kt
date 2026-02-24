package com.ryckluk.androidstudio_laba9

import com.ryckluk.androidstudio_laba9.ui.theme.Androidstudiolaba9Theme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ryckluk.androidstudio_laba9.data.Datasource
import com.ryckluk.androidstudio_laba9.model.Game
import com.ryckluk.androidstudio_laba9.ui.theme.Androidstudiolaba9Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Androidstudiolaba9Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GameCatalogApp()
                }
            }
        }
    }
}

@Composable
fun GameCatalogApp() {
    val datasource = Datasource()
    val games = datasource.loadGameList()


    var currentIndex by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = games[currentIndex].imageResourceId),
            contentDescription = stringResource(id = games[currentIndex].titleResourceId),
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(16.dp))


        Text(
            text = stringResource(id = games[currentIndex].titleResourceId),
            style = MaterialTheme.typography.headlineMedium,
            color = MaterialTheme.colorScheme.primary
        )

        Spacer(modifier = Modifier.height(8.dp))


        Text(
            text = stringResource(id = games[currentIndex].descriptionResourceId),
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 8.dp)
        )


    }
}

@Preview(showBackground = true)
@Composable
fun GameCatalogPreview() {
    Androidstudiolaba9Theme {
        GameCatalogApp()
    }
}
