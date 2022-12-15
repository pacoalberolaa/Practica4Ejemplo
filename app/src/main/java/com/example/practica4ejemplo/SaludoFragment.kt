package com.example.practica4ejemplo

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.practica4ejemplo.databinding.FragmentSaludoBinding

// TODO: Rename parameter arguments, choose names that match
@SuppressLint("StaticFieldLeak")



/**
 * A simple [Fragment] subclass.
 * Use the [SaludoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SaludoFragment : Fragment() {
    // This property is only valid between onCreateView and
    // onDestroyView.
    private var _binding: FragmentSaludoBinding? = null
    val args:SaludoFragmentArgs by navArgs()
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSaludoBinding.inflate(inflater, container,
            false)
        return binding.root
    }
    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)
        binding.tvSaludo.text="Hola ${args.nombre}"

    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}