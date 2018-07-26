package club.ak.work.bean;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class MeasurementData implements Serializable{
	
	private static final long serialVersionUID = -4057403390552786993L;
	private Integer id;
	private Integer userId;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date onlineDate;
	private String testCreateSql;
	private String testCreateRollbackSql;
	private String testAlterSql;
	private String testAlterRollbackSql;
	private String testUpdateSql;
	private String testUpdateRollbackSql;
	private String testInsertSql;
	private String testInsertRollbackSql;
	private String testDeleteSql;
	private String testDeleteRollbackSql;
	private String pdCreateSql;
	private String pdCreateRollbackSql;
	private String pdAlterSql;
	private String pdAlterRollbackSql;
	private String pdUpdateSql;
	private String pdUpdateRollbackSql;
	private String pdInsertSql;
	private String pdInsertRollbackSql;
	private String pdDeleteSql;
	private String pdDeleteRollbackSql;
	private String createdUser;
	private Date createdTime;
	private String modifiedUser;
	private Date modifiedTime;
	private String ext1;
	private String ext2;
	
	
	
	public MeasurementData() {
		super();
	}



	public MeasurementData(Integer id, Integer userId, Date onlineDate, String testCreateSql,
			String testCreateRollbackSql, String testAlterSql, String testAlterRollbackSql, String testUpdateSql,
			String testUpdateRollbackSql, String testInsertSql, String testInsertRollbackSql, String testDeleteSql,
			String testDeleteRollbackSql, String pdCreateSql, String pdCreateRollbackSql, String pdAlterSql,
			String pdAlterRollbackSql, String pdUpdateSql, String pdUpdateRollbackSql, String pdInsertSql,
			String pdInsertRollbackSql, String pdDeleteSql, String pdDeleteRollbackSql, String createdUser,
			Date createdTime, String modifiedUser, Date modifiedTime, String ext1, String ext2) {
		super();
		this.id = id;
		this.userId = userId;
		this.onlineDate = onlineDate;
		this.testCreateSql = testCreateSql;
		this.testCreateRollbackSql = testCreateRollbackSql;
		this.testAlterSql = testAlterSql;
		this.testAlterRollbackSql = testAlterRollbackSql;
		this.testUpdateSql = testUpdateSql;
		this.testUpdateRollbackSql = testUpdateRollbackSql;
		this.testInsertSql = testInsertSql;
		this.testInsertRollbackSql = testInsertRollbackSql;
		this.testDeleteSql = testDeleteSql;
		this.testDeleteRollbackSql = testDeleteRollbackSql;
		this.pdCreateSql = pdCreateSql;
		this.pdCreateRollbackSql = pdCreateRollbackSql;
		this.pdAlterSql = pdAlterSql;
		this.pdAlterRollbackSql = pdAlterRollbackSql;
		this.pdUpdateSql = pdUpdateSql;
		this.pdUpdateRollbackSql = pdUpdateRollbackSql;
		this.pdInsertSql = pdInsertSql;
		this.pdInsertRollbackSql = pdInsertRollbackSql;
		this.pdDeleteSql = pdDeleteSql;
		this.pdDeleteRollbackSql = pdDeleteRollbackSql;
		this.createdUser = createdUser;
		this.createdTime = createdTime;
		this.modifiedUser = modifiedUser;
		this.modifiedTime = modifiedTime;
		this.ext1 = ext1;
		this.ext2 = ext2;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Integer getUserId() {
		return userId;
	}



	public void setUserId(Integer userId) {
		this.userId = userId;
	}



	public Date getOnlineDate() {
		return onlineDate;
	}



	public void setOnlineDate(Date onlineDate) {
		this.onlineDate = onlineDate;
	}



	public String getTestCreateSql() {
		return testCreateSql;
	}



	public void setTestCreateSql(String testCreateSql) {
		this.testCreateSql = testCreateSql;
	}



	public String getTestCreateRollbackSql() {
		return testCreateRollbackSql;
	}



	public void setTestCreateRollbackSql(String testCreateRollbackSql) {
		this.testCreateRollbackSql = testCreateRollbackSql;
	}



	public String getTestAlterSql() {
		return testAlterSql;
	}



	public void setTestAlterSql(String testAlterSql) {
		this.testAlterSql = testAlterSql;
	}



	public String getTestAlterRollbackSql() {
		return testAlterRollbackSql;
	}



	public void setTestAlterRollbackSql(String testAlterRollbackSql) {
		this.testAlterRollbackSql = testAlterRollbackSql;
	}



	public String getTestUpdateSql() {
		return testUpdateSql;
	}



	public void setTestUpdateSql(String testUpdateSql) {
		this.testUpdateSql = testUpdateSql;
	}



	public String getTestUpdateRollbackSql() {
		return testUpdateRollbackSql;
	}



	public void setTestUpdateRollbackSql(String testUpdateRollbackSql) {
		this.testUpdateRollbackSql = testUpdateRollbackSql;
	}



	public String getTestInsertSql() {
		return testInsertSql;
	}



	public void setTestInsertSql(String testInsertSql) {
		this.testInsertSql = testInsertSql;
	}



	public String getTestInsertRollbackSql() {
		return testInsertRollbackSql;
	}



	public void setTestInsertRollbackSql(String testInsertRollbackSql) {
		this.testInsertRollbackSql = testInsertRollbackSql;
	}



	public String getTestDeleteSql() {
		return testDeleteSql;
	}



	public void setTestDeleteSql(String testDeleteSql) {
		this.testDeleteSql = testDeleteSql;
	}



	public String getTestDeleteRollbackSql() {
		return testDeleteRollbackSql;
	}



	public void setTestDeleteRollbackSql(String testDeleteRollbackSql) {
		this.testDeleteRollbackSql = testDeleteRollbackSql;
	}



	public String getPdCreateSql() {
		return pdCreateSql;
	}



	public void setPdCreateSql(String pdCreateSql) {
		this.pdCreateSql = pdCreateSql;
	}



	public String getPdCreateRollbackSql() {
		return pdCreateRollbackSql;
	}



	public void setPdCreateRollbackSql(String pdCreateRollbackSql) {
		this.pdCreateRollbackSql = pdCreateRollbackSql;
	}



	public String getPdAlterSql() {
		return pdAlterSql;
	}



	public void setPdAlterSql(String pdAlterSql) {
		this.pdAlterSql = pdAlterSql;
	}



	public String getPdAlterRollbackSql() {
		return pdAlterRollbackSql;
	}



	public void setPdAlterRollbackSql(String pdAlterRollbackSql) {
		this.pdAlterRollbackSql = pdAlterRollbackSql;
	}



	public String getPdUpdateSql() {
		return pdUpdateSql;
	}



	public void setPdUpdateSql(String pdUpdateSql) {
		this.pdUpdateSql = pdUpdateSql;
	}



	public String getPdUpdateRollbackSql() {
		return pdUpdateRollbackSql;
	}



	public void setPdUpdateRollbackSql(String pdUpdateRollbackSql) {
		this.pdUpdateRollbackSql = pdUpdateRollbackSql;
	}



	public String getPdInsertSql() {
		return pdInsertSql;
	}



	public void setPdInsertSql(String pdInsertSql) {
		this.pdInsertSql = pdInsertSql;
	}



	public String getPdInsertRollbackSql() {
		return pdInsertRollbackSql;
	}



	public void setPdInsertRollbackSql(String pdInsertRollbackSql) {
		this.pdInsertRollbackSql = pdInsertRollbackSql;
	}



	public String getPdDeleteSql() {
		return pdDeleteSql;
	}



	public void setPdDeleteSql(String pdDeleteSql) {
		this.pdDeleteSql = pdDeleteSql;
	}



	public String getPdDeleteRollbackSql() {
		return pdDeleteRollbackSql;
	}



	public void setPdDeleteRollbackSql(String pdDeleteRollbackSql) {
		this.pdDeleteRollbackSql = pdDeleteRollbackSql;
	}



	public String getCreatedUser() {
		return createdUser;
	}



	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}



	public Date getCreatedTime() {
		return createdTime;
	}



	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}



	public String getModifiedUser() {
		return modifiedUser;
	}



	public void setModifiedUser(String modifiedUser) {
		this.modifiedUser = modifiedUser;
	}



	public Date getModifiedTime() {
		return modifiedTime;
	}



	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}



	public String getExt1() {
		return ext1;
	}



	public void setExt1(String ext1) {
		this.ext1 = ext1;
	}



	public String getExt2() {
		return ext2;
	}



	public void setExt2(String ext2) {
		this.ext2 = ext2;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdTime == null) ? 0 : createdTime.hashCode());
		result = prime * result + ((createdUser == null) ? 0 : createdUser.hashCode());
		result = prime * result + ((ext1 == null) ? 0 : ext1.hashCode());
		result = prime * result + ((ext2 == null) ? 0 : ext2.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((modifiedTime == null) ? 0 : modifiedTime.hashCode());
		result = prime * result + ((modifiedUser == null) ? 0 : modifiedUser.hashCode());
		result = prime * result + ((onlineDate == null) ? 0 : onlineDate.hashCode());
		result = prime * result + ((pdAlterRollbackSql == null) ? 0 : pdAlterRollbackSql.hashCode());
		result = prime * result + ((pdAlterSql == null) ? 0 : pdAlterSql.hashCode());
		result = prime * result + ((pdCreateRollbackSql == null) ? 0 : pdCreateRollbackSql.hashCode());
		result = prime * result + ((pdCreateSql == null) ? 0 : pdCreateSql.hashCode());
		result = prime * result + ((pdDeleteRollbackSql == null) ? 0 : pdDeleteRollbackSql.hashCode());
		result = prime * result + ((pdDeleteSql == null) ? 0 : pdDeleteSql.hashCode());
		result = prime * result + ((pdInsertRollbackSql == null) ? 0 : pdInsertRollbackSql.hashCode());
		result = prime * result + ((pdInsertSql == null) ? 0 : pdInsertSql.hashCode());
		result = prime * result + ((pdUpdateRollbackSql == null) ? 0 : pdUpdateRollbackSql.hashCode());
		result = prime * result + ((pdUpdateSql == null) ? 0 : pdUpdateSql.hashCode());
		result = prime * result + ((testAlterRollbackSql == null) ? 0 : testAlterRollbackSql.hashCode());
		result = prime * result + ((testAlterSql == null) ? 0 : testAlterSql.hashCode());
		result = prime * result + ((testCreateRollbackSql == null) ? 0 : testCreateRollbackSql.hashCode());
		result = prime * result + ((testCreateSql == null) ? 0 : testCreateSql.hashCode());
		result = prime * result + ((testDeleteRollbackSql == null) ? 0 : testDeleteRollbackSql.hashCode());
		result = prime * result + ((testDeleteSql == null) ? 0 : testDeleteSql.hashCode());
		result = prime * result + ((testInsertRollbackSql == null) ? 0 : testInsertRollbackSql.hashCode());
		result = prime * result + ((testInsertSql == null) ? 0 : testInsertSql.hashCode());
		result = prime * result + ((testUpdateRollbackSql == null) ? 0 : testUpdateRollbackSql.hashCode());
		result = prime * result + ((testUpdateSql == null) ? 0 : testUpdateSql.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MeasurementData other = (MeasurementData) obj;
		if (createdTime == null) {
			if (other.createdTime != null)
				return false;
		} else if (!createdTime.equals(other.createdTime))
			return false;
		if (createdUser == null) {
			if (other.createdUser != null)
				return false;
		} else if (!createdUser.equals(other.createdUser))
			return false;
		if (ext1 == null) {
			if (other.ext1 != null)
				return false;
		} else if (!ext1.equals(other.ext1))
			return false;
		if (ext2 == null) {
			if (other.ext2 != null)
				return false;
		} else if (!ext2.equals(other.ext2))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (modifiedTime == null) {
			if (other.modifiedTime != null)
				return false;
		} else if (!modifiedTime.equals(other.modifiedTime))
			return false;
		if (modifiedUser == null) {
			if (other.modifiedUser != null)
				return false;
		} else if (!modifiedUser.equals(other.modifiedUser))
			return false;
		if (onlineDate == null) {
			if (other.onlineDate != null)
				return false;
		} else if (!onlineDate.equals(other.onlineDate))
			return false;
		if (pdAlterRollbackSql == null) {
			if (other.pdAlterRollbackSql != null)
				return false;
		} else if (!pdAlterRollbackSql.equals(other.pdAlterRollbackSql))
			return false;
		if (pdAlterSql == null) {
			if (other.pdAlterSql != null)
				return false;
		} else if (!pdAlterSql.equals(other.pdAlterSql))
			return false;
		if (pdCreateRollbackSql == null) {
			if (other.pdCreateRollbackSql != null)
				return false;
		} else if (!pdCreateRollbackSql.equals(other.pdCreateRollbackSql))
			return false;
		if (pdCreateSql == null) {
			if (other.pdCreateSql != null)
				return false;
		} else if (!pdCreateSql.equals(other.pdCreateSql))
			return false;
		if (pdDeleteRollbackSql == null) {
			if (other.pdDeleteRollbackSql != null)
				return false;
		} else if (!pdDeleteRollbackSql.equals(other.pdDeleteRollbackSql))
			return false;
		if (pdDeleteSql == null) {
			if (other.pdDeleteSql != null)
				return false;
		} else if (!pdDeleteSql.equals(other.pdDeleteSql))
			return false;
		if (pdInsertRollbackSql == null) {
			if (other.pdInsertRollbackSql != null)
				return false;
		} else if (!pdInsertRollbackSql.equals(other.pdInsertRollbackSql))
			return false;
		if (pdInsertSql == null) {
			if (other.pdInsertSql != null)
				return false;
		} else if (!pdInsertSql.equals(other.pdInsertSql))
			return false;
		if (pdUpdateRollbackSql == null) {
			if (other.pdUpdateRollbackSql != null)
				return false;
		} else if (!pdUpdateRollbackSql.equals(other.pdUpdateRollbackSql))
			return false;
		if (pdUpdateSql == null) {
			if (other.pdUpdateSql != null)
				return false;
		} else if (!pdUpdateSql.equals(other.pdUpdateSql))
			return false;
		if (testAlterRollbackSql == null) {
			if (other.testAlterRollbackSql != null)
				return false;
		} else if (!testAlterRollbackSql.equals(other.testAlterRollbackSql))
			return false;
		if (testAlterSql == null) {
			if (other.testAlterSql != null)
				return false;
		} else if (!testAlterSql.equals(other.testAlterSql))
			return false;
		if (testCreateRollbackSql == null) {
			if (other.testCreateRollbackSql != null)
				return false;
		} else if (!testCreateRollbackSql.equals(other.testCreateRollbackSql))
			return false;
		if (testCreateSql == null) {
			if (other.testCreateSql != null)
				return false;
		} else if (!testCreateSql.equals(other.testCreateSql))
			return false;
		if (testDeleteRollbackSql == null) {
			if (other.testDeleteRollbackSql != null)
				return false;
		} else if (!testDeleteRollbackSql.equals(other.testDeleteRollbackSql))
			return false;
		if (testDeleteSql == null) {
			if (other.testDeleteSql != null)
				return false;
		} else if (!testDeleteSql.equals(other.testDeleteSql))
			return false;
		if (testInsertRollbackSql == null) {
			if (other.testInsertRollbackSql != null)
				return false;
		} else if (!testInsertRollbackSql.equals(other.testInsertRollbackSql))
			return false;
		if (testInsertSql == null) {
			if (other.testInsertSql != null)
				return false;
		} else if (!testInsertSql.equals(other.testInsertSql))
			return false;
		if (testUpdateRollbackSql == null) {
			if (other.testUpdateRollbackSql != null)
				return false;
		} else if (!testUpdateRollbackSql.equals(other.testUpdateRollbackSql))
			return false;
		if (testUpdateSql == null) {
			if (other.testUpdateSql != null)
				return false;
		} else if (!testUpdateSql.equals(other.testUpdateSql))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "MeasurementData [id:" + id + ", userId:" + userId + ", onlineDate:" + onlineDate + ", testCreateSql:"
				+ testCreateSql + ", testCreateRollbackSql:" + testCreateRollbackSql + ", testAlterSql:" + testAlterSql
				+ ", testAlterRollbackSql:" + testAlterRollbackSql + ", testUpdateSql:" + testUpdateSql
				+ ", testUpdateRollbackSql:" + testUpdateRollbackSql + ", testInsertSql:" + testInsertSql
				+ ", testInsertRollbackSql:" + testInsertRollbackSql + ", testDeleteSql:" + testDeleteSql
				+ ", testDeleteRollbackSql:" + testDeleteRollbackSql + ", pdCreateSql:" + pdCreateSql
				+ ", pdCreateRollbackSql:" + pdCreateRollbackSql + ", pdAlterSql:" + pdAlterSql
				+ ", pdAlterRollbackSql:" + pdAlterRollbackSql + ", pdUpdateSql:" + pdUpdateSql
				+ ", pdUpdateRollbackSql:" + pdUpdateRollbackSql + ", pdInsertSql:" + pdInsertSql
				+ ", pdInsertRollbackSql:" + pdInsertRollbackSql + ", pdDeleteSql:" + pdDeleteSql
				+ ", pdDeleteRollbackSql:" + pdDeleteRollbackSql + ", createdUser:" + createdUser + ", createdTime:"
				+ createdTime + ", modifiedUser:" + modifiedUser + ", modifiedTime:" + modifiedTime + ", ext1:" + ext1
				+ ", ext2:" + ext2 + "]";
	}
	
	
	
}
