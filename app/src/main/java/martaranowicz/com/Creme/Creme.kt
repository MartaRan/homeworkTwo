abstract class Creme {
    abstract fun apply()
    open fun printDescription() {
        println("To jest krem")
    }
}
//Zastosowany polimorfizm podtypow do klas CreamYoung, MatureSkin i CreamForWrinkles należą do klasy ogólnej Cream
//Dodatkowo zastosowano polimorfizm dynamiczny który odnosi się do metody apply() i println
//Program dodatkowo wykorzystuje hierachię dziedziczenia klas

