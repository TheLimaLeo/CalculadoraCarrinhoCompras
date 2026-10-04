package com.example.calculadoracarrinho


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp

@Composable
fun TelaCarrinho(itens: List<ItemCarrinho>) {
    val subtotalBruto = itens.sumOf { it.produto.preco * it.quantidade }
    val totalDescontos = itens.sumOf { (it.produto.preco * (it.produto.descontoPercentual / 100.0)) * it.quantidade }
    val valorTotalFinal = subtotalBruto - totalDescontos

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "🛒 Meu Carrinho",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        LazyColumn(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(itens) { item ->
                LinhaProduto(item = item)
            }
        }

        HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))

        ResumoFinanceiro(
            subtotal = subtotalBruto,
            descontos = totalDescontos,
            total = valorTotalFinal
        )
    }
}

@Composable
fun LinhaProduto(item: ItemCarrinho) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(
            modifier = Modifier.padding(12.dp)
        ) {
            Text(
                text = item.produto.nome,
                style = MaterialTheme.typography.titleMedium,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )

            Text(
                text = item.produto.descricao ?: "Sem descrição",
                style = MaterialTheme.typography.bodyMedium,
                color = if (item.produto.descricao == null) MaterialTheme.colorScheme.error else MaterialTheme.colorScheme.onSurfaceVariant,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )

            Spacer(modifier = Modifier.height(4.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "R$ %.2f".format(item.produto.calcularValorTotal()),
                    style = MaterialTheme.typography.bodySmall
                )
                Text(
                    text = "x${item.quantidade}   R$ %.2f".format(item.calcularValorTotal()),
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }
}

@Composable
fun ResumoFinanceiro(subtotal: Double, descontos: Double, total: Double) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Text(text = "Subtotal", style = MaterialTheme.typography.bodyLarge)
            Text(text = "R$ %.2f".format(subtotal), style = MaterialTheme.typography.bodyLarge)
        }
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Text(text = "Descontos", style = MaterialTheme.typography.bodyLarge)
            Text(text = "-R$ %.2f".format(descontos), style = MaterialTheme.typography.bodyLarge, color = MaterialTheme.colorScheme.error)
        }
        HorizontalDivider(modifier = Modifier.padding(vertical = 4.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Text(text = "TOTAL", style = MaterialTheme.typography.titleLarge)
            Text(text = "R$ %.2f".format(total), style = MaterialTheme.typography.titleLarge)
        }
    }
}