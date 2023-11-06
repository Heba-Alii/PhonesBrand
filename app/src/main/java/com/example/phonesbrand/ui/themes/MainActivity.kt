package com.example.phonesbrand.ui.themes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.phonesbrand.databinding.ActivityMainBinding
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    //View Model Factory (Manual DI)
    //    private val phonesViewModel: PhonesViewModel by lazy {
//        (application as PhonesApplication).dependencyContainer.phonesViewModelFactory.create(
//            PhonesViewModel::class.java
//        )
//    }
    // inject ViewModel
    private val phonesViewModel: PhonesViewModel by inject()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        phonesViewModel.getPhoneType()
        lifecycleScope.launch {
            phonesViewModel.phoneType.collect {
                binding.phones.text = it?.brand.toString()
            }

        }
    }
}