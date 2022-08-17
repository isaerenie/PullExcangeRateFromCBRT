
package com.works.props;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class CurrencyData {

    private TarihDate tarihDate;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public TarihDate getTarihDate() {
        return tarihDate;
    }

    public void setTarihDate(TarihDate tarihDate) {
        this.tarihDate = tarihDate;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
