package diventa.pro.tutorialscustomcomponents

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class CompositeCardComponent : ConstraintLayout {

    constructor(context: Context?) : super(context) {
        myinit(context)
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        myinit(context, attrs)
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        myinit(context, attrs, defStyleAttr)
    }

    private var header: TextView? = null
    private var body: TextView? = null
    private var picture: ImageView? = null

    override fun onFinishInflate() {
        super.onFinishInflate()

        header = this.findViewById<TextView>(R.id.header)

        header?.text = "This is header"
        header?.setBackgroundColor(0x00000000)

        body = this.findViewById<TextView>(R.id.body)
        body?.text = "This is body"
        header?.setBackgroundColor(0x00FF0000)

        picture = this.findViewById<ImageView>(R.id.picture)
    }

    private fun myinit(context: Context?, attrs: AttributeSet? = null, defStyleAttr: Int? = null) {
        if(context==null) return
        LayoutInflater.from(context).inflate(R.layout.component_card, this)
    }
//
//    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
//
//        val spec = suggestedMinimumWidth
//        var w = normalize(widthMeasureSpec)
//        var h = normalize(heightMeasureSpec)
//
//
//        // CONTRACT: When overriding this method,
//        // you must call setMeasuredDimension(int, int)
//        // to store the measured width and height of this view.
//        //
//        // It is the subclass's responsibility to make sure the measured height and width
//        // are at least the view's minimum height and width
//        // (getSuggestedMinimumHeight() and getSuggestedMinimumWidth()).
//        setMeasuredDimension( MeasureSpec.makeMeasureSpec(w, MeasureSpec.EXACTLY), MeasureSpec.makeMeasureSpec(h, MeasureSpec.EXACTLY))
//
////        super.onMeasure(MeasureSpec.makeMeasureSpec(width, MeasureSpec.EXACTLY),
////                MeasureSpec.makeMeasureSpec(height, MeasureSpec.EXACTLY));
//
//    }

    private fun normalize(widthMeasureSpec: Int): Int {

        val w1: Int
        when (MeasureSpec.getMode(widthMeasureSpec)) {
            MeasureSpec.AT_MOST -> {
                // Measure specification mode: The child can be as large as it wants up to the specified size.
                w1 = MeasureSpec.getSize(widthMeasureSpec)
            }
            MeasureSpec.EXACTLY -> {
                w1 = MeasureSpec.getSize(widthMeasureSpec)
            }
            MeasureSpec.UNSPECIFIED -> {
                w1 = 256
            }
            else -> { throw IllegalArgumentException() }
        }
        return w1
    }


}
