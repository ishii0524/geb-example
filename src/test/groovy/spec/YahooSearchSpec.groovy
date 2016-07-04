import geb.spock.GebReportingSpec

class YahooSearchSpec extends GebReportingSpec {

    def "ワード検索が出来ること"() {
        when: "トップページヘ移動"
          to YahooTopPage
        and: "検索ワードを入力"
          searchTextInput.value("test")
        and: "検索ボタンを押下"
          searchButton.click()
        then: "検索一覧画面が表示され、結果が0件でないこと"
          at YahooResultPage
          assert results.size() > 0
    }
}
