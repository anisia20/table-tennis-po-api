package com.gomdoc.ttspo.common.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.HashMap;

/**
 * description    :
 * packageName    : com.gomdoc.ttspo.code
 * fileName       : ResultCode
 * author         : cho
 * date           : 2025. 3. 15.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 3. 15.        cho       최초 생성
 */
@Getter
@AllArgsConstructor
@ToString
public enum ResultCode {

    /** 내부 코드 체계 */
    R_000("000", "COMMON", "성공", "성공"),

    R_201("201", "USER", "사용자 등록 실패", "사용자 등록 실패"),
    R_202("202", "USER", "이메일 오류", "이메일 오류"),
    R_203("203", "USER", "이름 오류", "이름 오류"),
    R_204("204", "USER", "아이디 오류", "아이디 오류"),
    R_205("205", "USER", "사용자 없음", "사용자 없음"),

    R_301("301", "COMPANY", "기업 이를 오류", "기업 이를 오류"),
    R_302("302", "COMPANY", "기업 SEQ 오류", "기업 SEQ 오류"),

    R_401("401", "SENDINFO", "사용자 SEQ 오류", "사용자 SEQ 오류"),
    R_402("402", "SENDINFO", "베이스아이디 오류", "베이스아이디 오류"),
    R_403("403", "SENDINFO", "발송건수 오류", "발송건수 오류"),
    R_404("404", "SENDINFO", "발송제한 오류", "발송제한 오류"),

    R_405("405", "SENDINFO", "발송정보 SEQ 오류", "발송정보 SEQ 오류"),

    R_501("501", "AIRTABLE", "키정보 오류", "키정보 오류"),
    R_502("502", "AIRTABLE", "상태 오류", "상태 오류"),
    R_503("503", "AIRTABLE", "데이터 오류", "데이터 오류"),
    R_504("504", "AIRTABLE", "Request 오류", "Request 오류"),

    R_601("601", "AIRTABLE", "Base ID 오류", "Base ID 오류"),
    R_602("602", "AIRTABLE", "Table ID 오류", "Table ID 오류"),
    R_603("603", "AIRTABLE", "Record ID 오류", "Record ID 오류"),
    R_604("604", "AIRTABLE", "Keyinfo 오류", "Keyinfo 오류"),
    R_605("605", "AIRTABLE", "사용여부 오류", "사용여부 오류"),
    R_606("606", "AIRTABLE", "맵핑 SEQ 오류", "맵핑 SEQ 오류"),

    R_701("701", "AIRTABLE FIELD", "Base ID 오류", "Base ID 오류"),
    R_702("702", "AIRTABLE FIELD", "Table ID 오류", "Table ID 오류"),
    R_703("703", "AIRTABLE FIELD", "필드 이름 오류", "필드 이름 오류"),
    R_704("704", "AIRTABLE FIELD", "키여부 오류", "키여부 오류"),
    R_705("705", "AIRTABLE FIELD", "사용여부 오류", "사용여부 오류"),
    R_706("706", "AIRTABLE FIELD", "필드 SEQ 오류", "필드 SEQ 오류"),

    R_280("280", "SYS", "데이터베이스 오류", "데이터베이스 오류"),

    R_ETC("999", "ETC", "기타", "기타오류"),
            ;

    public String r;
    public String tp;
    public String rd;
    public String cd;

    public static HashMap<String, ResultCode> getResultCode() {
        HashMap<String, ResultCode> codeMap = new HashMap<>();
        for (ResultCode c : values()) {
            codeMap.put(c.r, c);
        }
        return codeMap;
    }

    public static ResultCode getResultCd(String result) {
        return getResultCd(result, ResultCode.R_ETC);
    }

    public static ResultCode getResultCd(String result, ResultCode rcsresultCd) {
        ResultCode resultCd = null;
        try {
            resultCd = ResultCode.valueOf(result);
        } catch (Exception e) {
            resultCd = (rcsresultCd == null) ? ResultCode.R_ETC : rcsresultCd;
        }
        return resultCd;
    }

    @Getter
    @AllArgsConstructor
    @ToString
    public enum Prefix {
        PREFIX_R("R_"),
        ;
        public String key;
    }
}
