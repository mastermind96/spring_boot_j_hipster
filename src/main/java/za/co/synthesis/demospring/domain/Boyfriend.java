package za.co.synthesis.demospring.domain;

import org.hibernate.validator.constraints.Email;

import javax.persistence.*;

@Entity
@Table(name = "user", uniqueConstraints = {
        @UniqueConstraint(columnNames = "email")
})
public class Boyfriend {

    @Id
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Email
    @Column(name = "email")
    private String email;

    @OneToOne
    private Girlfriend girlfriend;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Girlfriend getGirlfriend() {
        return girlfriend;
    }

    public void setGirlfriend(Girlfriend girlfriend) {
        this.girlfriend = girlfriend;
    }
}
