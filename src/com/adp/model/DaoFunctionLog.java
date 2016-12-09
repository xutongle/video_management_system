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
@Table(name = "DaoFunctionLog",
			indexes = {
					@Index(
							name = "IDX_daoFunctionLogID",
							columnList = "daoFunctionLogID"
					),
					@Index(
							name = "IDX_userID",
							columnList = "userID"
					),
					@Index(
						name = "IDX_dateTime",
						columnList = "dateTime"
					)
			}
		)
public class DaoFunctionLog {

	@Id//声明此列为主�?
    @GeneratedValue(strategy = GenerationType.AUTO)//根据不同数据库自动�?�择合�?�的id生成方案，这里使用mysql,为�?�增�?
	private Integer daoFunctionLogID; 
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="userID")
	private User user;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="daoFunctionID")
	private DaoFunction daoFunction;
	
	private String dateTime;
	private String oldValeu;
	private String newValue;

	public String getOldValeu() {
		return oldValeu;
	}

	public void setOldValeu(String oldValeu) {
		this.oldValeu = oldValeu;
	}

	public String getNewValue() {
		return newValue;
	}

	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}

	public Integer getDaoFunctionLogID() {
		return daoFunctionLogID;
	}

	public void setDaoFunctionLogID(Integer daoFunctionLogID) {
		this.daoFunctionLogID = daoFunctionLogID;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public DaoFunction getDaoFunction() {
		return daoFunction;
	}

	public void setDaoFunction(DaoFunction daoFunction) {
		this.daoFunction = daoFunction;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	
}
