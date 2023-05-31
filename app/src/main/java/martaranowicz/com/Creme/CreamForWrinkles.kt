import martaranowicz.com.Creme.CremeSize
import martaranowicz.com.Creme.CremeSizeEnums

class CreamForWrinkles(override val cremeSizeEnums: CremeSizeEnums) : CremeSize(cremeSizeEnums){
    override fun apply() {
        println("Skóra wymagająca dodatkowej pielęgnacji")
        println(cremeSizeEnums)
    }

    override fun printDescription() {
        println("Zalecenia: Użyj kremu nawilżającego oraz peptydy  z rana, retinol na noc oraz witaminę C jako serum na noc. Ważne! Nie stosuj retinolu razem z witaminą C, gdyż mogą powstać przebarwienia")
    }
}