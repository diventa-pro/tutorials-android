package diventa.pro.tutorialscustomcomponents

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class CustomComponent : View {

    constructor(context: Context?) : super(context) {
        myinit()
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        myinit()
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        myinit()
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int, defStyleRes: Int) : super(context, attrs, defStyleAttr) {
        myinit()
    }

    private lateinit var paint: Paint
    private var finalw: Int = 0
    private var finalh: Int = 0

    private fun myinit() {
        paint = Paint(Paint.ANTI_ALIAS_FLAG)
        paint.setStyle(Paint.Style.FILL);
        paint.color = 0xFF335588.toInt()
    }


    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        this.finalw = w
        this.finalh = h
    }

    override fun onDraw(canvas: Canvas?) {

        if(canvas == null) return

        canvas.drawLine(0.0F, 0.0F, finalw.toFloat(), finalh.toFloat(), paint)




    }

}
