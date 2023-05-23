package com.company.delivery.models.entities;

import com.company.delivery.models.enums.City;
import com.company.delivery.models.enums.Status;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.format.annotation.DateTimeFormat;

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
    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    Status status;
    @NotNull
    @Column(name = "sender_name")
    String senderName;
    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "sender_city")
    City senderCity;
    @NotNull
    @Column(name = "sender_address")
    String senderAddress;
    @NotNull
    @Column(name = "recipient_name")
    String recipientName;
    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "recipient_city")
    City recipientCity;
    @NotNull
    @Column(name = "recipient_address")
    String recipientAddress;
    @NotNull
    @Column(name = "package_weight")
    double packageWeight;
    @NotNull
    @Column(name = "sending_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date sendingDate;

    @PrePersist
    protected void onCreate() {
        status = Status.ACTIVE;
    }

}
