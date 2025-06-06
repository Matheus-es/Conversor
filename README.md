��#   C o n v e r s o r D e M o e d a s
 


## Descrição
Este projeto é um conversor de moedas que permite ao usuário converter valores entre diferentes moedas usando dados de uma API em tempo real.

## Tecnologias Utilizadas
- Java
- API Extended Rate
- Gson

## Uso
Para usar o conversor, execute o programa e siga as instruções no console. Você poderá escolher entre 6 opções de conversão e inserir o valor que deseja converter.

## Funcionamento

A classe "Main" é responsável pela interação do usuário com a aplicação, contendo o menu e gerenciando todo o fluxo de funcionamento do programa. Ela apresenta as opções de conversão e coleta as entradas do usuário.

A classe "Conversor" é onde os métodos para calcular as conversões são implementados. Ela também gerencia a conexão com a API Extended Rate, garantindo que os valores de cada moeda estejam sempre atualizados em tempo real.

O record "MoedaExchange" é responsável por estruturar e separar as informações recebidas em formato JSON, transformando-as em um formato mais simples e acessível para utilização nas conversões.
