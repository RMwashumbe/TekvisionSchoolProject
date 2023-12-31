package com.example.tekvision2.Activity

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
//import com.example.tekvision2.Adapters.PopularListAdapter
//import com.example.tekvision2.Domain.PopularDomain
import com.example.tekvision2.R

class MainActivity : AppCompatActivity() {
    private lateinit var adapterPopular: RecyclerView.Adapter<*>
    private lateinit var recyclerViewPopular: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        initRecyclerview()
//        bottomNavigation()
    }

    private fun bottomNavigation() {
        val homeBtn: LinearLayout = findViewById(R.id.homeBtn)
        val cartBtn: LinearLayout = findViewById(R.id.cartBtn)

        homeBtn.setOnClickListener {
            startActivity(Intent(this@MainActivity, MainActivity::class.java))
        }

//        cartBtn.setOnClickListener {
//            startActivity(Intent(this@MainActivity, CartActivity::class.java))
//        }
//    }

//    private fun initRecyclerview() {
//        val items = ArrayList<PopularDomain>()
//        items.add(
//            PopularDomain(
//                "ASUS Vivobook OLED",
//                "Discover the new ASUS Vivobook with OLED screen.\n" +
//                        "This cutting edge laptop redefines perfomance and display. With its sleek design \n" +
//                        "and advanced technology, the ASUS Vivobook is your ultimate companion for \n" +
//                        "productivity, creativity and entertainment. Experience seamless multitasking, \n" +
//                        "stunning vivuals and enhanced security with touch ID. Take your computing experience \n" +
//                        "to the next level with the ASUS Vivobook OLED.",
//                "pic1",
//                15,
//                3.5,
//                30000.0
//            )
//        )
//        items.add(
//            PopularDomain(
//                "Play Station 5 -Digital",
//                "The PS5 is the next generational Play station guru \n" +
//                        "with its release date set for late2020. The standard mode is similar to the \n" +
//                        "digital model but varies a little in terms of having an Ultra HD 4K Blu- ray drive \n" +
//                        "which lacks on the former. It comes with a great\n" +
//                        "graphical power amount, an upgraded CPU, and a super quick solid-state drive(SSD).\n" +
//                        "The PS5 uses the new Dual sense controller and is compatible with accessories such as \n" +
//                        "HD Camera with '' dual 1080p lenses'', media remote, a charging station for the controllers, \n" +
//                        "and a 3D wireless headset. The features included in it are an 825GB SSD and 16GB RAM, \n" +
//                        "36 compute units at 2.23GHz, eight-core AMD Zen 2-CPU clocked at 3.5GHz, and an \n" +
//                        "AMD RDNA 2 GPU with 10.28 teraflops. It also comes with upgraded specs entailing advanced \n" +
//                        "3D audio, powerful loading speeds, and 8K graphical capabilities.",
//                "pic2",
//                10,
//                4.5,
//                150000.0,
//            )
//        )
//        items.add(
//            PopularDomain(
//                "iPhone 14",
//                "iPhone 14 Pro Max is powered by the new Apple A16 Bionic processor comes " +
//                        "with a 6.7 inch Super Retina XDR OLED capacitive touchscreen. It comes with a 6GB RAM and internal storage 256GB.\n" +
//                        "\n",
//                "pic3",
//                13,
//                4.2,
//                120000.0
//            )
//        )

        recyclerViewPopular = findViewById(R.id.view1)
        recyclerViewPopular.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        //adapterPopular = PopularListAdapter(items)
        recyclerViewPopular.adapter = adapterPopular
    }
}
