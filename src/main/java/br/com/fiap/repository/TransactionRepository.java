package br.com.fiap.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
	
	public List<Transaction> findByUser_Id(Long id);
}
