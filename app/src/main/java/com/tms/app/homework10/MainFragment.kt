package com.tms.app.homework10

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.tms.app.databinding.FragmentCandyListBinding

class MainFragment: Fragment() {

    private var binding: FragmentCandyListBinding? = null
    private val viewModel by viewModels<MainViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCandyListBinding.inflate(inflater,container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val onClick: (candy : Candy) -> Unit = {
            (activity as? GeneralActivity)?.openAdditionalFragment(it)
        }
        val adapter = MainAdapter(mutableListOf(),onClick)
        binding?.rvCandy?.layoutManager = LinearLayoutManager(binding?.root?.context, LinearLayoutManager.VERTICAL, false)
        binding?.rvCandy?.adapter = adapter
        viewModel.candyLiveData.observe(viewLifecycleOwner, {adapter.update(it)})

    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}