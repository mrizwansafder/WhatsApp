package com.lymors.whatsapp.frgmant

import android.os.Bundle
import android.provider.ContactsContract.RawContacts.Data
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.lymors.whatsapp.R
import com.lymors.whatsapp.databinding.FragmentTitleBinding

class TitleFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding:FragmentTitleBinding=DataBindingUtil.inflate(
        inflater,R.layout.fragment_title,container, false);
        binding.playButton.setOnClickListener {view:View->
            Navigation.findNavController(view).navigate(R.id.action_titleFragment_to_game_Fragment)
        }
        setHasOptionsMenu(true)
        return  binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
    inflater?.inflate(R.menu.overflow_menu,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!,
        requireView().findNavController()
        )
                ||super.onOptionsItemSelected(item)
    }



}