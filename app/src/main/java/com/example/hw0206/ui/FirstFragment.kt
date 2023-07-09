package com.example.hw0206.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw0206.R
import com.example.hw0206.databinding.FragmentFirstBinding
import com.example.hw0206.ui.SecondFragment.Companion.KEY_1
import com.example.hw0206.ui.base.BaseFragment

class FirstFragment : BaseFragment<FragmentFirstBinding>() {

    override fun inflateBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentFirstBinding {
        return FragmentFirstBinding.inflate(inflater, container,
            false)
    }

    override fun initListener() {
        super.initListener()

        binding.btn.setOnClickListener {
            val text = binding.et.text.toString()
            val secondFragment = SecondFragment()
            val bundle = Bundle().apply {
                putString(KEY_1, text)
            }
            secondFragment.arguments = bundle
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, secondFragment).
                addToBackStack(null).commit()
        }
    }


}