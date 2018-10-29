package com.truekenyan.whatsappstories.fragments

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.truekenyan.whatsappstories.R
import com.truekenyan.whatsappstories.activities.MainActivity
import com.truekenyan.whatsappstories.adapters.StoryAdapter
import com.truekenyan.whatsappstories.models.Story
import com.truekenyan.whatsappstories.models.Type

class FragmentPhotos: Fragment() {

    private val photos = mutableListOf<Story>()
    private lateinit var photosRecycler: RecyclerView
    private lateinit var emptyTextView: TextView

    private lateinit var adapter: StoryAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView: View = inflater.inflate(R.layout.fragment_photos, container, false)

        photosRecycler = rootView.findViewById(R.id.photos_list)
        emptyTextView = rootView.findViewById(R.id.empty_text_view)
        adapter = StoryAdapter(photos, context as Context)

        photos.clear()

        for (item in MainActivity.getStories()) {
            if (item.type == Type.Photo) {
                photos.add(item)
            }
        }
        adapter.notifyDataSetChanged()

        photosRecycler.apply {
            adapter = adapter
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
        }

        Toast.makeText(context, "${adapter.itemCount} items in adapter: onCreateView", Toast.LENGTH_SHORT).show()

        return rootView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

//        photos.clear()
//
//        for (item in MainActivity.getStories()) {
//            if (item.type == Type.Photo) {
//                photos.add(item)
//            }
//        }

//        photosRecycler.apply {
//            adapter = adapter
//            layoutManager = LinearLayoutManager(context)
//            setHasFixedSize(true)
//        }

//        adapter.notifyDataSetChanged()

        Toast.makeText(context, "${adapter.itemCount} items in adapter", Toast.LENGTH_SHORT).show()
    }
}