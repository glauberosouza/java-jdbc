# Estudo sobre java, banco de dados e dockers.
## Comandos úteis:
> para subir todos os serviços de um docker compose: docker compose up
> 
> Para subir apenas um serviço de um arquivo de um docker compose: docker compose up "nomeDoServiço" 

### Estudo sobre banco de dados e jdbc, foi criado uma classe PersonDao para realizar a persistência de dados.
> - Ela possui vários métodos para realizar diferentes operações, como salvar, recuperar, atualizar e excluir registros de pessoas no banco de dados.

### A classe ConnectionFactory é responsável por fornecer uma conexão com o banco de dados. 
> - Ela possui um método estático chamado get() que retorna uma instância da classe Connection, que é uma interface usada para se comunicar com o banco de dados.

> - ConnectionFactory encapsula a lógica para obter uma conexão com o banco de dados usando as informações fornecidas no connection.properties. 
> -  Ela utiliza as classes Properties e DriverManager para realizar essa tarefa. O método get() é responsável por retornar a conexão obtida.

### A classe CreateDb é responsável por criar um banco de dados usando o JDBC.
> -  Essa classe estabelece uma conexão com um servidor MySQL local, cria um banco de dados chamado "banco_com_jdbc" (se ele ainda não existir) e exibe uma mensagem de confirmação.
