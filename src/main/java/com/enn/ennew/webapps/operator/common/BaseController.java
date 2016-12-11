package com.enn.ennew.webapps.operator.common;

import com.enn.ennew.core.json.JsonMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * controller 公共基类
 * Created by zx.dev on 2016/1/6.
 */
public class BaseController {

    protected Logger log=LoggerFactory.getLogger(getClass());
    
    private JsonMapper jsonMapper = new JsonMapper(JsonInclude.Include.USE_DEFAULTS);
    private JsonMapper nonEmptyJsonMapper = JsonMapper.nonEmptyMapper();
    private JsonMapper nomDefaultJsonMapper = JsonMapper.nonDefaultMapper();


    //
    public JsonMapper getJsonMapper(){
        return jsonMapper;
    }

    public JsonMapper getNonEmptyJsonMapper() {
        return nonEmptyJsonMapper;
    }

    public JsonMapper getNomDefaultJsonMapper() {
        return nomDefaultJsonMapper;
    }
}
