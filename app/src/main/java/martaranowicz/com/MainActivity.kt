package martaranowicz.com

import CreamForWrinkles
import CreamYoung
import MatureSkin
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.toLowerCase
import androidx.compose.ui.tooling.preview.Preview
import martaranowicz.com.Creme.CremeSize
import martaranowicz.com.Creme.CremeSizeEnums
import martaranowicz.com.ui.theme.TheBasicCremeTheme
import java.util.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TheBasicCremeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                    screen()
                }
            }
        }
    }
}

@Composable
fun screen() {
    Column() {
        main()
    }
}


fun main() {
    val reader = Scanner(System.`in`)//służy do obsługi inputu ktory wpisze uzytkownik
//stan magazynu
    var youngCreamQuantity = 50
    var matureCreamQuantity = 100
    var wrinklesCreamQuantity = 70

    while (true) {  //Pętla będzie się wykonywać tak długo do póki będzie spełniony warunek chyba że uzytkownik wpisze q i pętla zostanie przerwana
        println("---------------------------------------------")
        println("Podaj swój wiek (lub wpisz 'q' aby zakończyć): ")
        val input = reader.next() //odczytuje wprowadzony przez użytkonika ciąg znaków, który zostaje przypisany do zmiennej input
//Sprawdza czy wprowadzono tekst po zmniejszeniu liter równy jest q i jeśi się takstanie to program przejdzie lini 54 i zakonczy program - wielkośc liter nie ma znaczenia

        if (input.lowercase() == "q") {
            break
        }
        println("Wpisz wielkość kremu jaki chcesz zakupić:")
        println("Small --> S")
        println("Medium --> M")
        println("Large --> L")
        val inputSize = reader.next().lowercase()
        val size = when (inputSize) {
            "s" -> CremeSizeEnums.SMALL
            "m" -> CremeSizeEnums.MEDIUM
            "l" -> CremeSizeEnums.LARGE
            else -> {
                println("Nie podałeś poprawnego rozmiaru, wybraliśmy za Ciebie rozmiar Small")
                CremeSizeEnums.SMALL
            }
        }


        val age = input.toIntOrNull()// konwertuje wprowadzony test na liczbę całkowitą, jeśli się to powiedzie,
                                    //to liczab zostaje przypisana to zmiennej age, a jesli nie to zostanie potraktowana jako null
        if (age != null) {

            val cream = when {
                age in 0..25 -> {
                    youngCreamQuantity--
                    CreamYoung(size)}
                age in 25..35 -> {
                    matureCreamQuantity--
                    MatureSkin(size)}
                else -> {
                    wrinklesCreamQuantity--
                    CreamForWrinkles(size)}
            }

            println("Nakładaj krem:")
            cream.apply()
            cream.printDescription()
            println("Stan magazynu:")
            println("Krem skóra młoda: $youngCreamQuantity")
            println("Krem skóra dojrzała: $matureCreamQuantity")
            println("Krem skóra wymagająca: $wrinklesCreamQuantity")
        }
        else {
            println("Musisz podać wiek jako liczbę całkowitą")
            continue
        }
    }
    }


@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TheBasicCremeTheme {
        Greeting("Android")
    }
}