package com.works.restcontrollers;

import com.works.props.Currency;
import com.works.services.XmlReadServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
public class XmlReadRestController {
    final XmlReadServices xmlReadServices;

    public XmlReadRestController(XmlReadServices xmlReadServices) {
        this.xmlReadServices = xmlReadServices;
    }

    @GetMapping("/allCurrency")
    public ResponseEntity allCurrency() {
        Map<String, Object> hm = new LinkedHashMap<>();
        List<Currency> ls = xmlReadServices.allCurrency();
        hm.put("status", true);
        hm.put("result", ls);
        return new ResponseEntity(hm, HttpStatus.OK);
    }

    @GetMapping("/singleCurrency")
    public ResponseEntity singleCurrency(@RequestParam String kod) {
        Map<String, Object> hm = new LinkedHashMap<>();
        List<Currency> ls = xmlReadServices.allCurrency();
        hm.put("status", false);
        for (Currency item : ls) {
            if (item.getKod().equals(kod)) {
                hm.put("result", item);
                hm.put("status", true);
            }

        }

        return new ResponseEntity(hm, HttpStatus.OK);
    }
}
