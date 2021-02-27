package com.example.adoptapup.ui.composables

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.example.adoptapup.models.PuppyModel



@Composable
fun DogView(
    dog: PuppyModel,
){
    val primaryColor = Color(0xFFb86d29)
    val state = rememberScrollState()
    LaunchedEffect(Unit) { state.animateScrollTo(100) }
    Column(
        modifier = Modifier.fillMaxWidth()
        .padding(horizontal = 8.dp)
        .verticalScroll(state)
    ) {
        dog.Image?.let { com.example.adoptapup.util.GlideImage(url = it) }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            dog.name?.let { title ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 8.dp)
                ) {
                    Text(
                        text = title,
                        modifier = Modifier
                            .fillMaxWidth(0.85f)
                            .wrapContentWidth(align = Alignment.Start),
                        style = MaterialTheme.typography.h3
                    )
                    val Age = dog.age.toString()
                    Text(
                        text = "Age: $Age",
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentWidth(align = Alignment.End)
                            .align(Alignment.CenterVertically),
                        style = MaterialTheme.typography.h5
                    )
                }
                dog.breed?.let { breed ->

                    Text(
                        text = "Breed: $breed",
                        modifier = Modifier.fillMaxWidth()
                            .padding(bottom = 8.dp),
                        style = MaterialTheme.typography.caption
                    )
                }

                dog.Story.let { Story ->

                    Text(
                        text = Story,
                        modifier = Modifier.fillMaxWidth()
                            .padding(bottom = 8.dp),
                        style = MaterialTheme.typography.caption
                    )
                }

                dog.color.let { Color ->

                    Text(
                        text = "Coat Color: $Color",
                        modifier = Modifier.fillMaxWidth()
                            .padding(bottom = 8.dp),
                        style = MaterialTheme.typography.caption
                    )
                }

                Column(
                    modifier = Modifier.fillMaxWidth().fillMaxHeight(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Button(onClick = {},
                        colors = ButtonDefaults.buttonColors(backgroundColor = primaryColor)
                        )
                    { Text("Adopt Now")
                        Icon(Icons.Filled.Favorite,"")}
                }

            }
        }
    }
}

