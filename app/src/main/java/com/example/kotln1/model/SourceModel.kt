package com.example.kotln1.model

import com.google.gson.annotations.SerializedName

data class SourceModel (




    @SerializedName ("id")
    private  var sourceId : String,

    @SerializedName("name")
    private  var sourceName : String


)