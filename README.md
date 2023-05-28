<img src="https://github.com/ArturWood/games-list/assets/111249818/434c56b3-9dc9-412a-91f7-2edc3f389c14" width=300px alt="Java Logo" />

# Via CEP - Aplicação back-end Java 17 para Consulta de CEP

Esta é uma aplicação Java que permite realizar consultas de CEP utilizando a API Via CEP. A aplicação consome a API para obter dados como logradouro, bairro, cidade e estado relacionados a um determinado CEP informado pelo usuário.

## Pré-requisitos

- Java Development Kit (JDK) versão 8 ou superior instalado
- IDE Java (como Eclipse ou IntelliJ) ou um editor de texto para escrever o código
- Conexão à internet para consumir a API Via CEP

## Configuração

1. Clone este repositório em sua máquina local:

```bash
# clonar repositório
git clone https://github.com/ArturWood/via-cep.git
```

2. Abra o projeto em sua IDE Java ou editor de texto.

## Utilização

1. Execute a classe `Main` para iniciar a aplicação.
2. No console, digite o CEP desejado.
3. A aplicação irá consumir a API Via CEP e exibir as informações relacionadas ao CEP informado, como logradouro, bairro, cidade e estado.

## Estrutura do Projeto

O projeto possui a seguinte estrutura de arquivos:

```bash
└───src
    └───br
        └───com
            └───viacep
                ├───infra
                ├───model
                └───service
```

- O pacote `br.com.viacep.service` contém a classe `ConsultaCep` que realiza a chamada à API Via CEP para obter os dados do CEP.
- O pacote `br.com.viacep.model` contém a classe `CepData` que representa os dados de um CEP, como logradouro, bairro, cidade e estado.
- O pacote `br.com.viacep.infra` contém a classe `GeraJson` que cria o arquivo externo JSON com as informações do CEP buscado.
- O pacote `br.com.viacep.infra` contém tambem o arquivo Postman 'ViaCEP.postman_collection.json' para consulta e exemlos de retornos na API.
- A classe `Main` é a classe principal que inicia a aplicação e interage com o usuário.
- O arquivo `.gitignore` especifica os arquivos e pastas que devem ser ignorados pelo controle de versão do Git.

## Documentação

No projeto foi adicionado o jar externo GSON para facilitar o tratamento das informações JSON, alem do consumo da Web API ViaCEP;<br>
Segue links para uso e documentação:

https://viacep.com.br/<br>
https://github.com/google/gson
