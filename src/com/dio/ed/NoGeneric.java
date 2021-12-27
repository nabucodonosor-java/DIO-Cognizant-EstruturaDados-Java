package com.dio.ed;

public class NoGeneric<T> {
	
	private T conteudo;
	private NoGeneric<T> proximoNo;
	
	public NoGeneric(T conteudo) {
		this.conteudo = conteudo;
		this.proximoNo = null;
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public NoGeneric<T> getProximoNo() {
		return proximoNo;
	}

	public void setProximoNo(NoGeneric<T> proximoNo) {
		this.proximoNo = proximoNo;
	}

	@Override
	public String toString() {
		return "No [conteudo=" + conteudo + "]";
	}
	
}
