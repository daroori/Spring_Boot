package com.example.Learningspring.data;

import jakarta.persistence.*;

@Entity
@Table(name="ROOM")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ROOM_ID")
    private long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "ROOM_NUMBER")
    private char roomNumber;
    @Column(name = "BED_INFO")
    private char bedInfo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(char roomNumber) {
        this.roomNumber = roomNumber;
    }

    public char getBedInfo() {
        return bedInfo;
    }

    public void setBedInfo(char bedInfo) {
        this.bedInfo = bedInfo;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", roomNumber=" + roomNumber +
                ", bedInfo=" + bedInfo +
                '}';
    }
}
