# CoffeAPI
Desafio ONE Alura full stack para chamar API para front end

![thumbnail-Desafio Java (1)](https://github.com/jacqueline-oliveira/3356-java-desafio-web/assets/66698429/a4597a93-d8de-43d8-974d-2f4e274e336c)

# Desafio


Vamos implementar uma aplicação para gerar frases aleatórias de filmes e séries, que serão consumidas por uma aplicação front-end, disponibilizada nesse [link](https://github.com/jacqueline-oliveira/3356-java-desafio-front).

- Você precisará criar uma API REST, que disponibilize dados através do endpoint **http://localhost:8080/series/frases**;
- Será necessário criar as classes Controller, Service, Repository para implementar as requisições e busca ao banco;
- Será necessário criar a classe Model denominada **Frase** com os atributos id, titulo, frase, personagem e poster;
- Também é interessante criar a classe SerieDTO que será responsável por representar os dados que serão devolvidos para a aplicação front-end;
- Lembre-se de criar o projeto através do site do [Spring Initializr](https://start.spring.io/), onde já é possível adicionar as dependências do Sping Web, Spring Data JPA, PostgreSQL e DevTools;
- Crie o banco de dados diretamente pelo pgAdmin;
- Para ter acesso ao script para popular o banco de dados, acesse esse [link](https://gist.github.com/jacqueline-oliveira/169494892c52ca4d7cd4c6caecd799d8).
- DICA: Para fazer com que retorne a frase aleatória do banco, você pode usar uma consulta JPQL dessa forma:  **@Query("SELECT f FROM Frase f order by function('RANDOM') LIMIT 1")**



## 🔨 Objetivos do projeto

- O objetivo do projeto é consolidar seus conhecimentos adquiridos ao longo da formação, no que tange a Spring, Streams, JPA, aplicação Web;
- É importante iniciar o projeto do zero e ir modelando as classes, testando o acesso ao banco, verificando erros ao tentar obter dados pela aplicação front;
- Criar corretamente o controlador, mapeando a rota que a aplicação front-end irá consumir;
- Entender e corrigir erros referente a CORS;
- Promover uma experiência fullstack entendendo o fluxo da aplicação ponta a ponta.



# Bom desafio!
