package com.dicoding.skinalyze.ui.home

import android.os.Bundle
<<<<<<< HEAD
import android.text.SpannableString
import android.text.Spannable
import android.text.style.StyleSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.dicoding.skinalyze.R
=======
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
>>>>>>> fa95419b5d2154a44d780bb1930917f9deab17b1
import com.dicoding.skinalyze.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
<<<<<<< HEAD
=======

    // This property is only valid between onCreateView and
    // onDestroyView.
>>>>>>> fa95419b5d2154a44d780bb1930917f9deab17b1
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
<<<<<<< HEAD
        // Inisialisasi binding
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Mengatur teks dengan gaya yang diinginkan
        val helloText = "Hello"
        val userName = "Abdul"
        val spannable = SpannableString("$helloText $userName")

        // Membuat teks "Hello" menjadi bold
        spannable.setSpan(
            StyleSpan(android.graphics.Typeface.BOLD),
            0, // Mulai dari indeks 0
            helloText.length, // Sampai panjang "Hello"
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        // Menampilkan teks pada TextView
        binding.tvHelloUser.text = spannable

=======
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHome
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
>>>>>>> fa95419b5d2154a44d780bb1930917f9deab17b1
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> fa95419b5d2154a44d780bb1930917f9deab17b1
