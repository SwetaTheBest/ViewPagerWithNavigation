package com.swetajain.viewpagerwithnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.swetajain.viewpagerwithnavigation.databinding.FragmentStartThreeBinding

/**
 * A simple [Fragment] subclass.
 */
class StartFragmentThree : Fragment() {
    private var _binding: FragmentStartThreeBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentStartThreeBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}