package com.emse.spring.faircorp.model;
import javax.persistence.*;

@Entity
public class Window {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable=false)
    private String name;


    @Column(nullable=false)
    @Enumerated(EnumType.STRING)
    private WindowStatus windowStatus;


    @ManyToOne(optional = false)
    private Room room;

    public Window() {
    }

    public Window(Long id,String name, Room room, WindowStatus status) {
        this.id = id;
        this.windowStatus = status;
        this.room = room;
        this.name = name;
    }

    public Long getId() {
        return this.id;
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

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public WindowStatus getWindowStatus() {
        return windowStatus;
    }

    public void setWindowStatus(WindowStatus windowStatus) {
        this.windowStatus = windowStatus;
    }
}
