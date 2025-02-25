package com.github.neoturak

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.github.neoturak.viewer.databinding.ActivityViewEffectBinding


class ViewEffectActivity : AppCompatActivity() {
    private var _binding: ActivityViewEffectBinding? = null
    private val binding: ActivityViewEffectBinding by lazy { _binding!! }

    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        _binding = ActivityViewEffectBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //corner radius
        /*     binding.sbCornerRadius.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
                 override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                     binding.sv.cornersRadius = dp2px(progress.toFloat())
                 }

                 override fun onStartTrackingTouch(seekBar: SeekBar?) {
                 }

                 override fun onStopTrackingTouch(seekBar: SeekBar?) {
                 }
             })*/

        //top-left corner

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}