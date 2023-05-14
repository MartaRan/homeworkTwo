package martaranowicz.com.Creme

abstract class Creme {
    abstract fun apply()
}

class CreamForWrinkles : Creme() {
    override fun apply() {
        println("Nakładaj krem na zmarszczki")
    }
}

class CreamYoung : Creme() {
    override fun apply() {
        println("Nakładaj krem dla młodej skóry")
    }
}

class MatureSkin : Creme() {
    override fun apply() {
        println("Nakładaj krem dla dojrzałej skóry")
    }
}

fun calculateAgeAndApplyCream(dateOfBirth: String) {
    // Obliczanie wieku na podstawie daty urodzenia
    // ...
    val age =  // obliczony wiek

    // Wybór kremu w zależności od wieku
    val cream = when {
        age <= 18 -> CreamYoung()
        age >= 30 -> MatureSkin()
        else -> CreamForWrinkles()
    }

    // Zastosowanie wybranego kremu
    cream.apply()
}

fun main() {
    val dateOfBirth = "1990-05-14"
    calculateAgeAndApplyCream(dateOfBirth)
}