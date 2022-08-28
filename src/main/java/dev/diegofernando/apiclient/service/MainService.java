package dev.diegofernando.apiclient.service;

import dev.diegofernando.apiclient.dto.response.CardDTO;
import dev.diegofernando.apiclient.dto.response.ContentDTO;
import org.springframework.stereotype.Service;

@Service
public class MainService {

    public CardDTO getCard(){
        CardDTO cardDTO = new CardDTO();
        ContentDTO contentDTO = new ContentDTO();
        contentDTO.setActive(true);
        contentDTO.setDays(5);
        contentDTO.setType("FIRST CARD");
        cardDTO.setId(1);
        cardDTO.setFee(5.7);
        cardDTO.setName("CARD ONE");
        cardDTO.setContent(contentDTO);
        return cardDTO;
    }

}
