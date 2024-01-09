package jyotti.apexing.apexing_android.base

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.ViewDataBinding

abstract class BaseActivityV2<VB : ViewDataBinding>(private val inflater: (LayoutInflater) -> VB) :
    AppCompatActivity() {

    lateinit var binding: VB

    protected abstract val viewModel: BaseViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflater(layoutInflater)
        setContentView(binding.root)

        initBinding()
    }

    protected abstract fun initBinding()

    protected fun bind(action: VB.() -> Unit) {
        binding.run(action)
    }
}