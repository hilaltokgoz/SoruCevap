package com.sorucevap

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.sorucevap.databinding.FragmentHomeBinding
import com.zhuinden.fragmentviewbindingdelegatekt.viewBinding


class HomeFragment : Fragment(R.layout.fragment_home) {
    //View Binding
    private val binding by viewBinding(FragmentHomeBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            questionButton.setOnClickListener {
                //id ile
                //findNavController().navigate(R.id.action_homeFragment_to_questionFragment)
                //safeArgs ile
                findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToQuestionFragment())
            }
            loginButton.setOnClickListener {
                findNavController().navigate(HomeFragmentDirections.actionGlobalLoginGraph())
            }
        }

    }
}