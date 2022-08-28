package dev.diegofernando.apiclient.dto.response;

import dev.diegofernando.apiclient.annotations.SchemaTestsScan;

@SchemaTestsScan(key = "messageV1")
public class Message {
    private String fee;

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }
}
