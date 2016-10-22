package com.example.batch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class LocalPartitioningApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocalPartitioningApplication.class, args);
	}
}
