package com.sorucevap

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.sorucevap.databinding.FragmentQuestionBinding
import com.zhuinden.fragmentviewbindingdelegatekt.viewBinding


class QuestionFragment : Fragment(R.layout.fragment_question) {
    private val binding by viewBinding(FragmentQuestionBinding::bind)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            questionButton.setOnClickListener {
                val answer = resultEdit.text.toString()

                /*Bundlee ile
                findNavController().navigate(
                    R.id.action_questionFragment_to_resultFragment,
                    bundleOf("result" to answer)
                )*/

                //SafeArgs ile
                findNavController().navigate(
                    QuestionFragmentDirections.actionQuestionFragmentToConfirmationDialog(answer)
                )
            }
            binding.buttonLogin.setOnClickListener {
                findNavController().navigate(QuestionFragmentDirections.actionGlobalLoginGraph())
            }
        }
    }
}