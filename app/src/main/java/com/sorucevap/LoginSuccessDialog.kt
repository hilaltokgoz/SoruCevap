package com.sorucevap

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.sorucevap.databinding.DialogConfirmationBinding
import com.sorucevap.databinding.DialogLoginSuccessBinding
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
    private val binding by viewBinding (DialogLoginSuccessBinding::bind)
    private  val args:ConfirmationDialogArgs by navArgs() //safeArgs
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
     return   inflater.inflate(R.layout.dialog_login_success,container,false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
            //graph tamamlanmış oluyor.Hangi ekranda kaldıysak oradan devam edeceğimizi belitrtiyoruz.
             binding.continueButton.setOnClickListener {
                 findNavController().popBackStack(R.id.login_graph,true)
             }
    }


}