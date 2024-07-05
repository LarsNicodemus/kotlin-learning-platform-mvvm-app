package de.syntax_institut.mvvmpraxisfreitag

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import de.syntax_institut.mvvmpraxisfreitag.databinding.ActivityMainBinding

/* MainActivity dient nur dazu, den NavContainer zu halten. Mit Ausnahme vom Layout, müssen wir hier
nichts mehr programmieren. */
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
    fun setToolbarTitle(title: String) {
        binding.tvToolbarTitle.text = title
    }
}