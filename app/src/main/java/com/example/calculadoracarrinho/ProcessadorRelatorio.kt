package com.example.calculadoracarrinho


import android.util.Log

object ProcessadorRelatorio {
    fun gerarRelatorioLogcat(itens: List<ItemCarrinho>) {
        Log.d("CarrinhoRelatorio", "=== PRODUTOS COM DESCONTO APLICADO ===")

        itens
            .filter { it.produto.descontoPercentual > 0.0 }
            .sortedByDescending { it.calcularValorTotal() }
            .forEach { item ->
                val valorFormatado = "R$ %.2f".format(item.calcularValorTotal())
                Log.d("CarrinhoRelatorio", "Produto: ${item.produto.nome} | Total: $valorFormatado")
            }
    }
}