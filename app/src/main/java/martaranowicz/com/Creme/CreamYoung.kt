import martaranowicz.com.Creme.CremeSize
import martaranowicz.com.Creme.CremeSizeEnums

class CreamYoung(override val cremeSizeEnums: CremeSizeEnums) : CremeSize(cremeSizeEnums){
    override fun apply() {
        println("Skóra młoda")
        println(cremeSizeEnums)
    }

    override fun printDescription() {
        println("Zalecenia: Użyj kremu z retinolem i peptydami w celu zniwelowania zaskórników i zamknięcia porów skóry. Retinol stosuj na noc.")
    }
}