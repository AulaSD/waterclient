# waterclient
Aplicação Cliente RMI que irá consumir o serviço de cálculo do consumo de água para uma pessoa (WaterService).

### Aplicação Cliente
A nossa aplicação cliente terá um serviço de cálculo disponibilizado aos seus clientes. Ela irá, baseado no peso de uma pessoa, informar a quantidade de água que a mesma deve consumir durante o dia.

### Composição da Aplicação Servidora
* Pacote interfaces
	* Interface IServiceBeberAgua
 * Pacote model
	 * Classe Pessoa
* Pacote service
	* Classe BebeAgua
	* Classe ServiceBeberAgua
* Pacote application
	* Classe Application

## Interface IServiceBeberAgua
Esta interface foi definida no lado do Servidor. Ele se encontra do lado do Cliente, como uma espécie de Proxy. Ela irá representar o Servidor no lado do Cliente. Desta forma, será através de uma "instância" obtida do tipo desta interface que poderá ser chamado o método remoto presente nela. Esta interface é uma dependência explícita e necessária no lado do cliente (obtida a partir do servidor). O cliente deve ter um pacote e interface, com o mesmo nome que foi definido no lado do servidor (caso contrário teremos mensagens de erro na interação do cliente com o servidor).
## Classe Pessoa
Nesta classe será definida um POJO (Plain Old Java Object) que representará uma pessoa (com nome e peso). Esta classe será usada na chamada do serviço remoto e será uma dependência necessária no lado do cliente. Todo objeto que trafega pela rede deve obrigatoriamente implementar Serializable. O cliente deve ter um pacote e classe, com o mesmo nome que foi definido no lado do servidor (caso contrário teremos mensagens de erro na interação do cliente com o servidor). 
## Classe Application
Esta classe dispara um requisição do cliente ao servidor. Ela possui o método main e ao ser chamado, realiza as ações básicas do obter uma referência do objeto remoto, a partir do repositório do RMI e disparar a requisição. No método main são realizadas as ações de recuperação do objeto remoto a partir do Repositório RMI e a partir deste objeto remoto, será invocado o método remoto.
