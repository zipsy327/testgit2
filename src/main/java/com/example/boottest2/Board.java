package com.example.boottest2;
import java.sql.Timestamp;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;
@Entity
@Table(name = "myboard2")
@Data
public class Board {
    @Id  /*각엔터티를구별할수있도록식별아이디를갖도록설계*/
    @GeneratedValue(strategy = GenerationType.AUTO) /*특정 db에맞게자동으로생성하는방식*/
    @Column(name = "bno")
    private Long bno;
    @Column(name = "title")
    private String title;
    @Column(name = "writer")
    private String writer;
    @Column(name = "content")
    private String content;

    @CreationTimestamp /*엔터티가생성되는시점의시간등록*/
    private Timestamp regdate;
}
