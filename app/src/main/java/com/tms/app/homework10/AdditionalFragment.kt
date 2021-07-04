package com.tms.app.homework10

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.tms.app.R
import com.tms.app.databinding.FragmentAdditionalCandyBinding

class AdditionalFragment : Fragment() {

    private var binding: FragmentAdditionalCandyBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAdditionalCandyBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val serializable = arguments?.getSerializable(CANDY_KEY) as? Candy
        with(serializable) {
            binding?.let {
                it.tvBrand.text = this?.brand
                it.tvCode.text = this?.code.toString()
                if (binding!!.tvBrand.text == GeneralActivity.SNICKERS) {
                    Glide.with(it.root).load(getString(R.string.snickers_image)).into(it.ivCandy)
                } else if (binding!!.tvBrand.text == GeneralActivity.MARS) {
                    Glide.with(it.root).load(getString(R.string.mars_image)).into(it.ivCandy)
                } else {
                    Glide.with(it.root).load(getString(R.string.twix_image)).into(it.ivCandy)
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }





    companion object {
        private const val CANDY_KEY = "CANDY_KEY"

        fun newInstace(candy: Candy) = AdditionalFragment().apply {
            val bundle = Bundle()
            bundle.putSerializable(CANDY_KEY, candy)
            this.arguments = bundle
        }

    }

}