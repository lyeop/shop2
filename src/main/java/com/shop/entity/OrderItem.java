package com.shop.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table
public class OrderItem extends BaseEntity {
    @Id
    @GeneratedValue
    @Column(name="order_item_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id") //외래키
    private Item item;

    @ManyToOne(fetch = FetchType.LAZY) //지연로딩
    @JoinColumn(name = "order_id")
    private Order order;

    private int orderPrice;
    private int count;
//    private LocalDateTime regTime;
//    private LocalDateTime updateTime;
}
