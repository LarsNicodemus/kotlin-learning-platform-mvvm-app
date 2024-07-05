package de.syntax_institut.mvvmpraxisfreitag

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import de.syntax_institut.mvvmpraxisfreitag.data.AppRepository
import de.syntax_institut.mvvmpraxisfreitag.data.model.Course

class SharedViewModel : ViewModel() {

    private val repository = AppRepository()
    private val courseList = repository.loadCourses()
    private var position = 0

    private val _courses = MutableLiveData<List<Course>>(courseList)
    val courses: LiveData<List<Course>>
        get() = _courses

    private var _selectedCourse = MutableLiveData<Course>(courseList[position])
    val selectedCourse: LiveData<Course>
        get() = _selectedCourse

    fun selectCourse(newCourse: Course) {
        _selectedCourse.value = newCourse
    }

    fun completedCourse() {
        _selectedCourse.value?.let {
            it.completed = !it.completed
            _selectedCourse.value = it
        }
    }

    fun completedCourseTwo() {
        val currentCourse = _selectedCourse.value
        if (currentCourse != null) {
            currentCourse.completed = !currentCourse.completed
            _selectedCourse.value = currentCourse
        }
    }
}