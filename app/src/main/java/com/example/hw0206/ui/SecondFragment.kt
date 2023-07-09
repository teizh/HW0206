package com.example.hw0206.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.hw0206.databinding.FragmentSecondBinding
import com.example.hw0206.ui.base.BaseFragment


class SecondFragment : BaseFragment<FragmentSecondBinding>() {
    override fun inflateBinding(
        inflater: LayoutInflater, container: ViewGroup?
    ): FragmentSecondBinding {
        return FragmentSecondBinding.inflate(
            inflater, container, false
        )
    }

    override fun initView() {
        super.initView()

        val result = arguments?.getString(KEY_1)
        binding.tv.text = result

    }
    companion object {
         const val KEY_1 = "1"
    }

}