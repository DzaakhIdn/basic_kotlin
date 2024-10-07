package org.belajar.kotlin
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(){
    val name = "Dzaki" //Datanya tidak bisa dirubah kayak const
    var umur = 17 //Datanya dapat berubah
    umur = 18

    val tinggal: String? = null
    val textLenght = tinggal?.length?:"Tidak tahu" //Elvis Operator atau memberikan nilai default pada null
    println("nama saya $name umur saya $umur dan saya tinggal di $textLenght")

//    Array
    val randomList = mutableListOf("ba", 1, true)
    randomList[2] = false
    randomList.add("hayo")
    randomList.add(1,"Papo")
    println(randomList)

//    Operator Matematika
    var a = 10
    val b = 14

    val math = a * b
    println("hasil dari $a + $b adalah $math")
    println("tambah " + a++)
    println("tambah " + a++)

    val textName = "Abdurrahman Dzaki"
    val charIndex = textName[5]

    println("Huruf ke 6 dari $textName adalah $charIndex")

    val openHour = 7
    val closeHour = 10
    val hourNow = 8
    val status: String

    if (hourNow > openHour){
        status = "Alredy open"
    }else if (openHour == hourNow){
        status = "wait a minute, will be open"
    }
    else{
        status = "Alredy close"
    }
    println("The store is $status")

    val isOpen = if (hourNow >= openHour && hourNow <= closeHour){
        true
    }else{
        false
    }

    println(isOpen)

    val notOpen = if (!isOpen){
        println("tutup")
    } else {
        println("buka")
    }

    println(notOpen)

    val stringInt = "23"
    val intVal = 20

    println(stringInt.toInt() + intVal)
}
