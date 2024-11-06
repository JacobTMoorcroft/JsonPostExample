package org.jacob.mapper;

import org.jacob.model.ConsolidatedProduct;
import org.jacob.model.ProductDescriptions;
import org.jacob.model.ProductItineries;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Validated
@Component
public class ConsolidatedProductMapper {

    public ConsolidatedProduct map(ProductDescriptions productDescriptions, ProductItineries productItineries) {
        return ConsolidatedProduct.builder()
                .id(productDescriptions.getId())
                .name(productDescriptions.getName())
                .description(productDescriptions.getDescription())
                .amount(productItineries.getAmount())
                .location(productItineries.getLocation())
                .build();
    }
}
