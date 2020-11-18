package com.example.tictactoe

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private var isPlayerOne: Boolean = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        buttonreset.setOnClickListener {
            button00.text = ""
            button00.isClickable = true
            button01.text = ""
            button01.isClickable = true
            button02.text = ""
            button02.isClickable = true
            button10.text = ""
            button10.isClickable = true
            button11.text = ""
            button11.isClickable = true
            button12.text = ""
            button12.isClickable = true
            button20.text = ""
            button20.isClickable = true
            button21.text = ""
            button21.isClickable = true
            button22.text = ""
            button22.isClickable = true
        }
    }

    private fun init() {
        button00.setOnClickListener {
            changeButton (button00)
        }
        button01.setOnClickListener() {
            changeButton(button01)
        }

        button02.setOnClickListener() {
            changeButton(button02)
        }
        button10.setOnClickListener() {
            changeButton(button10)
        }
        button11.setOnClickListener() {
            changeButton(button11)
        }
        button12.setOnClickListener() {
            changeButton(button12)
        }
        button20.setOnClickListener() {
            changeButton(button20)
        }
        button21.setOnClickListener() {
            changeButton(button21)
        }
        button22.setOnClickListener() {
            changeButton(button22)
        }
        buttonreset.setOnClickListener() {

        }

    }
    private fun changeButton (button: Button) {
        if (isPlayerOne) {
            button.text = "X"
        }else {
            button.text = "O"
        }
        button.isClickable = false
        isPlayerOne =! isPlayerOne
        checkWinner ()

    } //ძალიან დიდი ბოდიში ვერ მოვასწარი კოდის დასრულება ტექნიკური ხარვეზების გამო რამდენჯერმე
    //მომიწია ანდროიდ სტუდიოს წაშლა და ხელახლა ჩაწერა
    private fun checkWinner () {
        if (button00.text.isNotEmpty() && button00.text.toString() == button01.text.toString() && button00.text.toString() == button02.text.toString()) {
            Toast.makeText(this , "Winner is ${button00.text}", Toast.LENGTH_SHORT).show()

        }else if (button10.text.isNotEmpty() && button10.text.toString() == button11.text.toString() && button10.text.toString() == button12.text.toString()) {
            Toast.makeText(this , "Winner is ${button10.text}", Toast.LENGTH_SHORT).show()

        }

    }

}