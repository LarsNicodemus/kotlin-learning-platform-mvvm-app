package de.syntax_institut.mvvmpraxisfreitag

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/* MainActivity dient nur dazu, den NavContainer zu halten. Mit Ausnahme vom Layout, müssen wir hier
nichts mehr programmieren. */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}