import geb.Page

class YahooResultPage extends Page {

    static at = { title.contains("の検索結果") }

    static content = {
        results(wait: true) { $("div.w") }
    }
}
