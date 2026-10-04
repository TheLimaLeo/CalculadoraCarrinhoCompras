package com.example.calculadoracarrinho

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Dados de validação solicitados no PDF
        val itensCarrinho = listOf(
            ItemCarrinho(produto = RepositorioProdutos.catalogo[0], quantidade = 2), // Notebook Dell
            ItemCarrinho(produto = RepositorioProdutos.catalogo[1], quantidade = 1), // Mouse sem fio
            ItemCarrinho(produto = RepositorioProdutos.catalogo[2], quantidade = 1)  // Teclado mecânico
        )

        // Gera o relatório no Logcat
        ProcessadorRelatorio.gerarRelatorioLogcat(itensCarrinho)

        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TelaCarrinho(itens = itensCarrinho)
                }
            }
        }
    }
}