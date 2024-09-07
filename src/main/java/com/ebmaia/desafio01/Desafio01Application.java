package com.ebmaia.desafio01;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ebmaia.desafio01.entities.Order;
import com.ebmaia.desafio01.services.OrderService;

@SpringBootApplication
public class Desafio01Application implements CommandLineRunner{

	@Autowired
	private OrderService orderService; 
	
	
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		SpringApplication.run(Desafio01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.print("Digite o código do pedido: ");
		int code = sc.nextInt();
		
		System.out.print("Digite o valor básico do pedido: ");
		double basic = sc.nextDouble();
		
		System.out.print("Digite a porcentagem do desconto: ");
		double discount = sc.nextDouble();
		
		
		Order order = new Order(code, basic, discount);
		
		System.out.println();
		
		System.out.println("Pedido código " + code);
		
		System.out.printf("Valor total: R$ %.2f",orderService.total(order));
		sc.close();
	
	}
	
	

}
