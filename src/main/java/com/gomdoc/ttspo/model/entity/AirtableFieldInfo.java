package com.gomdoc.ttspo.model.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

/**
 * description    :
 * packageName    : com.gomdoc.ttspo.model.entity
 * fileName       : AirtableFieldInfo
 * author         : cho
 * date           : 2025. 4. 20.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 4. 20.        cho       최초 생성
 */
@Entity
@Table(name = "airtable_field_info")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AirtableFieldInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "field_info_seq")
    private Long fieldInfoSeq;

    @Column(name = "base_id", nullable = false)
    private String baseId;

    @Column(name = "table_id", nullable = false)
    private String tableId;

    @Column(name = "field_name", nullable = false)
    private String fieldName;

    @Column(name = "is_key", length = 1, nullable = false)
    private String isKey;

    @Column(name = "use_yn", length = 1, nullable = false)
    private String useYn;

    @CreationTimestamp
    @Column(name = "created_date", nullable = false, updatable = false)
    private LocalDateTime createdDate;

    @UpdateTimestamp
    @Column(name = "updated_date", nullable = false)
    private LocalDateTime updatedDate;
}
