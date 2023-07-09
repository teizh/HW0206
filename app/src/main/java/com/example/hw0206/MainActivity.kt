package com.example.hw0206

import com.example.hw0206.databinding.ActivityMainBinding
import com.example.hw0206.ui.FirstFragment
import com.example.hw0206.ui.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun inflateViewBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun initView() {
        super.initView()
        supportFragmentManager.beginTransaction().
        add(R.id.fragmentContainer, FirstFragment()).commit()
    }
}