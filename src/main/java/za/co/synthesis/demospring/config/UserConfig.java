package za.co.synthesis.demospring.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.co.synthesis.demospring.dto.BoyfriendDTO;

@Configuration
public class UserConfig {

    @Bean
    @Qualifier("userDTOOne")
    public BoyfriendDTO getRandomUserDTO() {
        BoyfriendDTO boyfriendDTO = new BoyfriendDTO();
        boyfriendDTO.setName("test");
        return boyfriendDTO;
    }

    @Bean
    @Qualifier("userDTOTwo")
    public BoyfriendDTO getRandomUserDTOTwo() {
        BoyfriendDTO boyfriendDTO = new BoyfriendDTO();
        boyfriendDTO.setName("testTwo");
        return boyfriendDTO;
    }
    @Bean
    @Qualifier("userDTOThree")
    public BoyfriendDTO getRandomUserDTOThree() {
        BoyfriendDTO boyfriendDTO = new BoyfriendDTO();
        boyfriendDTO.setName("testthree");
        return boyfriendDTO;
    }
}
