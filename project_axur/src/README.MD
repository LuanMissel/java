# 🔍 HTML Analyzer

O **HTML Analyzer** é uma ferramenta de linha de comando desenvolvida em Java para analisar a estrutura de páginas web. O projeto identifica o conteúdo de texto que possui o maior nível de aninhamento (profundidade) em um arquivo HTML via URL e valida a integridade das tags.

Este projeto foi desenvolvido focado na aplicação de conceitos fundamentais do ecossistema Java, consolidando aprendizados obtidos através do **DevDojo (William Suane)**.

## 🚀 Funcionalidades

* **Extração de Conteúdo:** Identifica e exibe o texto contido na tag de maior hierarquia dentro do documento.
* **Validação de Estrutura:** Detecta se o HTML está malformado, identificando tags não fechadas ou fechadas incorretamente.
* **Conexão Dinâmica:** Realiza o download e o processamento do código HTML diretamente de uma URL informada via argumento.

## 🧠 Conceitos Técnicos Aplicados

* **Lógica de Pilha (Stack):** Utilizada para gerenciar o empilhamento de tags de abertura e desempilhamento de tags de fechamento, permitindo o cálculo exato da profundidade.
* **Métodos Estáticos:** Implementados para fornecer funções utilitárias ligadas diretamente à classe, otimizando a execução sem necessidade de instâncias desnecessárias.
* **Encapsulamento:** Uso rigoroso de modificadores `private` para métodos auxiliares de extração e validação, expondo apenas a lógica de interface necessária.
* **Tratamento de Exceções:** Uso de blocos `try-catch` para garantir que o programa lide corretamente com erros de rede e entradas inválidas.



## 🛠️ Como Executar

1. Certifique-se de ter o **JDK 11 ou superior** instalado.
2. Clone este repositório ou baixe o arquivo `HtmlAnalyzer.java`.
3. Compile o código:
   ```bash
   javac HtmlAnalyzer.java
   
   depois
   
   java HtmlAnalyzer http://hiring.axreng.com/internship/example1.html