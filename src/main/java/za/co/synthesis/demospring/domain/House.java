package za.co.synthesis.demospring.domain;

import javax.persistence.*;

@Entity
public class House {
    //Couple can only buy one house
    @Id
    private Long house_id;

    @Column(name = "house_girlfriend_id")
    private Long house_girlfriend_id;

    @Column(name = "house_boyfirnd_id")
    private Long house_boyfriend_id;

    @Column(name = "house_address")
    private String house_address;

    public void setHouse_girlfriend_id(Long house_girlfriend_id) {
        this.house_girlfriend_id = house_girlfriend_id;
    }

    public void setHouse_boyfriend_id(Long house_boyfriend_id) {
        this.house_boyfriend_id = house_boyfriend_id;
    }

    public void setHouse_address(String house_address) {
        this.house_address = house_address;
    }

    public void setHouse_rooms(String house_rooms) {
        this.house_rooms = house_rooms;
    }

    public void setGirlfriend(Girlfriend girlfriend) {
        this.girlfriend = girlfriend;
    }

    public void setBoyfriend(Boyfriend boyfriend) {
        this.boyfriend = boyfriend;
    }

    @Column(name = "house_rooms")

    private String house_rooms;

    @ManyToOne
    private Girlfriend girlfriend;

    @ManyToOne
    private Boyfriend boyfriend;

    public Long getHouse_id() {
        return house_id;
    }

    public void setHouse_id(Long house_id) {
        this.house_id = house_id;
    }

    public Long getHouse_boyfriend_id() {
        return house_boyfriend_id;
    }

    public Long getGirlfriend_id() {
        return house_girlfriend_id;
    }

    public String getHouse_address() {
        return house_address;
    }

    public String getHouse_rooms() {
        return house_rooms;
    }
}
