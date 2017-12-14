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
    @Column(name = "room_numbers")
    private int roomNumbers;

    @ManyToOne
    private Girlfriend girlfriend;

    @ManyToOne
    private Boyfriend boyfriend;

    public Long getHouse_girlfriend_id() {
        return house_girlfriend_id;
    }

    public int getRoomNumbers() {
        return roomNumbers;
    }

    public void setRoomNumbers(int roomNumbers) {
        this.roomNumbers = roomNumbers;
    }

    public Girlfriend getGirlfriend() {
        return girlfriend;
    }

    public Boyfriend getBoyfriend() {
        return boyfriend;
    }

    public void setHouse_girlfriend_id(Long house_girlfriend_id) {
        this.house_girlfriend_id = house_girlfriend_id;
    }

    public void setHouse_boyfriend_id(Long house_boyfriend_id) {
        this.house_boyfriend_id = house_boyfriend_id;
    }

    public void setHouse_address(String house_address) {
        this.house_address = house_address;
    }

    public void setGirlfriend(Girlfriend girlfriend) {
        this.girlfriend = girlfriend;
    }

    public void setBoyfriend(Boyfriend boyfriend) {
        this.boyfriend = boyfriend;
    }


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

}
