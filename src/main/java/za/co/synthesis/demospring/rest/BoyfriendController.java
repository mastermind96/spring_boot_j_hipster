package za.co.synthesis.demospring.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.synthesis.demospring.domain.Boyfriend;
import za.co.synthesis.demospring.dto.BoyfriendDTO;
import za.co.synthesis.demospring.repository.BoyfriendRepository;

import java.util.List;

@RestController
@RequestMapping("/users")
public class BoyfriendController {

    //searches for objects that require collaboration and autowires them without defining the relationship in an XML config file
    @Autowired
    @Qualifier("userDTOOne")
    private BoyfriendDTO randomUserOne;

    @Autowired
    @Qualifier("userDTOTwo")
    private BoyfriendDTO randomUser;

    @Autowired
    private BoyfriendRepository boyfriendRepository;

    @GetMapping("/all")
    public List<Boyfriend> getAllUsers() {
        System.out.println(randomUser);
        return (List<Boyfriend>) boyfriendRepository.findAll();
    }

    @GetMapping("/add")
    public @ResponseBody String addUser(BoyfriendDTO boyfriendDTO) {
        Boyfriend boyfriend = new Boyfriend();
        boyfriend.setName(boyfriendDTO.getName());
        boyfriend.setSurname(boyfriendDTO.getSurname());
        boyfriend.setEmail(boyfriendDTO.getEmail());
        boyfriendRepository.save(boyfriend);
        return "Boyfriend Added";
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteUser(@PathVariable(name = "id") Long id) {
        if (boyfriendRepository.exists(id)) {
            Boyfriend boyfriend = boyfriendRepository.findOne(id);
            boyfriendRepository.delete(id);
            return new ResponseEntity("Boyfriend [" + boyfriend.getName() + "] " + boyfriend.getSurname() + " deleted.", HttpStatus.OK);
        } else {
            return new ResponseEntity("No user with id " + id, HttpStatus.BAD_REQUEST);
        }
    }
}
