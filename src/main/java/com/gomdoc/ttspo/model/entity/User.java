package com.gomdoc.ttspo.model.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "tts_user")
public class User {
    // 유저아이디
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_seq")
    private Long userSeq;

    // 이메일
    @Column(name="email", nullable = false, unique = true)
    private String email;

    // 기업정보
    @Column(name="company_name", nullable = false)
    private String companyName;

    // 등록일시
    @CreationTimestamp
    @Column(name="created_date", nullable = false, updatable = false)
    private LocalDateTime createdDate;

    // 갱신일시
    @UpdateTimestamp
    @Column(name="updated_date", nullable = false)
    private LocalDateTime updatedDate;
}
