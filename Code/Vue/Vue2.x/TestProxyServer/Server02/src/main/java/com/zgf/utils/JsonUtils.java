package com.zgf.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonUtils {
    public static String getJson(Object obj) {
        return getJson(obj, "");
    }

    public static String getJson(Object obj, String sdf) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        mapper.setDateFormat(new SimpleDateFormat(sdf));
        try {
            return mapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static <T> List<T> parseJsonToList(String jsonStr, Class<T> clazz) {
        ObjectMapper mapper = new ObjectMapper();
        List<T> objList = null;
        try {
            JavaType t = mapper.getTypeFactory().constructParametricType(
                    List.class, clazz);
            objList = mapper.readValue(jsonStr, t);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objList;
    }

    public static <K,V> Map<K,V> parseJsonToMap(String jsonString, Class<K> K, Class<V> V) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType map = mapper.getTypeFactory().constructParametricType(HashMap.class, K, V);
        return mapper.readValue(jsonString, map);
    }
}
