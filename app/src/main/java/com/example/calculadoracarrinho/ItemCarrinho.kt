package com.example.calculadoracarrinho


data class ItemCarrinho(
    val produto: Produto,
    val quantidade: Int
) : Pagavel {
    override fun calcularValorTotal(): Double {
        return produto.calcularValorTotal() * quantidade
    }
}