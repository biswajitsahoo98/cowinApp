package com.trident.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trident.entity.History;

@Repository
public interface HistoryRepository extends JpaRepository<History, String>
{
	
}
