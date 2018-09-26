package org.clm.VO;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.ws.soap.Addressing;

/**
 * @author Ccc
 * @date 2018/9/25 0025 下午 9:44
 * http请求返回的最外层对象
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultVO<T> {

    /**错误码*/
    private Integer code;

    /**提示信息*/
    private String msg;

    /**list信息*/
    private T data;

    public static ResultVO success(){
        ResultVO data = new ResultVO();
        data.setCode(100);
        data.setMsg("提交成功");
        return data;
    }

    public ResultVO add(T object){
        this.setData(object);
        return this;
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
