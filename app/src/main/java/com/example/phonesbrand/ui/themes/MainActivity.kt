package com.example.phonesbrand.ui.themes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.example.phonesbrand.databinding.ActivityMainBinding
import com.example.phonesbrand.PhonesApplication
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val phonesViewModel: PhonesViewModel by lazy {
        (application as PhonesApplication).dependencContainer.phonesViewModelFactory.create(
            PhonesViewModel::class.java
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        phonesViewModel.getPhoneType()
        lifecycleScope.launch {
            phonesViewModel.phoneType.collect {
                binding.phones.text = it?.phoneType
            }

        }
    }
}