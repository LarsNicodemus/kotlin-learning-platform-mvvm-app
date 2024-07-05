package de.syntax_institut.mvvmpraxisfreitag.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import de.syntax_institut.mvvmpraxisfreitag.R
import de.syntax_institut.mvvmpraxisfreitag.SharedViewModel
import de.syntax_institut.mvvmpraxisfreitag.data.model.Course
import de.syntax_institut.mvvmpraxisfreitag.databinding.CourseItemBinding
import de.syntax_institut.mvvmpraxisfreitag.ui.HomeFragmentDirections

class CourseAdapter(
    private val courses: List<Course>,
    private val viewModel: SharedViewModel
) : RecyclerView.Adapter<CourseAdapter.CourseViewHolder>() {

    inner class CourseViewHolder(val binding: CourseItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CourseAdapter.CourseViewHolder {
        val binding = CourseItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CourseViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CourseAdapter.CourseViewHolder, position: Int) {
        val course = courses[position]
        val binding = holder.binding
        binding.tvCourseName.setText(course.courseName)
        binding.ivCourse.setImageResource(course.coursePicture)
        if (course.completed){
            binding.ivCourseComplete.setColorFilter(
                ContextCompat.getColor(binding.root.context, R.color.passed))
        } else {
            binding.ivCourseComplete.setColorFilter(
                ContextCompat.getColor(binding.root.context, R.color.purple_200))
        }
//        binding.ivCourseComplete.setOnClickListener {
//            viewModel.completedCourseTwo()
//        }
        binding.cvCourse.setOnClickListener {
            viewModel.selectCourse(course)
            val action = HomeFragmentDirections.actionHomeFragmentToDetailFragment()
            it.findNavController().navigate(action)
        }
    }

    override fun getItemCount(): Int {
        return courses.size
    }
}