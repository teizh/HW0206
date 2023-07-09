package com.example.hw0206.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<DB : ViewBinding/*, VM : ViewModel*/>(/*  @LayoutRes private val layoutId: Int,
      private val viewModelClass: Class<VM>*/
) : Fragment() {
    // lateinit var viewModel: VM
    private var _binding: DB? = null
    val binding: DB
        get() = _binding!!

    abstract fun inflateBinding(
        inflater: LayoutInflater, container: ViewGroup?
    ): DB

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        _binding = inflateBinding(inflater, container)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView()
        initListener()

    }

    open fun initListener() {}

    open fun initView() {}

}