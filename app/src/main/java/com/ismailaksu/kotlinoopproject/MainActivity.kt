package com.ismailaksu.kotlinoopproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //constructor
        var myUser = User("Ismail",23)
        myUser.name = "Bekir"
        myUser.age = 49
        println(myUser.age.toString())
        println(myUser.name)
        println(myUser.information())

        //encapsulation

        var james = Musician("James", "Guitar", 55)
        println(james.age.toString())
        println(james.returnBandName("ismail"))
        println(james.returnBandName("ali"))

        //inheritance

        var lars = SuperMusician("Lars","Drums", 65)
        println(lars.name)
        println(lars.returnBandName("ismail"))
        lars.sing()

        //polymorphism

        //static polymorphism
        var mathematics = Mathematics()
        println(mathematics.sum())
        println(mathematics.sum(5,6))
        println(mathematics.sum(5,6,5))

        //dynamic polymorphism
        var animal = Animal()
        animal.sing()

        var barley = Dog()
        barley.test()
        barley.sing()

        //Abstract & Interface
        val myPiano = Piano()
        myPiano.brand = "Yamaha"
        myPiano.digital = false
        println(myPiano.roomName)
        myPiano.info()

        //Lambda expressions
        fun printString(myString : String) {
            println(myString)
        }
        printString("test string")

        val testString = {myString: String -> println(myString)}
        testString("my lambda string")

        val multiplyLambda = {a: Int, b: Int -> a * b}
        println(multiplyLambda(4,5))

        val multiplyLambda2 : (Int, Int) -> Int = {a,b -> a*b}
        println(multiplyLambda2(5,5))

        //asynchronous

        //callback function, listener function, completion function

        fun downloadMusicians(url: String, completion : (Musician) -> Unit) {
            // url -> download
            //data
            val kirkHammet = Musician("Kirk", "Guitar", 60)
            completion(kirkHammet)
        }
        downloadMusicians("metallica.com",{ musician ->
            println(musician.name)
        })
    }

}