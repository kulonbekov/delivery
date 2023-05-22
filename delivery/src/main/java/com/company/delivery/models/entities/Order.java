package com.company.delivery.models.entities;

import com.company.delivery.models.enums.City;
import com.company.delivery.models.enums.Status;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "tb_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    Status status;
    @Column(name = "name_of_the_sender")
    String nameOfTheSender;
    @Enumerated(EnumType.STRING)
    @Column(name = "sender_city")
    City senderCity;
    @Column(name = "sender_address")
    String senderAddress;
    @Column(name = "name_of_the_recipient")
    String nameOfTheRecipient;
    @Enumerated(EnumType.STRING)
    @Column(name = "recipient_city")
    City recipientCity;
    @Column(name = "recipient_address")
    String recipientAddress;
    @Column(name = "package_weight")
    double packageWeight;
    @Column(name = "sending_date")
    @JsonFormat(pattern = "dd.MM.yyyy")
    Date sendingDate;

    @PrePersist
    protected void onCreate() {
        status = Status.ACTIVE;
    }

}
