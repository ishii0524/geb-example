import geb.Page

class YahooTopPage extends Page {
    static url = "http://www.yahoo.co.jp/"
    static at = { title == "Yahoo! JAPAN" }

    static content = {
        searchTextInput { $("input", id: "srchtxt") }
        searchButton { $("input", id: "srchbtn") }
    }
}
