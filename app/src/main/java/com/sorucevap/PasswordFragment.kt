package com.sorucevap

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.sorucevap.databinding.FragmentLoginBinding
import com.sorucevap.databinding.FragmentPasswordBinding
import com.zhuinden.fragmentviewbindingdelegatekt.viewBinding

class PasswordFragment: Fragment(R.layout.fragment_password) {
    private val binding by viewBinding(FragmentPasswordBinding::bind)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.Button.setOnClickListener {
            findNavController().navigate(PasswordFragmentDirections.actionPasswordFragmentToLoginSuccessDialog())
        }
    }
}