package com.neusoft.busmis.security.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.busmis.security.dao.IFunctionDao;
import com.neusoft.busmis.security.dao.IRoleDao;
import com.neusoft.busmis.security.model.RoleModel;
import com.neusoft.busmis.security.service.IRoleService;
//角色业务实现类
@Service
@Transactional(rollbackFor=Exception.class)
public class RoleServiceImpl implements IRoleService {

	@Override
	public void add(RoleModel role) throws Exception {
		
	}

	@Override
	public void modify(RoleModel role) throws Exception {
		

	}

	@Override
	public void delete(RoleModel role) throws Exception {
		
	}

	@Override
	public List<RoleModel> getListByAll() throws Exception {
		return null;
	}

	@Override
	public RoleModel selectByNo(int no) throws Exception {
		return null;
	}

	@Override
	public List<RoleModel> getListByUser(String userid) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
