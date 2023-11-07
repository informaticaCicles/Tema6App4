package com.example.tema6app4.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.tema6app4.R


class BlueFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        Log.v(BlueFragment::class.java.simpleName, "onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.v(BlueFragment::class.java.simpleName, "onCreateView")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blue, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.v(BlueFragment::class.java.simpleName, "onActivityCreated")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onAttach(context: Context) {
        Log.v(BlueFragment::class.java.simpleName, "onAttach")
        super.onAttach(context)
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        Log.v(BlueFragment::class.java.simpleName, "onViewStateRestored")
        super.onViewStateRestored(savedInstanceState)
    }

    override fun onStart() {
        Log.v(BlueFragment::class.java.simpleName, "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.v(BlueFragment::class.java.simpleName, "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.v(BlueFragment::class.java.simpleName, "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.v(BlueFragment::class.java.simpleName, "onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.v(BlueFragment::class.java.simpleName, "onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.v(BlueFragment::class.java.simpleName, "onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.v(BlueFragment::class.java.simpleName, "onDetach")
        super.onDetach()
    }

}