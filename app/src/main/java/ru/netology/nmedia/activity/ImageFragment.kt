package ru.netology.nmedia.activity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.netology.nmedia.databinding.FragmentImageBinding
import ru.netology.nmedia.util.StringArg
import ru.netology.nmedia.view.loadAttachment

class ImageFragment: Fragment() {
    companion object {
        var Bundle.attachUrl: String? by StringArg
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentImageBinding.inflate(inflater, container, false)

        arguments?.attachUrl.let {
            binding.fullscreenImage.loadAttachment("http://10.0.2.2:9999/media/$it")
        }

        return binding.root
    }
}
