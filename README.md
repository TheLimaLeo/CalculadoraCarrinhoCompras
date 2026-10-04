# 🛒 Calculadora de Carrinho de Compras - Android (Jetpack Compose)

Repositório desenvolvido por **Leonardo de Lima** para a atividade prática de desenvolvimento Android utilizando Kotlin e Jetpack Compose.

---

## 📱 Sobre o Projeto
O aplicativo consiste num sistema de cálculo e gestão de carrinho de compras para dispositivos móveis. Ele modela entidades de produtos, calcula descontos de forma polimérica através de interfaces e exibe uma interface gráfica moderna baseada em **Material Design 3**.

---

## 🛠️ Tecnologias e Conceitos Utilizados
* **Linguagem:** Kotlin
* **Interface Gráfica:** Jetpack Compose (LazyColumn, Cards, Material 3)
* **Estrutura e Arquitetura:** Programação Orientada a Objetos, Interfaces (`Pagavel`), Data Classes e Objetos Singleton (`RepositorioProdutos`).
* **Processamento de Dados:** Filtros de coleções, ordenação descendente e registo de eventos via Logcat.

---

## 📋 Requisitos de Validação Implementados
1. **Catálogo Parametrizado:** Contém 6 produtos predefinidos com diferentes faixas de preço e regras de desconto.
2. **Tratamento de Nulos:** Produtos com descrições nulas exibem automaticamente a mensagem formatada *"Sem descrição"* em destaque visual de erro.
3. **Nomes Longos:** Suporte a textos extensos com truncamento adequado (`TextOverflow.Ellipsis`).
4. **Relatório Logcat:** O `ProcessadorRelatorio` filtra os itens com desconto e gera a listagem ordenada no terminal da aplicação.
5. **Cálculos Financeiros:** Resumo dinâmico contendo o Subtotal bruto, o total de descontos aplicados e o valor Final TOTAL da compra.

---

## 📸 Demonstração Visual

### Interface do Aplicativo (Emulador Android)


> ![Tela do Carrinho](https://github.com/user-attachments/assets/cd54476e-419e-4d8f-a1c6-9bd6e5092c86)
)

### Registo no Logcat (Processamento de Relatório)

![Logcat](https://github.com/user-attachments/assets/2774cad1-61e7-4cbb-92af-0e0a85cd4cdd)
)

---

## 🚀 Como Executar o Projeto
1. Clone este repositório para a sua máquina:
   ```bash
   git clone [https://github.com/SEU-USUARIO/NOME-DO-REPOSITORIO.git]
