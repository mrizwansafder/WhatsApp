package com.lymors.whatsapp.frgmant

import android.content.Intent
import android.os.Bundle
import android.service.credentials.Action
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.lymors.whatsapp.R
import com.lymors.whatsapp.databinding.FragmentGameWonBinding

class GameWonFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentGameWonBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_game_won, container, false)

        binding.nextMatchButton.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_gameWonFragment_to_gameFragment)
        }

     setHasOptionsMenu(true)
        return binding.root
    }
//    private  fun  getShareIntent():Intent {
////        val args=GameWonFragmentArgs.fromBundle(requireArguments())
//        val shareIntent = Intent(Intent.ACTION_SEND)
//        shareIntent.setType("text/plain").putExtra(
//            Intent.EXTRA_TEXT,
////            getString(R.string.share_success_text, args.numCorrect, args.numQuestions))
//        return shareIntent
//    }
//    private fun shareSuccess(){
//        startActivity(getShareIntent())
//    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.winner_menu,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
//            R.id.share->shareSuccess()
        }
        return super.onOptionsItemSelected(item)
    }
}
