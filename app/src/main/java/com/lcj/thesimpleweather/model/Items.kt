package com.lcj.thesimpleweather.model


import com.google.gson.annotations.SerializedName

data class Items(
    @SerializedName("item")
    val item: List<Item>
)