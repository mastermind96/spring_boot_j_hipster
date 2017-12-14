package za.co.synthesis.demospring.dto;

public class HouseDTO {
    String house_address;
    String house_rooms;
    public void setHouse_address(String house_address) {
        this.house_address = house_address;
    }

    public void setHouse_rooms(String house_rooms) {
        this.house_rooms = house_rooms;
    }

    public String getHouse_address() {

        return house_address;
    }

    public String getHouse_rooms() {

        return house_rooms;
    }
}
