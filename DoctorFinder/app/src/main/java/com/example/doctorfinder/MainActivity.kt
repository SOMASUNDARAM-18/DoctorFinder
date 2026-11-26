package com.example.doctorfinder

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doAfterTextChanged
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Doctor Finder"

        val adapter = DoctorAdapter { doctor ->
            startActivity(Intent(this, ProfileActivity::class.java)
                .putExtra(ProfileActivity.EXTRA_ID, doctor.id))
        }
        findViewById<RecyclerView>(R.id.recycler).apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            this.adapter = adapter
        }
        findViewById<EditText>(R.id.search).doAfterTextChanged { adapter.filter(it.toString()) }
    }
}
