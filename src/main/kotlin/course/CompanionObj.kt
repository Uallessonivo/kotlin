package course

fun main() {
    // Makes class code available without the need for an object
    val myBook = Book(Book.getEditor())
    println(myBook.editor.editorName)
}

class Book(val editor: Editor) {
    companion object {
        fun getEditor() = Editor("Uallesson")
    }
}

class Editor(val editorName: String) {
}
