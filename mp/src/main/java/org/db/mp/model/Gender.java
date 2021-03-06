/**
 * 
 */
package org.db.mp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Satyam Sharan <satyam.sharan@hotmail.com>
 *
 */
@Entity
@Table(name = "CommonMaster")
public class Gender {
	public Gender() {
		super();
	}
	public Gender(int commonCode) {
		this.commonCode=commonCode;
	}
	private int commonCode;
	private String value;
	private String type = "GENDER";

	@Id
	public int getCommonCode() {
		return commonCode;
	}

	public void setCommonCode(int commonCode) {
		this.commonCode = commonCode;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
