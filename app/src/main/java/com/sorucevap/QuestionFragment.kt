package com.sorucevap

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sorucevap.databinding.FragmentQuestionBinding
import com.zhuinden.fragmentviewbindingdelegatekt.viewBinding


class QuestionFragment : Fragment(R.layout.fragment_question) {
    private  val binding by viewBinding(FragmentQuestionBinding::bind)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }


}