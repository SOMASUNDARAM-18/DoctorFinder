package com.example.doctorfinder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DoctorAdapter(private val onClick: (Doctor) -> Unit) :
    RecyclerView.Adapter<DoctorAdapter.VH>() {

    private var items: List<Doctor> = DoctorData.doctors

    fun filter(query: String) {
        val q = query.trim().lowercase()
        items = if (q.isEmpty()) DoctorData.doctors
        else DoctorData.doctors.filter {
            it.name.lowercase().contains(q) || it.expertise.lowercase().contains(q) ||
                it.workplace.lowercase().contains(q)
        }
        notifyDataSetChanged()
    }

    class VH(v: View) : RecyclerView.ViewHolder(v) {
        val avatar: TextView = v.findViewById(R.id.avatar)
        val name: TextView = v.findViewById(R.id.name)
        val expertise: TextView = v.findViewById(R.id.expertise)
        val workplace: TextView = v.findViewById(R.id.workplace)
        val button: View = v.findViewById(R.id.viewProfile)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        VH(LayoutInflater.from(parent.context).inflate(R.layout.item_doctor, parent, false))

    override fun onBindViewHolder(h: VH, position: Int) {
        val d = items[position]
        h.avatar.text = d.initials
        h.name.text = d.name
        h.expertise.text = d.expertise
        h.workplace.text = d.workplace
        h.button.setOnClickListener { onClick(d) }
        h.itemView.setOnClickListener { onClick(d) }
    }

    override fun getItemCount() = items.size
}
