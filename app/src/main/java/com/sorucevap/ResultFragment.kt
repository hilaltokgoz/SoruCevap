package com.sorucevap

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.sorucevap.databinding.FragmentResultBinding
import com.zhuinden.fragmentviewbindingdelegatekt.viewBinding

class ResultFragment : Fragment(R.layout.fragment_result) {
    private val binding by viewBinding(FragmentResultBinding::bind)
    private val args: ResultFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        /* bundle ile veri alımı
        val answer= arguments?.getString("result")
          binding.resultText.text=answer*/

        //safeArgs ile veri alımı
        binding.resultText.text = when{
            args.result.equals("ankara",true) -> "Tebrikler Bildiniz."
                else->"Üzgünüz Bilemediniz!"
        }
        binding.backButton.setOnClickListener {
            findNavController().popBackStack(R.id.questionFragment,false)
        }
        binding.returnHomePageButton.setOnClickListener {
           findNavController().popBackStack(R.id.homeFragment,false)
        }
    }
}