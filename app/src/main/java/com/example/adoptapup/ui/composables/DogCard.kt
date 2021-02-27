package com.example.adoptapup.ui.composables

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.media.Image
import android.util.Log
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Pets
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle

import androidx.compose.ui.unit.dp
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.transition.Transition
import com.example.adoptapup.R
import com.example.adoptapup.models.PuppyModel
import com.example.adoptapup.ui.theme.appTypography


@Composable
fun DogCard(
    Dog: PuppyModel,
    onClick: () -> Unit,
){
    val PrimaryColor = Color(0xFFb86d29)
    Card(
        shape = MaterialTheme.shapes.small,
        modifier = Modifier
            .padding(
                bottom = 6.dp,
                top = 6.dp,
            )
            .fillMaxWidth()
            .clickable(onClick = onClick),
        elevation = 8.dp,
    ) {
        Column {
      Dog.Image?.let { com.example.adoptapup.util.GlideImage(url = it) }

            Dog.name?.let {title ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(PrimaryColor)
                ){
                    Icon(Icons.Filled.Pets,"", modifier = Modifier // take up 85% of width, 15% for score
                        .wrapContentWidth(Alignment.Start),)
                    Text(
                        text = title,
                        modifier = Modifier
                            .fillMaxWidth(0.85f) // take up 85% of width, 15% for score
                            .wrapContentWidth(Alignment.Start),
                        style = appTypography.h3,

                    )

                    Text(
                        text = "Age: ${Dog.age.toString()}",
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentWidth(Alignment.End)
                            .align(Alignment.CenterVertically)
                            .padding(end = 6.dp),
                        style = MaterialTheme.typography.body1
                    )


                }
            }





        }
    }



}