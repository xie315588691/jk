package cn.itcast.jk.service.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.jk.mapper.FactoryCMapper;
import cn.itcast.jk.pagination.Page;
import cn.itcast.jk.pojo.FactoryC;
import cn.itcast.jk.pojo.FactoryCExample;
import cn.itcast.jk.pojo.FactoryCExample.Criteria;
import cn.itcast.jk.service.FactoryService;

@Service
public class FactoryServiceImpl implements FactoryService{
	@Autowired
	private FactoryCMapper factoryCMapper;

	public List<FactoryC> findPage(Page page) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<FactoryC> find(Map paraMap) {
		FactoryCExample example = new FactoryCExample();
		Criteria criteria = example.createCriteria();
		List<FactoryC> list = factoryCMapper.selectByExample(example);
		return list;
	}

	public FactoryC get(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void insert(FactoryC factory) {
		factory.setFactoryId(UUID.randomUUID().toString().replaceAll("-", ""));
		factoryCMapper.insert(factory);
	}

	public void update(FactoryC factory) {
		// TODO Auto-generated method stub
		
	}

	public void deleteById(Serializable id) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Serializable[] ids) {
		// TODO Auto-generated method stub
		
	}

	

}
