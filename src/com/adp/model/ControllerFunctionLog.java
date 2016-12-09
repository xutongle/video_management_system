package com.adp.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity//声明当前类为hibernate映射到数据库中的实体�?
@Table(name = "ControllerFunctionLog",
			indexes = {
					@Index(
							name = "IDX_controllerFunctionLogID",
							columnList = "controllerFunctionLogID"
					),
					@Index(
							name = "IDX_userID",
							columnList = "userID"
					),
					@Index(
						name = "IDX_dateTimeStart",
						columnList = "dateTimeStart"
					),
					@Index(
							name = "IDX_dateTimeEnd",
							columnList = "dateTimeEnd"
					)
			}
		)
public class ControllerFunctionLog {

	@Id//声明此列为主�?
    @GeneratedValue(strategy = GenerationType.AUTO)//根据不同数据库自动�?�择合�?�的id生成方案，这里使用mysql,为�?�增�?
	private Integer controllerFunctionLogID;
	private String dateTimeStart;
	private String dateTimeEnd;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="userID")
	private User user;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="controllerFunctionID")
	private ControllerFunction controllerFunction;

	public Integer getControllerFunctionLogID() {
		return controllerFunctionLogID;
	}

	public void setControllerFunctionLogID(Integer controllerFunctionLogID) {
		this.controllerFunctionLogID = controllerFunctionLogID;
	}

	public String getDateTimeStart() {
		return dateTimeStart;
	}

	public void setDateTimeStart(String dateTimeStart) {
		this.dateTimeStart = dateTimeStart;
	}

	public String getDateTimeEnd() {
		return dateTimeEnd;
	}

	public void setDateTimeEnd(String dateTimeEnd) {
		this.dateTimeEnd = dateTimeEnd;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public ControllerFunction getControllerFunction() {
		return controllerFunction;
	}

	public void setControllerFunction(ControllerFunction controllerFunction) {
		this.controllerFunction = controllerFunction;
	}
	
	
}
