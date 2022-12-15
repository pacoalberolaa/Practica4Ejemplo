package com.example.practica4ejemplo

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.practica4ejemplo.databinding.FragmentCambioNombreBinding
import com.example.practica4ejemplo.databinding.FragmentSaludoBinding

// TODO: Rename parameter arguments, choose names that match


/**
 * A simple [Fragment] subclass.
 * Use the [CambioNombreFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CambioNombreFragment : Fragment() {
    // This property is only valid between onCreateView and
    // onDestroyView.
    private var _binding: FragmentCambioNombreBinding? = null
    val args:SaludoFragmentArgs by navArgs()
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCambioNombreBinding.inflate(inflater, container,
            false)
        return binding.root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btCambiarNombre2.setOnClickListener {
            findNavController().navigate(R.id.action_cambioNombreFragment_to_saludoFragment)
            val nombre=binding.tvNuevoNombre.text.toString()
            //creamos la acción pasándole el valor como argumento
            val action = FirstFragmentDirections.actionFirstFragmentToSaludoFragment(nombre)
            //abrimos SaludoFragment
            findNavController().navigate(action)
        }
    }
}