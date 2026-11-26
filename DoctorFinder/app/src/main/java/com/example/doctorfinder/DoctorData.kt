package com.example.doctorfinder

// SAMPLE DATA: replace each record with a real, verified doctor
// (check the hospital's website / NMC register) before submitting.
object DoctorData {
    val doctors = listOf(
        Doctor(1, "Dr. Sample One", "Cardiology", "Sample Heart Hospital",
            "Sector 38, Gurugram, Haryana 122001", "MBBS, MD (Medicine), DM (Cardiology)"),
        Doctor(2, "Dr. Sample Two", "Dermatology", "Sample Skin Clinic",
            "Sector 14, Gurugram, Haryana 122001", "MBBS, MD (Dermatology)"),
        Doctor(3, "Dr. Sample Three", "Pediatrics", "Sample Children's Hospital",
            "DLF Phase 3, Gurugram, Haryana 122002", "MBBS, MD (Pediatrics)"),
        Doctor(4, "Dr. Sample Four", "Orthopedics", "Sample Bone & Joint Centre",
            "Sector 44, Gurugram, Haryana 122003", "MBBS, MS (Orthopaedics)"),
        Doctor(5, "Dr. Sample Five", "Dentistry", "Sample Dental Care",
            "Sector 56, Gurugram, Haryana 122011", "BDS, MDS (Orthodontics)"),
        Doctor(6, "Dr. Sample Six", "Neurology", "Sample Neuro Institute",
            "Golf Course Road, Gurugram, Haryana 122002", "MBBS, MD (Medicine), DM (Neurology)")
    )
}
