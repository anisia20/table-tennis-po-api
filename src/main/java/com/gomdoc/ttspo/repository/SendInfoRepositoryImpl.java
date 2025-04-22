package com.gomdoc.ttspo.repository;

import com.gomdoc.ttspo.model.dto.SendInfoResponseDTO;
import com.gomdoc.ttspo.model.entity.QSendInfo;
import com.gomdoc.ttspo.model.entity.QUser;
import com.querydsl.core.types.Projections;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * description    :
 * packageName    : com.gomdoc.ttspo.repository
 * fileName       : SendInfoRepositoryImpl
 * author         : cho
 * date           : 2025. 4. 22.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 4. 22.        cho       최초 생성
 */
@Repository
@RequiredArgsConstructor
public class SendInfoRepositoryImpl implements SendInfoRepositoryCustom {
    private final JPAQueryFactory queryFactory;
    private final QSendInfo si = QSendInfo.sendInfo;
    private final QUser u      = QUser.user;

    @Override
    public List<SendInfoResponseDTO> searchByCriteria(String baseId, Integer minCount) {
        return queryFactory
                .select(Projections.constructor(
                        SendInfoResponseDTO.class,
                        si.sendInfoSeq,
                        si.baseId,
                        si.sendCount,
                        si.limitCount,
                        u.email.as("userEmail")
                ))
                .from(si)
                .leftJoin(si.user, u)
//                .fetchJoin()
                .where(
                        baseIdEq(baseId),
                        minSendCount(minCount)
                )
                .orderBy(si.createdDate.desc())
                .fetch();
    }

    private BooleanExpression baseIdEq(String baseId) {
        return baseId != null ? si.baseId.eq(baseId) : null;
    }

    private BooleanExpression minSendCount(Integer minCount) {
        return minCount != null ? si.sendCount.goe(minCount) : null;
    }
}
