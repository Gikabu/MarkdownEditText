package com.gikabu.markdownedittext.sample

import MarkdownEditText.R
import MarkdownEditText.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableStringBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.edittext.setStylesBar(binding.stylesbar)
        binding.toolbar.setOnMenuItemClickListener {
            when(it.itemId){
                R.id.to_md -> binding.edittext.text = SpannableStringBuilder(binding.edittext.getMD())
                R.id.render_md -> binding.edittext.renderMD()
            }
            return@setOnMenuItemClickListener true
        }
        //Select specific Styles to show
        //binding.stylesbar.stylesList = arrayOf(MarkdownEditText.TextStyle.BOLD, MarkdownEditText.TextStyle.ITALIC)
    }
}