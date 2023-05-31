import martaranowicz.com.Creme.CremeSize
import martaranowicz.com.Creme.CremeSizeEnums

class MatureSkin(override val cremeSizeEnums: CremeSizeEnums) : CremeSize(cremeSizeEnums) {
    override fun apply() {
        println("Skóra dojrzała")
        println(cremeSizeEnums)
    }

    override fun printDescription() {
        println("Zalecenia: Użyj witaminy C(rano i wieczorem), niacynamidy(na noc) i retinol(na noc) w celu poprawy elastyczności skóry.Ostrzeżenia: Witaminę C i retinol używaj osobno")
    }
}