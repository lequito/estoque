package com.alex.estoque.domain.enums;

public enum Unidade {
	KILOGRAMAS(0, "KILOGRAMAS - KG"),
	MILIGRAMAS(1, "MILIGRAMAS - ML"),
	LITROS(2, "LITROS - LT"),
	UNIDADES(3, "UNIDADES - UN"),
	PECAS(4, "PECAS - PC");
	
	private Integer codigo;
	private String descricao;
	
	private Unidade(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static Unidade toEnum(Integer codigo) {
		if(codigo == null) {
			return null;
		}
		
		for(Unidade x : Unidade.values()) {
			if(codigo.equals(x.getCodigo())){
				return x;
			}
		}
		
		throw new IllegalArgumentException("Unidade inválida");
	}
	
	
}
