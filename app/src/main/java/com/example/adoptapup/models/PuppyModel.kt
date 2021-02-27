package com.example.adoptapup.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PuppyModel(
    val name: String?,
    val sex: String?,
    val breed: String?,
    val age: Int?,
    val color: String?,
    val Image: String?,
    val likes: ArrayList<String>?,
    val dislikes: ArrayList<String>?,
    val Story: String,

) : Parcelable