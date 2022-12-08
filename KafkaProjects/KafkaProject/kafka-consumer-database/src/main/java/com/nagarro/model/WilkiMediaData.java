package com.nagarro.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Wiki_RecentChange")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WilkiMediaData {

    @Id
    @GeneratedValue
    private long id;

    @Lob
    private String wikiEventData;


}
