package com.neu.pojo;

/**
 * 控制层返回结果对象
 * @author Admin
 *
 */
public class ResultJson {
	
	//返回结果码（成功：200，失败：500）
	private int code;
	//返回结果信息
	private String msg;
	//返回结果对象
	private Object data;
	
	

	public ResultJson(Object data) {
		super();
		this.code=200;
		this.msg = "数据访问成功";
		this.data = data;
	}
	
	

	public ResultJson(int code,String msg) {
		super();
		this.code=code;
		this.msg = msg;
	}



	public ResultJson(int code, String msg, Object data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	

}
