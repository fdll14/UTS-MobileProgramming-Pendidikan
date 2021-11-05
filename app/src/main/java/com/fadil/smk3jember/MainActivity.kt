package com.fadil.smk3jember

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.fadil.smk3jember.adapters.SekolahAdapter
import com.example.smk3jember.databinding.ActivityMainBinding
import com.fadil.smk3jember.models.Sekolah
import com.fadil.smk3jember.models.SekolahData

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var sekolahAdapter: SekolahAdapter
    private var listMenuSekolah : ArrayList<Sekolah> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        showSekolahRv()
        supportActionBar?.hide()
    }

    fun showSekolahRv(){
        listMenuSekolah.addAll(SekolahData.listMenu)
        sekolahAdapter = SekolahAdapter(listMenuSekolah, object : SekolahAdapter.onSekolahClick{
            override fun onItemCick(sekolah: Sekolah) {
                startActivity(Intent(this@MainActivity, DetailActivity::class.java).apply {
                    putExtra("nama", sekolah.name)
                    putExtra("gambar", sekolah.image)
                    putExtra("desc", sekolah.desc)
                })
            }
        })
        binding.RVSekolah.apply {
            val lm = GridLayoutManager(this@MainActivity, 2)
            layoutManager = lm
            adapter = sekolahAdapter
        }
    }
}