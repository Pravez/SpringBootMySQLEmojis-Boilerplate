package com.emojis.demo

import org.springframework.data.domain.AbstractAggregateRoot
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "post")
class Post(
        val title: String,

        @Column(columnDefinition = "TEXT")
        val content: String
): AbstractAggregateRoot<Post>() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0
}