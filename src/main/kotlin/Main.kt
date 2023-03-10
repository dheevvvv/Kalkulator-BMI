fun main() {
    do {
        println("Masukkan berat badan (kg):")
        val berat = readLine()?.toDouble()
        println("Masukkan tinggi badan:")
        val tinggi = readLine()?.toDouble()

        val bmi = BMI(berat?:0.0,tinggi?:0.0)
        bmi.kategoriHasil()
        print("Apakah Anda ingin melanjutkan? (y/n): ")
        var lanjut: Boolean = true
        try {
            val input = readLine()!!.toLowerCase()
            when (input) {
                "y" -> lanjut = true
                "n" -> lanjut = false
                else -> throw IllegalArgumentException("Input tidak valid")
            }
        } catch (e: IllegalArgumentException) {
            println(e.message)
            lanjut = true
        }
    } while (lanjut)





}