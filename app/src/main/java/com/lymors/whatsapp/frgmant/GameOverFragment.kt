package com.lymors.whatsapp.frgmant

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.lymors.whatsapp.R
import com.lymors.whatsapp.databinding.FragmentGameOverBinding

class GameOverFragment : Fragment() {


    class GameOverFragment : Fragment() {
        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            val binding: FragmentGameOverBinding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_game_over, container, false
            )
            return binding.root
        }
    }}