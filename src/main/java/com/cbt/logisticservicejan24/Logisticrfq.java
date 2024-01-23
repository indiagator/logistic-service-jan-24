package com.cbt.logisticservicejan24;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "logisticrfqs")
public class Logisticrfq {
    @Id
    @Column(name = "rfqid", nullable = false, length = 10)
    private String rfqid;

    @Column(name = "originport", nullable = false, length = 10)
    private String originport;

    @Column(name = "destinationport", nullable = false, length = 10)
    private String destinationport;

    @Column(name = "orderid", nullable = false, length = 10)
    private String orderid;

    @Column(name = "status", length = 10)
    private String status;

}