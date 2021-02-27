package com.example.adoptapup.ui.fragments

import android.graphics.Bitmap
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.unit.dp
import com.example.adoptapup.models.PuppyModel
import com.example.adoptapup.ui.composables.DogCard
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.fragment.findNavController
import com.example.adoptapup.R
import com.example.adoptapup.util.Dogs


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ListFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
        return ComposeView(requireContext()).apply {
            val navController = Navigation.findNavController(requireActivity(), R.id.main_nav_host_fragment);
            setContent{

                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = {
                                Text(text = "Adopt A Dog")
                            },
                            backgroundColor = Color.LightGray,
                            contentColor = Color.White,
                            elevation = 12.dp
                        )
                    }, content = {
                        val doglist = Dogs.provideDogsList()

                        LazyColumn {
                            itemsIndexed(
                                items = doglist
                            ){ index, dog ->

                                DogCard(Dog = dog,
                                    onClick = {
                                        var bundle = Bundle()
                                        bundle.putParcelable("Dog", dog)
                                        navController.navigate(R.id.DetailFragment, bundle)

                                    }
                                )

                            }

                        }
                    })
            }
        }
    }




    @Composable
    fun ExtendedFloatingActionButtonDemo() {
        ExtendedFloatingActionButton(
            icon = { Icon(Icons.Filled.Add,"") },
            text = { Text("Add Puppy") },
            onClick = { /*do something*/ },
            elevation = FloatingActionButtonDefaults.elevation(8.dp)
        )
    }



}