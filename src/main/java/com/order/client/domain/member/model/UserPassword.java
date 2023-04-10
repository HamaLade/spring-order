package com.order.client.domain.member.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "USER_PASSWORD")
public class UserPassword {

    @Id
    @Column(name = "USER_PASSWORD_SEQ")
    private Long seq;

    @JoinColumn(name = "USER_SEQ")
    @OneToOne(fetch = FetchType.LAZY)
    private User user;

    @Column(name = "PASSWORD", length = 300)
    private String password;

    @CreatedDate
    @Column(name = "CREATE_DATE")
    private LocalDateTime createDate;

    @LastModifiedDate
    @Column(name = "UPDATE_DATE")
    private LocalDateTime updateDate;

}
