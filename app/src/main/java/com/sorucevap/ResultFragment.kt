package com.sorucevap

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sorucevap.databinding.FragmentResultBinding
import com.zhuinden.fragmentviewbindingdelegatekt.viewBinding

class ResultFragment : Fragment(R.layout.fragment_result) {
    private  val binding by viewBinding(FragmentResultBinding::bind)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

       val answer= arguments?.getString("result")
        binding.resultText.text=answer
    }
}