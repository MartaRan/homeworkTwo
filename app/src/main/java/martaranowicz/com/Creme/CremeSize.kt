package martaranowicz.com.Creme

import Creme

open class CremeSize(override val cremeSizeEnums: CremeSizeEnums): Creme() {
    override fun apply() {
        super.apply()
        print(cremeSizeEnums)
    }
}