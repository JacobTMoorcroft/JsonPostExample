package org.jacob.mapper;

import org.jacob.model.ConsolidatedProduct;
import org.jacob.model.ProductDescriptions;
import org.jacob.model.ProductItineries;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ConsolidatedProductMapperTest {

    @Autowired
    private ConsolidatedProductMapper consolidatedProductMapper;

    @Test
    void testMap_Success() {

        // Given
        ProductDescriptions productDescriptions = new ProductDescriptions(1, "Test Product", "This is a test product");
        ProductItineries productItineries = new ProductItineries(1, 5, "New York");

        // When
        ConsolidatedProduct result = consolidatedProductMapper.map(productDescriptions, productItineries);

        // Then
        assertEquals(1, result.getId());
        assertEquals("Test Product", result.getName());
        assertEquals("This is a test product", result.getDescription());
        assertEquals(5, result.getAmount());
        assertEquals("New York", result.getLocation());
    }
}
