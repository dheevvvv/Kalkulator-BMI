class BMI(beratBadan:Double, tinggiBadan:Double):Person(beratBadan, tinggiBadan) {
    override fun calculateBMI(): Double {
        val bmi = beratBadan / ((tinggiBadan/100*tinggiBadan/100))
        return bmi
    }

    fun kategoriHasil(){
        return when(calculateBMI()){
            in 0.0..17.0 -> println("Hasil : Kurus (Kekurangan berat badan tingkat berat)")
            in 17.0..18.5 -> println("Hasil : Kurus (Kekurangan berat badan tingkat rendah)")
            in 18.5..25.0 -> println("Hasil : Normal (Normal)")
            in 25.0..27.0 -> println("Hasil : Gemuk (Kelebihan berat badan tingkat ringan)")
            else -> println("Hasil : Gemuk (kelebihan berat badan tingkat berat)")
        }
    }
}