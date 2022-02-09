package id.amrilhs.showimagefromdrawable

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import java.io.ByteArrayOutputStream

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongThread")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val photo: ImageView = findViewById(R.id.imageViewActivity)
        val moveIt: Button = findViewById(R.id.button)

        photo.setImageResource(R.drawable.a)
        val img: Bitmap = BitmapFactory.decodeResource(resources, R.drawable.a)
        val stream = ByteArrayOutputStream()
        img.compress(Bitmap.CompressFormat.PNG, 100, stream)

        val byteArray = stream.toByteArray()

        moveIt.setOnClickListener {

            val mIntent = Intent(this, DetailImage::class.java)
            mIntent.putExtra("Img", byteArray)
            startActivity(mIntent)

        }


    }
}