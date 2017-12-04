package com.weibo.extend;


import java.io.IOException;
import java.text.ParseException;
import java.util.Objects;

import com.fasterxml.jackson.databind.ObjectMapper;


/**
 *  对象转JSON的类
 */

public class toJson {
    public String toJson (Object obj) throws ParseException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(obj);
        return json;
    }

    public String toForMatJson (Object obj) throws ParseException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
        return json;
    }
}
