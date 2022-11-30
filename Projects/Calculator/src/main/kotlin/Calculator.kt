import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.input.KeyEvent
import javafx.scene.layout.VBox
import tornadofx.*

class Calculator: View() {
    override val root: VBox by fxml()

    @FXML lateinit var display: Label

    init {
        title = "Kotlin Calculator"

        root.lookupAll(".button").forEach { b ->
            b.setOnMouseClicked {
                operator((b as Button).text)
            }
        }

        root.addEventFilter(KeyEvent.KEY_TYPED) {
            operator(it.character.uppercase().replace("\r", "="))
        }
    }

    var state: Operator = Operator.add(0)

    fun onAction(fn: Operator) {
        state = fn
        display.text = ""
    }

    val displayValue: Long
        get() = when(display.text) {
            "" -> 0
            else -> display.text.toLong()
        }

    private fun operator(x: String) {
        if (Regex("[0-9]").matches(x)) {
            display.text += x
        } else {
            when(x) {
                "+" -> onAction(Operator.add(displayValue))
                "-" -> onAction(Operator.sub(displayValue))
                "/" -> onAction(Operator.div(displayValue))
                "X" -> onAction(Operator.mul(displayValue))
                "%" -> { onAction(Operator.add(displayValue / 100))
                    operator("=")
                }
                "C" -> onAction(Operator.add(0))
                "+/-" -> {
                    onAction(Operator.add(-1 * displayValue))
                    operator("=")
                }
                "=" -> display.text = state.calculate(displayValue).toString()
            }
        }
    }
}
