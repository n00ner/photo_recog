package net.n00ner.meter_lolz.detector

import android.graphics.RectF

data class DetectionResult(
    val id: Int,
    val title: String,
    val confidence: Float,
    val location: RectF
) {
    val text: String by lazy {
        "$id:$title[${"%.2f".format(confidence)}]"
    }
}