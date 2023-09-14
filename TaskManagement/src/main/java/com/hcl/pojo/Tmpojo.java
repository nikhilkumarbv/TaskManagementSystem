package com.hcl.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data    //alternative @Getter & @Setter & @ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@Getter
//@Setter
@Table(name="TaskInfo")
public class Tmpojo

{
	@Id
	
	@Column(name="taskid")
	private int tid;
	@Column(name="taskname")
	private String tname;
	@Column(name="taskuser")
	private String tuser;
	@Column(name="taskstatus")
	private String tstatus;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTuser() {
		return tuser;
	}
	public void setTuser(String tuser) {
		this.tuser = tuser;
	}
	public String getTstatus() {
		return tstatus;
	}
	public void setTstatus(String tstatus) {
		this.tstatus = tstatus;
	}
	
	
	

}
