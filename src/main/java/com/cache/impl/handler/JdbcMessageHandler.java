package com.cache.impl.handler;

import java.util.List;
import java.util.Map;
 
import org.springframework.stereotype.Component;
 
@Component
public class JdbcMessageHandler {
 
    public void handleJdbcMessage(List<Map> message) {
        for (Map<String, String> resultMap: message) {
            System.out.println("Row");
            for (String column: resultMap.keySet()) {
                System.out.println("column: " + column + " value: " + resultMap.get(column));
            }
        }
    }
}