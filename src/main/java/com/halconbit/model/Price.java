package com.halconbit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reference;

    private Long brand_id;
    private Long product_id;
    private String start_date;
    private Long priority;
    private String price;
    private String curr;
    private String end_date;
    private Long price_list;
}
