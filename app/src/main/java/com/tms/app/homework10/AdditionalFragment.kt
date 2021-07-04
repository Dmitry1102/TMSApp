package com.tms.app.homework10

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.tms.app.databinding.FragmentAdditionalCandyBinding

class AdditionalFragment: Fragment() {

    private var binding: FragmentAdditionalCandyBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAdditionalCandyBinding.inflate(inflater,container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(arguments?.getSerializable(CANDY_KEY) as Candy){
            binding?.let {
                it.tvBrand.text = this.brand
                it.tvCode.text = this.code.toString()

            }
        }
    }


    companion object{
        private const val CANDY_KEY = "CANDY_KEY"

        fun newInstace(candy: Candy) = AdditionalFragment().apply {
            val bundle = Bundle()
            bundle.putSerializable(CANDY_KEY,candy)
            this.arguments = bundle
        }

    }

}