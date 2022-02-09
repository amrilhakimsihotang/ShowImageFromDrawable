package id.amrilhs.showimagefromdrawable

import android.graphics.BitmapFactory
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class DetailImage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_image)
        val detailImage: ImageView = findViewById(R.id.detImage)

        val extras: Bundle = intent.extras!!
        val byteArray = extras.getByteArray("Img")
        val img = BitmapFactory.decodeByteArray(byteArray, 0, byteArray!!.size)
        detailImage.setImageBitmap(img)


    }
}