package com.example.calculadoracarrinho


data class Produto(
    val nome: String,
    val preco: Double,
    val descricao: String? = null,
    val descontoPercentual: Double = 0.0
) : Pagavel {
    override fun calcularValorTotal(): Double {
        return preco * (1.0 - (descontoPercentual / 100.0))
    }
}