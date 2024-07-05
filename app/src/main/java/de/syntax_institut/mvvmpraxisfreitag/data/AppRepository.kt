package de.syntax_institut.mvvmpraxisfreitag.data

import de.syntax_institut.mvvmpraxisfreitag.R
import de.syntax_institut.mvvmpraxisfreitag.data.model.Course

class AppRepository {

    val courses: List<Course>
        get() = loadCourses()

    fun loadCourses(): List<Course> {
        return listOf(
            Course(R.string.title_ui, R.string.ui, R.drawable.logofigma, false),
            Course(R.string.title_basics, R.string.basics, R.drawable.logocoding, false),
            Course(R.string.title_android, R.string.android, R.drawable.logoandroid, false),
            Course(R.string.title_ios, R.string.ios, R.drawable.logoios, false),
        )
    }
}