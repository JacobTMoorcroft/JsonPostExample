package org.jacob.service;

import org.jacob.model.ProductItineries;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductItineraryService {

    List<ProductItineries> productItineries;


    public ProductItineraryService() {
        productItineries = new ArrayList<>();
        productItineries.add(new ProductItineries(1234, 4, "new york"));
        productItineries.add(new ProductItineries(8473, 5, "croydon"));
        productItineries.add(new ProductItineries(7843, 12, "manchester"));

    }

    public List<ProductItineries> getProductItineries() {
        return productItineries;
    }
}
