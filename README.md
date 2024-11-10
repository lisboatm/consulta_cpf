# Projeto: Consulta CPF (Java)

Este repositório contém um projeto em Java para a consulta e validação de CPFs (Cadastro de Pessoas Físicas). O objetivo é verificar se um CPF informado pelo usuário é válido, utilizando um algoritmo baseado nos dígitos verificadores.

## 🗂 Estrutura do Repositório

```
consulta_cpf/
├── Teste/                # Testes de funcionalidades e validações
├── projetoThiago/
│   └── src/
│       └── projetoThiago/
│           ├── CPF.java         # Classe principal para entrada de dados e execução
│           └── ValidaCPF.java   # Classe para validação de CPFs
└── thiagoCPF/           # Diretório adicional para scripts auxiliares
```

## 🚀 Descrição das Funcionalidades

- **CPF.java**: Classe principal que coleta o CPF do usuário através do console, verifica a validade utilizando a classe `ValidaCPF`, e exibe o resultado.
- **ValidaCPF.java**: Implementa o algoritmo de validação, incluindo o cálculo dos dígitos verificadores. Esta classe:
  - Verifica se o CPF possui 11 dígitos.
  - Descarta sequências de números repetidos como "00000000000" ou "11111111111".
  - Calcula os dígitos verificadores para garantir que o CPF seja válido.

## 🛠 Como Utilizar

### Pré-requisitos
- **Java Development Kit (JDK)**: Certifique-se de ter o JDK instalado (versão 8 ou superior).
- **IDE Java** (opcional): Recomendado o uso do IntelliJ, Eclipse ou VS Code.

### Passo a Passo para Execução

1. **Clone o repositório**:

   ```bash
   git clone https://github.com/lisboatm/consulta_cpf.git
   ```

2. **Navegue até o diretório do projeto**:

   ```bash
   cd consulta_cpf/projetoThiago
   ```

3. **Compile e execute o projeto**:

   - Para compilar:

     ```bash
     javac src/projetoThiago/*.java
     ```

   - Para executar:

     ```bash
     java -cp src/projetoThiago CPF
     ```

4. **Informe um CPF** quando solicitado no console.

### 📋 Exemplo de Execução

```
Informe um CPF: 12345678909

CPF digitado: 12345678909
CPF válido!
```

## 🤝 Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests com melhorias, correções de bugs ou novas funcionalidades.

## 📜 Licença

Este projeto está licenciado sob a [Licença MIT](LICENSE).
