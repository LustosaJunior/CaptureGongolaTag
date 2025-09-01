package com.example.capturegongolatag.ui

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.capturegongolatag.databinding.ActivityCameraPreviewBinding

class CameraPreviewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCameraPreviewBinding

    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {
        binding = ActivityCameraPreviewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        return super.onCreateView(name, context, attrs)
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}