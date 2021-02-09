package com.trident.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.trident.entity.History;
import com.trident.repository.HistoryRepository;

@Service
public class HistoryService
{
	@Autowired
	private HistoryRepository historyRepository;
	
	public List<History> findAll() {
		return historyRepository.findAll();
	}
	
	public History find(String aadhar) {
//		return historyRepository.findByAadhar(aadhar);
		return null;
	}
	
	@Transactional
	public History save(History history) {
		return historyRepository.save(history);
	}
}