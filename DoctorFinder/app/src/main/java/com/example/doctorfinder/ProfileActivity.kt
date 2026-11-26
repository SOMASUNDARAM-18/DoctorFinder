package com.example.doctorfinder

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    companion object { const val EXTRA_ID = "doctor_id" }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        title = "Doctor Profile"

        val d = DoctorData.doctors.firstOrNull { it.id == intent.getIntExtra(EXTRA_ID, -1) }
        if (d == null) { finish(); return }

        findViewById<TextView>(R.id.avatar).text = d.initials
        findViewById<TextView>(R.id.name).text = d.name
        findViewById<TextView>(R.id.expertise).text = d.expertise
        findViewById<TextView>(R.id.workplace).text = d.workplace
        findViewById<TextView>(R.id.address).text = d.address
        findViewById<TextView>(R.id.qualification).text = d.qualification
    }

    override fun onSupportNavigateUp(): Boolean { finish(); return true }
}
