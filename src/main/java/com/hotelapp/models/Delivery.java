package com.hotelapp.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Delivery {

    @Id
    @GeneratedValue(generator = "del_id", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "del_id",sequenceName = "delivery_id")
    private Integer deliveryId;
    private String partnerName;
    private double charges;
    @ManyToMany(mappedBy = "delivery")
    @JsonIgnore
    private Set<Hotel> hotelList=new HashSet<>();

//    @JsonBackReference
//    public Set<Hotel> getHotelList() {
//        return hotelList;
//    }

    public Delivery(String partnerName, double charges) {
        this.partnerName = partnerName;
        this.charges = charges;
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "partnerName='" + partnerName + '\'' +
                ", charges=" + charges +
                '}';
    }
}
