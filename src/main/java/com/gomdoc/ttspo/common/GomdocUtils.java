package com.gomdoc.ttspo.common;

import com.gomdoc.ttspo.common.constants.ResultCode;
import com.gomdoc.ttspo.model.Result;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.Set;

/**
 * description    :
 * packageName    : com.gomdoc.ttspo.utils
 * fileName       : GomdocUtils
 * author         : cho
 * date           : 2025. 3. 15.
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 3. 15.        cho       최초 생성
 */
@Service
public class GomdocUtils {

    @Autowired
    Validator validator;

    public boolean isNullOrEmpty(Object obj) {
        return ObjectUtils.isEmpty(obj);
    }

    public Result isValid(Object source, Result result) {
        Set<ConstraintViolation<Object>> violations = validator.validate(source);
        for (ConstraintViolation<Object> violation : violations) {
            result.setResultFail(ResultCode.getResultCd(ResultCode.Prefix.PREFIX_R.key+violation.getMessage()));
        }
        return result;
    }
}
