package za.co.synthesis.demospring.domain;

import javax.persistence.*;

@Entity
public class Girlfriend {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @OneToOne
    private Boyfriend boyfriend;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Boyfriend getBoyfriend() {
        return boyfriend;
    }

    public void setBoyfriend(Boyfriend boyfriend) {
        this.boyfriend = boyfriend;
    }
}
