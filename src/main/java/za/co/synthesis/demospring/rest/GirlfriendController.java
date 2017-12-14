package za.co.synthesis.demospring.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.synthesis.demospring.domain.Boyfriend;
import za.co.synthesis.demospring.domain.Girlfriend;
import za.co.synthesis.demospring.dto.GirlfriendDTO;
import za.co.synthesis.demospring.repository.GirlfriendRepository;
import za.co.synthesis.demospring.repository.BoyfriendRepository;

import java.util.List;

@RestController
@RequestMapping("/girlfriend")
public class GirlfriendController {

    @Autowired
    private BoyfriendRepository boyfriendRepository;

    @Autowired
    private GirlfriendRepository girlfriendRepository;

    @GetMapping("/all")
    public List<Girlfriend> getAllUsers() {
        return girlfriendRepository.findAll();
    }

    @PostMapping("/add/{id}")
    public ResponseEntity addUser(@PathVariable(name = "id") Long id, GirlfriendDTO girlfriendDTO) {
        if (girlfriendRepository.exists(id)) {
            return new ResponseEntity("A user with this id already exists", HttpStatus.BAD_REQUEST);
        }
        Girlfriend user = new Girlfriend();
        user.setId(id);
        user.setName(girlfriendDTO.getName());
        user.setSurname(girlfriendDTO.getSurname());
        girlfriendRepository.save(user);
        return new ResponseEntity(user, HttpStatus.OK);
    }

    @PatchMapping("/link")
    public ResponseEntity linkUser(Long girlFriendId, Long userId) {
        Boyfriend boyfriend = boyfriendRepository.findOne(userId);
        Girlfriend girlfriend = girlfriendRepository.findOne(girlFriendId);
        boyfriend.setGirlfriend(girlfriend);
        boyfriendRepository.save(boyfriend);
        return new ResponseEntity(girlfriendRepository.findOne(girlFriendId), HttpStatus.I_AM_A_TEAPOT);
    }

}
