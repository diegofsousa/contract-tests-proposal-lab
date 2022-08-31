package dev.diegofernando.apiclient.dto.response;

import dev.diegofernando.apiclient.annotations.SchemaTestsScan;

@SchemaTestsScan(key = "cardV3")
public class CardV3DTO {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
