package za.co.synthesis.demospring.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.synthesis.demospring.domain.Boyfriend;
import za.co.synthesis.demospring.domain.House;
import za.co.synthesis.demospring.dto.GirlfriendDTO;
import za.co.synthesis.demospring.repository.HouseRepository;

import java.util.List;

@RestController
@RequestMapping("/house")

public class HouseController {
    @Autowired
    private HouseRepository houseRepository;

    @GetMapping("/all")
    public List<House>getAllHouses(){return houseRepository.findAll();}

    @PostMapping("/add/house/{id}")
    public ResponseEntity addHouse(@PathVariable(name = "id")Long house_id, HouseRepository house){
        if(houseRepository.exists(house_id)){
            return new ResponseEntity("A house with this id already exists.", HttpStatus.BAD_REQUEST);
        }
        House house1 = new House();
        house1.setHouse_id(house_id);
        house.save(house1);
        return new ResponseEntity(house1,HttpStatus.OK);
    }
}
