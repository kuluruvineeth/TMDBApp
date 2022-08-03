package com.kuluruvineeth.tmdbapp.presentation.tvshows

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.kuluruvineeth.tmdbapp.R
import com.kuluruvineeth.tmdbapp.databinding.ActivityTvShowBinding
import com.kuluruvineeth.tmdbapp.presentation.di.Injector
import javax.inject.Inject

class TvShowActivity : AppCompatActivity() {
    @Inject
    lateinit var factory: TvShowViewModelFactory
    private lateinit var tvShowViewModel: TvShowViewModel
    private lateinit var adapter: TvShowAdapter
    private lateinit var binding: ActivityTvShowBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_tv_show)
        (application as Injector).createTvShowSubComponent()
            .inject(this)

        tvShowViewModel = ViewModelProvider(this,factory)[TvShowViewModel::class.java]
        initRecyclerView()
    }
    private fun initRecyclerView(){
        binding.tvshowRecyclerView.layoutManager = LinearLayoutManager(this)
        adapter = TvShowAdapter()
        binding.tvshowRecyclerView.adapter = adapter
        displayPopularTvShows()
    }

    private fun displayPopularTvShows(){
        binding.tvshowProgressBar.visibility = View.VISIBLE
        val responseLiveData = tvShowViewModel.getTvShows()
        responseLiveData.observe(this, Observer {
            if(it!=null){
                adapter.setList(it)
                adapter.notifyDataSetChanged()
                binding.tvshowProgressBar.visibility = View.GONE
            }else{
                binding.tvshowProgressBar.visibility = View.GONE
                Toast.makeText(applicationContext,"No data available", Toast.LENGTH_LONG).show()
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflator : MenuInflater = menuInflater
        inflator.inflate(R.menu.update,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.action_update -> {
                updateTvShows()
                true
            }
            else -> {
                return super.onOptionsItemSelected(item)
            }
        }
    }

    private fun updateTvShows(){
        binding.tvshowProgressBar.visibility = View.VISIBLE
        val response = tvShowViewModel.updateTvShows()
        response.observe(this, Observer {
            if(it!=null){
                Log.i("MYTAG",it.toString())
                adapter.setList(it)
                adapter.notifyDataSetChanged()
                binding.tvshowProgressBar.visibility = View.GONE
            }else{
                binding.tvshowProgressBar.visibility = View.GONE
            }
        })
    }
}