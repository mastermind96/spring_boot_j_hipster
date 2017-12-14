package za.co.synthesis.demospring.dto;

public class HouseDTO {
    String house_address;
    int house_rooms;
    Long boyfriend_id;
    Long girlfriend_id;
    public Long getBoyfriend_id() {
        return boyfriend_id;
    }

    public void setBoyfriend_id(Long boyfriend_id) {
        this.boyfriend_id = boyfriend_id;
    }

    public Long getGirlfriend_id() {
        return girlfriend_id;
    }

    public void setGirlfriend_id(Long girlfriend_id) {
        this.girlfriend_id = girlfriend_id;
    }

    public void setHouse_address(String house_address) {
        this.house_address = house_address;
    }

    public void setHouse_rooms(int house_rooms) {
        this.house_rooms = house_rooms;
    }

    public String getHouse_address() {

        return house_address;
    }

    public int getHouse_rooms() {

        return house_rooms;
    }
}
