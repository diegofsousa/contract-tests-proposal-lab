package dev.diegofernando.apiclient.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.diegofernando.apiclient.annotations.SchemaTestsScan;

@SchemaTestsScan(key = "cardV1")
public class CardDTO {
    private long id;

    private String name;

    private double fee;

    @JsonProperty(value = "details")
    private ContentDTO content;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public ContentDTO getContent() {
        return content;
    }

    public void setContent(ContentDTO content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "CardDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fee=" + fee +
                ", content=" + content +
                '}';
    }
}
