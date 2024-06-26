package com.dsm104.desafio.practico2_dsm104_movil.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.dsm104.desafio.practico2_dsm104_movil.clases.service.RecursosApiService
import com.dsm104.desafio.practico2_dsm104_movil.databinding.FragmentNotificationsBinding
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NotificationsFragment : Fragment() {

    private var _binding: FragmentNotificationsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private val BASE_URL = "https://6640fe24a7500fcf1a9f452f.mockapi.io/api/v1/recursos/"

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val notificationsViewModel =
            ViewModelProvider(this).get(NotificationsViewModel::class.java)

        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        val root: View = binding.root


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}