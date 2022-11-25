import kotlin.random.Random

fun main() {
    // Commonly create classes just for storing data
    // Primary constructor has at least one parameter
    // All primary constructor parameters need to be val or var
    // Can have a body but not required
    val articles = arrayListOf<Article>()
    articles.add(getArticle())
    articles.add(getArticle())

    val newArticles = arrayListOf<Article>()

    for (article in articles) {
        newArticles.add(article)
        val newArticle = article.copy(title = article.title + " for my blog")
        newArticles.add(newArticle)
    }

    newArticles.forEach { println(it) }
}

fun getArticle(): Article {
    val randomTitle = "Title" + Random.nextInt(100)
    val numberOfReaders = Random.nextInt(100)

    return Article(randomTitle, "Some content", numberOfReaders)
}

data class Article(
    val title: String,
    val content: String,
    val numberOfReaders: Int
)