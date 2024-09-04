package com.example.kotln1.Models

import com.google.gson.annotations.SerializedName

class SourceModel {




    @SerializedName ("id")
    private lateinit var id : String

    @SerializedName("name")
    private lateinit var name : String

    fun getId():String{

        return id


    }

    fun getName():String {


        return name

    }

    fun setId( id:String) {

        this.id = id


    }

    fun setName(name:String){

        this.name = name


    }


}