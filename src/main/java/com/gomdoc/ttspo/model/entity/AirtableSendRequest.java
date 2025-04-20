package com.gomdoc.ttspo.model.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

/**
 * description    :
 * packageName    : com.gomdoc.ttspo.model.entity
 * fileName       : AirtableSendRequest
 * author         : cho
 * date           : 2025. 4. 20.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 4. 20.        cho       최초 생성
 */
@Entity
@Table(name = "airtable_send_request")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AirtableSendRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "request_seq")
    private Long requestSeq;

    @Column(name = "key_info", nullable = false)
    private String keyInfo;

    @Column(name = "status", nullable = false)
    private Integer status;

    @Lob
    @Column(name = "data_json", nullable = false, columnDefinition = "TEXT")
    private String dataJson;

    @CreationTimestamp
    @Column(name = "created_date", nullable = false, updatable = false)
    private LocalDateTime createdDate;

    @UpdateTimestamp
    @Column(name = "updated_date", nullable = false)
    private LocalDateTime updatedDate;
}
