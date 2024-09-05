# Sistema de Compra com Cálculo de Impostos

Este projeto é um sistema simples de compras que permite ao usuário selecionar um item, informar seu preço e aplicar uma taxa de imposto com base no país escolhido. O sistema calcula o valor total da compra, incluindo o imposto, e exibe um resumo para o usuário.

## Estrutura do Projeto

O projeto é composto pelos seguintes arquivos principais:

1. **Main.java**: O ponto de entrada do programa que gerencia a interação com o usuário e calcula o total da compra com base na taxa de imposto.
2. **TaxService.java**: Interface que define o contrato para os serviços de imposto.
3. **EUTaxService.java**: Implementação da interface `TaxService` para a Europa.
4. **USTaxService.java**: Implementação da interface `TaxService` para os EUA.
5. **BrasilTaxService.java**: Implementação da interface `TaxService` para o Brasil.
6. **Chest.java**: Representa um item de compra com um nome e preço.
7. **Buying.java**: Calcula o total da compra com base no preço do item e na taxa de imposto.

## Funcionalidade

1. **Listagem de Itens e Preços**:
   - O programa exibe uma lista de itens e preços disponíveis.

2. **Entrada do Usuário**:
   - O usuário insere o nome do item e o preço.
   - O usuário escolhe o país para aplicar a taxa de imposto.

3. **Cálculo do Imposto**:
   - O programa calcula o imposto com base na taxa específica para o país selecionado.
   - Os impostos são calculados com base no preço informado:
     - **Brasil**: 20% para preços abaixo de 100 R$; 35% para preços acima de 100 R$.
     - **USA**: 0% para preços abaixo de 100 $; 50% para preços acima de 100 $.
     - **Europa**: 10% para preços abaixo de 100 €; 20% para preços acima de 100 €.

4. **Resumo da Compra**:
   - O programa exibe o resumo da compra, incluindo o preço do item, o valor do imposto e o total.

## Como Executar

1. **Compilação**:
   - Compile todos os arquivos `.java` usando um compilador Java:
     ```sh
     javac Main.java TaxService.java EUTaxService.java USTaxService.java BrasilTaxService.java Chest.java Buying.java
     ```

2. **Execução**:
   - Execute o programa:
     ```sh
     java Main
     ```

3. **Interação**:
   - O programa solicitará a entrada do usuário para o nome do item, o preço, e o país para calcular o imposto.
   - O usuário poderá visualizar o resumo da compra e confirmar se deseja finalizar.

## Exemplo de Uso

```
Blusa
Calça
Luvas
Meias
Sapato
Chinela
Qual a sua compra
Blusa
30
Qual o preço? (A qualidade é melhor quanto maior o preço)
30
Selecione uma Taxa de Pais (Europa, Brasil, USA)
Brasil
Buying Compra= [item= Blusa, preco= 30.00, taxa= 6.00, total= 36.00]
Essas são as informações da sua compra, deseja finalizar? (Digite sim para encerrar)
sim
COMPRA CONFIRMADA
```

## Observações

- O sistema considera apenas três países para as taxas de imposto.
- Certifique-se de fornecer entradas válidas para o nome do item e o preço.
