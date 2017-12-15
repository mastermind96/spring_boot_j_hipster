package za.co.synthesis.demospring.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import za.co.synthesis.demospring.domain.Boyfriend;
import za.co.synthesis.demospring.domain.Girlfriend;
import za.co.synthesis.demospring.dto.GirlfriendDTO;
import za.co.synthesis.demospring.repository.BoyfriendRepository;
import za.co.synthesis.demospring.repository.GirlfriendRepository;

import java.util.List;

@Controller
@RequestMapping(path = "/girlfriend")
public class GirlfriendController {

    @Autowired
    private BoyfriendRepository boyfriendRepository;

    @Autowired
    private GirlfriendRepository girlfriendRepository;

    @GetMapping("/all")
    public List<Girlfriend> getAllUsers() {
        return (List<Girlfriend>) girlfriendRepository.findAll();
    }

    @GetMapping(path = "/add")
    public @ResponseBody String addUser(GirlfriendDTO girlfriendDTO) {
        Girlfriend user = new Girlfriend();
        user.setId(girlfriendDTO.getId());
        user.setName(girlfriendDTO.getName());
        user.setSurname(girlfriendDTO.getSurname());
        girlfriendRepository.save(user);
        return "Done";
    }

    @GetMapping(path = "/date")
    public @ResponseBody String date(Long girlFriendId, Long userId) {
        Boyfriend boyfriend = boyfriendRepository.findOne(userId);
        Girlfriend girlfriend = girlfriendRepository.findOne(girlFriendId);
        boyfriend.setGirlfriend(girlfriend);
        boyfriendRepository.save(boyfriend);
        return "dating";
    }

}
