package com.example.calculadoracarrinho


object RepositorioProdutos {
    val catalogo = listOf(
        Produto(
            nome = "Notebook Dell Inspiron",
            preco = 3499.00,
            descricao = "Um notebook rápido para multitarefas e trabalho diário.",
            descontoPercentual = 5.0
        ),
        Produto(
            nome = "Mouse sem fio",
            preco = 89.90,
            descricao = null, // Teste de valor nulo
            descontoPercentual = 0.0
        ),
        Produto(
            nome = "Teclado mecânico RGB com Switch azul, ABNT2", // Teste de nome longo
            preco = 349.90,
            descricao = "Switch azul, ABNT2",
            descontoPercentual = 0.0
        ),
        Produto(
            nome = "Monitor LED 24 polegadas",
            preco = 899.90,
            descricao = "Painel IPS com alta taxa de atualização.",
            descontoPercentual = 10.0
        ),
        Produto(
            nome = "Headset Gamer",
            preco = 220.00,
            descricao = "Som estéreo imersivo com microfone integrado.",
            descontoPercentual = 0.0
        ),
        Produto(
            nome = "Tapete para Rato Grande",
            preco = 59.90,
            descricao = "Superfície speed em tecido otimizada.",
            descontoPercentual = 0.0
        )
    )
}