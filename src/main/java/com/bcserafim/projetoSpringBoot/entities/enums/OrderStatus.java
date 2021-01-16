package com.bcserafim.projetoSpringBoot.entities.enums;

public enum OrderStatus {
	
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	// precis instanciar os codigos para cada atributo
	private int code;
	
	
	private OrderStatus(int code) {
		this.code = code;
	}
	
	//pegar o codigo referenciado
	public int getCode() {
		return code;
	}
	
	
	public static OrderStatus valueOf(int code) {
		for (OrderStatus value : OrderStatus.values()) {//precorrer
			if(value.getCode() == code) {//testar se os codigos são iguais
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");//caso não forem
	}

}
