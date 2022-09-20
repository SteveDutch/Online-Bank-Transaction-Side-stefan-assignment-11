package com.codercampus.Assignment11.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.codercampus.Assignment11.domain.Transaction;
import com.codercampus.Assignment11.repository.TransactionRepository;

@Controller
public class Transactionsontroller {
	
	//test
	TransactionRepository trans = new TransactionRepository();
	
	
	@GetMapping("/transactions")
	public String getTransactions () {
		return "transactions";
	}
	
	@GetMapping("test")
	public String checkToMethodAndTextfile () {
		List<Transaction> testo = trans.findAll();
		return testo.toString();
	}

}
