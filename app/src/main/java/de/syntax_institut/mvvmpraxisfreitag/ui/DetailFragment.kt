package de.syntax_institut.mvvmpraxisfreitag.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import de.syntax_institut.mvvmpraxisfreitag.MainActivity
import de.syntax_institut.mvvmpraxisfreitag.R
import de.syntax_institut.mvvmpraxisfreitag.SharedViewModel
import de.syntax_institut.mvvmpraxisfreitag.databinding.FragmentDetailBinding


class DetailFragment : Fragment() {

    private val viewModel: SharedViewModel by activityViewModels()
    private lateinit var binding: FragmentDetailBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as MainActivity).setToolbarTitle(getString(R.string.title))
        observeViewModel()
        binding.btnBack.setOnClickListener {
            findNavController().navigateUp()
        }
        binding.btnComplete.setOnClickListener {
            viewModel.completedCourseTwo()
        }

    }

    private fun observeViewModel() {
        viewModel.selectedCourse.observe(viewLifecycleOwner) {
            binding.tvCourseName.setText(it.courseName)
            binding.tvCourseDetail.setText(it.courseDescription)
            binding.ivCourseLogo.setImageResource(it.coursePicture)
            updatePassedUI(it.completed)
        }


    }

    private fun updatePassedUI(passed: Boolean) {
        if (passed) {
            binding.btnComplete.backgroundTintList = ContextCompat.getColorStateList(requireContext(), R.color.passed)
            binding.btnComplete.setTextColor(ContextCompat.getColorStateList(requireContext(), R.color.black))
            binding.btnComplete.setText(R.string.btn_complete)
        } else {
            binding.btnComplete.backgroundTintList = ContextCompat.getColorStateList(requireContext(), R.color.syntax)
            binding.btnComplete.setText(R.string.btn_notcomplete)
        }
    }


}