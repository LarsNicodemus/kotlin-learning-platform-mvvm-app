package de.syntax_institut.mvvmpraxisfreitag.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import de.syntax_institut.mvvmpraxisfreitag.MainActivity
import de.syntax_institut.mvvmpraxisfreitag.R
import de.syntax_institut.mvvmpraxisfreitag.SharedViewModel
import de.syntax_institut.mvvmpraxisfreitag.adapter.CourseAdapter
import de.syntax_institut.mvvmpraxisfreitag.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private val viewModel: SharedViewModel by activityViewModels()
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as MainActivity).setToolbarTitle(getString(R.string.title_courses))
        val recyclerView = binding.rvCoursesHome
        viewModel.courses.observe(viewLifecycleOwner) {
            recyclerView.adapter = CourseAdapter(it, viewModel)
        }
    }

}