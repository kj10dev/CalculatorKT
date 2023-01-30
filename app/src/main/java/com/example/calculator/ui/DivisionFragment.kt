package com.example.calculator.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.calculator.R
import com.example.calculator.data.CalculatorViewModel
import com.example.calculator.databinding.FragmentDivisionBinding
import com.example.calculator.databinding.FragmentMultiplicationBinding

class DivisionFragment : Fragment() {

    //required for viewBinding
    private var _binding: FragmentDivisionBinding? = null
    private val binding get() = _binding!!

    //required for viewModel class CalculatorViewModel
    lateinit var viewModel: CalculatorViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentDivisionBinding.inflate(inflater, container, false)
        val view = binding.root

        //setup viewModel
        viewModel = ViewModelProvider(this).get(CalculatorViewModel::class.java)

        //divide button
        binding.fabDivide.setOnClickListener(){
            binding.answer.text = viewModel.division(
                binding.firstNum.text.toString().toInt(),
                binding.secNum.text.toString().toInt()
            ).toString()
        }

        return view
    }



}