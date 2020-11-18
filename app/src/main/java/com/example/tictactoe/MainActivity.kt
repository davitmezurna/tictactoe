package com.example.tictactoe

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private var isPlayerOne: Boolean = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
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
    private fun changeButton (button:Button) {
        if (isPlayerOne) {
            button.text = "X"
        }else {
            button.text = "O"
        }
        button.isclickable = false
        isPlayerOne = isPlayerOne
        checkWinner ()

    }
    private fun checkWinner () {
        if (button00.text.isnotempty() && button00.text.toString() == button01.text.toString() && button00.text.toString() == button02.text.toString()) {
            resultTextView.text = "winner is $ (button00.text)"
            buttonContainer.visibility = View.Gone
        }else if (button10.text.isnotempty() && button10.text.toString() == button11.text.toString() && button10.text.toString() == button12.text.toString()) {
            resultTextView.text = "winner is $ (button00.text)"
            buttonContainer.visibility = View.Gone
        }

    }

}