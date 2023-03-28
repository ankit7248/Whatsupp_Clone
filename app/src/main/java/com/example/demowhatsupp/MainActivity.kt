package com.example.WhatsApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.demowhatsupp.R
class MainActivity: AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Whats>
    lateinit var titleImage :Array<Int>
    lateinit var Name: Array<String>
    lateinit var Day: Array<String>
    lateinit var Message: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment1)

        titleImage = arrayOf(
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
            R.drawable.h,
            R.drawable.i,
            R.drawable.j,
            R.drawable.k,
            R.drawable.l
        )

        Name = arrayOf(
            "Ankit",
            "Gangster",
            "Aman",
            "Abhoy",
            "Rohan",
            "Amulya",
            "Mohan",
            "Anshul" ,
            "Salim",
            "Abhishek",
            "Rastogi",
            "Manish"
        )
        Day = arrayOf(
            "01:13 pm",
            "Yesterday",
            "06:00 PM",
            "Yesterday",
            "Yesterday",
            "Yesterday",
            "Yesterday",
            "Yesterday",
            "11:12 AM",
            "Yesterday",
            "5:30 PM",
            "4:34 PM"
        )
        Message = arrayOf(
            "ThankYou",
            "Only admins can message this group..",
            "HOLA",
            "+91 7238742332: https://shiksha.com",
            "Data Structure.pdf",
            "Tilak bhai kidhar chalegya",
            "java syllabus.docx",
            "Mega Blood Camp",
            "Data Structure.pdf",
            "Hello brother",
            "CIAO",
            "kya kar rhe ho"
        )

        newRecyclerView = findViewById(R.id.RecyclerView1)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)



        newArrayList = arrayListOf<Whats>()
        getUserdata()

    }



    private fun getUserdata() {
        for (i in titleImage.indices)
        {
            val whats = Whats(titleImage[i],Name[i],Message[i],Day[i])
            newArrayList.add(whats)
        }

        newRecyclerView.adapter = MyAdapter(newArrayList)
    }

}
