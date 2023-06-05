# DESAFIO 1

## PREMISSAS
MORPHEUS TE LANÇA UM DESAFIO: SE CONECTE COM O BANCO MYSQL INSTALADO VIA DOCKER NAS AULAS ANTERIORES

## SUA MISSÃO
- CRIE UMA CLASSE DE TESTE
- CRIE VARIÁVEIS, DO TIPO STRING, conforme abaixo:
~~~
user = "root";
password = "sua_senha";
url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
~~~
- FAÇA O DOWNLOAD DO DRIVE DO MYSQL
  - ```FILE > PROJECT STRUCTURE > LIBRARIES``` 
    - CLIQUE NO SINAL DE ```+```
    - ESCOLHA VIA ```MAVEN```
    - PESQUISE POR ```MYSQL```
    - PODE INSTALAR A VERSÃO ```5.1.49```
- UTILIZE A CLASSE ```DriverManager``` PARA ABRIR UM CONEXÃO COM O BANCO DE DADOS
- IMPRIMA NO TERMINAL A FRASE: ```"Conectado com sucesso!``` CASO NÃO OCORRA ERRO DURANTE A CONEXÃO
- FECHE A CONEXÃO FINAL


## PALAVRAS-CHAVE
- java.sql.DriverManager
- getConnection(A, B, C)
- close()