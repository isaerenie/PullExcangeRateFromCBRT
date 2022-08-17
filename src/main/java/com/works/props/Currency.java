
package com.works.props;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Currency {

    public Currency(String kod, String currencyName, String forexBuying, String forexSelling) {
        this.kod = kod;
        this.currencyName = currencyName;
        this.forexBuying = forexBuying;
        this.forexSelling = forexSelling;
    }

    private String crossOrder;
    private String kod;
    private String currencyCode;
    private String unit;
    private String isim;
    private String currencyName;
    private String forexBuying;
    private String forexSelling;
    private String banknoteBuying;
    private String banknoteSelling;
    private String crossRateUSD;
    private String crossRateOther;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getCrossOrder() {
        return crossOrder;
    }

    public void setCrossOrder(String crossOrder) {
        this.crossOrder = crossOrder;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getForexBuying() {
        return forexBuying;
    }

    public void setForexBuying(String forexBuying) {
        this.forexBuying = forexBuying;
    }

    public String getForexSelling() {
        return forexSelling;
    }

    public void setForexSelling(String forexSelling) {
        this.forexSelling = forexSelling;
    }

    public String getBanknoteBuying() {
        return banknoteBuying;
    }

    public void setBanknoteBuying(String banknoteBuying) {
        this.banknoteBuying = banknoteBuying;
    }

    public String getBanknoteSelling() {
        return banknoteSelling;
    }

    public void setBanknoteSelling(String banknoteSelling) {
        this.banknoteSelling = banknoteSelling;
    }

    public String getCrossRateUSD() {
        return crossRateUSD;
    }

    public void setCrossRateUSD(String crossRateUSD) {
        this.crossRateUSD = crossRateUSD;
    }

    public String getCrossRateOther() {
        return crossRateOther;
    }

    public void setCrossRateOther(String crossRateOther) {
        this.crossRateOther = crossRateOther;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
