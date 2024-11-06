package org.jacob.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ConsolidatedProduct {
    private Integer id;

    private String name;

    private String description;

    private Integer amount;

    private String location;
}
