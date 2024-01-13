package com.example.kidsdrawingapp

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.example.kidsdrawingapp.DrawingView.Companion.colorList
import com.example.kidsdrawingapp.DrawingView.Companion.currentBrush
import com.example.kidsdrawingapp.DrawingView.Companion.pathList

class MainActivity : AppCompatActivity() {

    companion object{
        var path=Path()
        var paintBrush= Paint()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val redBtn:ImageButton=findViewById(R.id.redColor)
        val blueBtn:ImageButton=findViewById(R.id.blueColor)
        val blackBtn:ImageButton=findViewById(R.id.blackColor)
        val eraser:ImageButton=findViewById(R.id.whiteColor)

        redBtn.setOnClickListener {
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            paintBrush.color=Color.RED
            currentColor(paintBrush.color)
        }

        blueBtn.setOnClickListener {
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            paintBrush.color=Color.BLUE
            currentColor(paintBrush.color)
        }
        blackBtn.setOnClickListener {
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            paintBrush.color=Color.BLACK
            currentColor(paintBrush.color)
        }
        eraser.setOnClickListener {
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            pathList.clear()
            colorList.clear()
            path.reset()
        }
    }
    private fun currentColor(color:Int){
        currentBrush=color
        path=Path()
    }
}