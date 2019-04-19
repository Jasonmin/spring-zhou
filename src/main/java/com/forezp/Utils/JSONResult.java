package com.forezp.Utils;

import org.json.JSONObject;

public class JSONResult {

    public  static String fillResultString(Integer status, String message,Object result) {

        JSONObject jsonObj = new JSONObject(){
            {
                put("status",status);
                put("message",message);
                put("result",result);
            }
        };

        return jsonObj.toString();
    }
}
