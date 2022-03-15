package guru.springframework.spring5webapp.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "publish")
public class Publish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String city;
    private  String state;
    @OneToMany
    @JoinColumn(name = "publish_id")
    private Set<Book> books =  new HashSet<>();

    public Publish() {
    }

    public Publish(Long id, String name, String city, String state, Set<Book> books) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.state = state;
        this.books = books;
    }

    public Publish(String name, String city, String state, Set<Book> books) {
        this.name = name;
        this.city = city;
        this.state = state;
        this.books = books;
    }

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Publish{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", books=" + books +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publish publish = (Publish) o;
        return Objects.equals(id, publish.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
