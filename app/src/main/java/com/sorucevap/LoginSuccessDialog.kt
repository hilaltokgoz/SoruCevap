package com.sorucevap

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.sorucevap.databinding.DialogConfirmationBinding
import com.zhuinden.fragmentviewbindingdelegatekt.viewBinding

// Code with ❤️
//┌──────────────────────────┐
//│ Created by Hilal TOKGOZ  │
//│ ──────────────────────── │
//│ hilaltokgoz98@gmail.co   │
//│ ──────────────────────── │
//│ 22.04.2022               │
//└──────────────────────────┘
//Dialog Oluşturma
class LoginSuccessDialog: BottomSheetDialogFragment() {
    private val binding by viewBinding (DialogConfirmationBinding::bind)
    private  val args:ConfirmationDialogArgs by navArgs() //safeArgs
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
     return   inflater.inflate(R.layout.dialog_confirmation,container,false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            yesButton.setOnClickListener {
               findNavController().navigate(ConfirmationDialogDirections.actionConfirmationDialogToResultFragment(args.result))
            }
            noButton.setOnClickListener {
                findNavController().popBackStack()
            }
        }
    }


}