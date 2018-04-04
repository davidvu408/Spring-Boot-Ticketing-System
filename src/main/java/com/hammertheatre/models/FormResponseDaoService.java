package com.hammertheatre.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormResponseDaoService {
	@Autowired
	private FormResponseDao dao;

	public List<FormResponse> findAllUpTo(int limit) {
		List<FormResponse> frList = new ArrayList<FormResponse>();
		if(limit < 1) {return frList;}
		Iterable<FormResponse> frFullList = dao.findAll();
		for (FormResponse fr : frFullList) {
			if (limit == 0) {
				break;
			}
			frList.add(fr);
			limit--;
		}
		return frList;
	}
	
	public List<FormResponse> findAllUpToAndIncludeOnly(int limit, String category) {
		List<FormResponse> frList = findByMarketingArea(category);
		if(limit < 1) {return frList;}
		while(frList.size() > limit) {
			frList.remove(frList.size() - 1);
		}
		return frList;
	}

	public List<FormResponse> findByMarketingArea(String marketingArea) {
		return dao.findByMarketingArea(marketingArea);
	}
}
