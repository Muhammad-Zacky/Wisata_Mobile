package com.nashwa.newmapskotlin

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nashwa.newmapskotlin.adapter.adapterWisata
import com.nashwa.newmapskotlin.model.modelWisata

class listMap : AppCompatActivity() {





    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_map)




        val rvWisata: RecyclerView = findViewById(R.id.rvWisata)
        rvWisata.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        // Update wisataList with latitude and longitude values
        val wisataList = listOf(

            modelWisata(
                R.drawable.danau,
                "Danau Singkarak",
                "Solok",
                "Danau Singkarak is the second-largest lake on Sumatra Island, Indonesia. Spanning 21 kilometers, it offers breathtaking natural scenery with calm, clear waters and is popular for various water activities.",
                -0.6055,   // Latitude for Danau Singkarak
                100.7089   // Longitude for Danau Singkarak
            ),
            modelWisata(
                R.drawable.jam,
                "Jam Gadang Bukittinggi",
                "Bukittinggi",
                "Jam Gadang is an iconic landmark located in the heart of Bukittinggi city, West Sumatra, Indonesia. Known for its unique clock design, it serves as a major tourist attraction.",
                -0.305441, // Latitude for Jam Gadang
                100.3692   // Longitude for Jam Gadang
            ),


            modelWisata(
                R.drawable._000,
            "Ngarai Sianok",
            "Bukittinggi - Agam",
            "Ngarai Sianok adalah sebuah lembah yang menakjubkan yang terletak di sekitar Bukittinggi, Sumatera Barat. Dikenal dengan pemandangan alamnya yang spektakuler, Ngarai Sianok dikelilingi oleh tebing curam dan hutan tropis yang rimbun, menciptakan suasana yang tenang dan damai.",
                -0.3071794330747924,
                100.36518059136797  // Latitude for Danau Singkarak

        ),
            modelWisata(
                R.drawable._0000,
                "Istano Pagaruyung",
                "Batusangkar",
                "Istano Basa Pagaruyung adalah istana kebudayaan yang terletak di Batusangkar, Sumatera Barat. Istana ini merupakan simbol kerajaan Minangkabau dan dikenal dengan arsitektur tradisionalnya yang megah, yang mencerminkan ciri khas budaya Minangkabau.",
                -0-0.47115692936286124,
                100.62143708057593// Latitude for Danau Singkarak

            ),
            modelWisata(
                R.drawable._00,
                "Kebun Teh",
                "Alahan panjang",
                "Kebun Teh Alahan Panjang adalah salah satu destinasi wisata alam yang populer di Kabupaten Solok, Sumatera Barat. Berada pada ketinggian sekitar 1.400 meter di atas permukaan laut, kebun teh ini menyajikan pemandangan indah dari hamparan tanaman teh yang hijau dan rapi, berlatar belakang perbukitan dan pegunungan. Suasana di Alahan Panjang sangat sejuk dan segar, menjadikannya tempat ideal untuk melepas penat dan menikmati udara pegunungan yang bersih.",
                -1.0345897676124225,
                100.68416119407189,   // Latitude for Danau Singkarak
                // Longitude for Danau Singkarak
            ),
                    modelWisata(
                    R.drawable._00000,
            "Pantai Air Manis",
            "Padang",
            "Salah satu daya tarik utama Pantai Air Manis adalah legenda Malin Kundang, yang merupakan kisah tentang seorang anak durhaka yang dikutuk menjadi batu. Di pantai ini, pengunjung dapat menemukan patung Malin Kundang yang menjadi ikon tempat tersebut.",
                        -0.9911672508765919,
                        100.36071434434295

        ),
            modelWisata(
                R.drawable._000000,
                "Lembah Harau",
                "Kabupaten 50 kota",
                "Lembah Harau adalah destinasi wisata yang terletak di Kabupaten 50 Kota, Sumatera Barat. Dikenal karena keindahan alamnya, lembah ini dikelilingi oleh tebing-tebing curam yang menjulang tinggi dan hamparan sawah yang hijau, menciptakan pemandangan yang menakjubkan.",
                -0.09959206532498904,
                100.66618129860669

            ),


        )

        rvWisata.adapter = adapterWisata(this, wisataList)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
