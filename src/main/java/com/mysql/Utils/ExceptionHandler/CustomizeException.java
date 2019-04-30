package com.mysql.Utils.ExceptionHandler;

public class CustomizeException extends RuntimeException {

    private int code;

    public CustomizeException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());

        this.code = resultEnum.getCode();
    }

    public CustomizeException(ResultEnum resultEnum, String msg) {
        super(msg);

        this.code = resultEnum.getCode();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
