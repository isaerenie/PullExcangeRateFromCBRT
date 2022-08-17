package com.works.services;

import com.works.props.Currency;
import com.works.props.TarihDate;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class XmlReadServices {
    String url = "https://www.tcmb.gov.tr/kurlar/today.xml";
    public List<Currency> allCurrency() {
        List<Currency> ls = new ArrayList<>();
        try {
            String stData = Jsoup.connect(url).timeout(15000).ignoreContentType(true).get().toString();
            Document document = Jsoup.parse(stData, Parser.xmlParser());
            Elements elements = document.getElementsByTag("Currency");
            for (Element item : elements) {
                String Kod = item.attr("Kod");
                String CurrencyName = item.getElementsByTag("CurrencyName").text();
                String ForexBuying = item.getElementsByTag("ForexBuying").text();
                String ForexSelling = item.getElementsByTag("ForexSelling").text();
                Currency currency = new Currency(Kod,CurrencyName,ForexBuying,ForexSelling);
                ls.add(currency);
            }
        } catch (Exception e) {
            System.out.println("Xml error: " + e);
        }
        return ls;
    }
}
