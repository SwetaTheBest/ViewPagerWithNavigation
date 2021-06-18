package com.swetajain.viewpagerwithnavigation.viewpager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.swetajain.viewpagerwithnavigation.StartFragmentOne
import com.swetajain.viewpagerwithnavigation.StartFragmentThree
import com.swetajain.viewpagerwithnavigation.StartFragmentTwo
import com.swetajain.viewpagerwithnavigation.adapter.ViewPagerAdapter
import com.swetajain.viewpagerwithnavigation.databinding.FragmentViewPagerBinding

/**
 * A simple [Fragment] subclass.
 */
class ViewPagerFragment : Fragment() {
    private var _binding: FragmentViewPagerBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentViewPagerBinding.inflate(layoutInflater, container, false)
        val fragmentList = arrayListOf<Fragment>(
            StartFragmentOne(),
            StartFragmentTwo(),
            StartFragmentThree()
        )
        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )
        binding.viewPager.adapter = adapter

        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}