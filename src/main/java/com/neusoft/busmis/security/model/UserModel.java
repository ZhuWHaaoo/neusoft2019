package com.neusoft.busmis.security.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.type.Alias;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
//用户的Model类
@Alias("User")
@Data
public class UserModel implements Serializable {
	private String id=null;
	private String name=null;
	private int age=0;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date joinDate=null;
	private String role=null;
	//关联的角色列表
	private List<RoleModel> roles=null; 
	
	
}
