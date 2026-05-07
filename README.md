# Projeto FiapRide - Fernando de Almeida Godoi Martines

## Informações do Aluno

**Nome:** Fernando de Almeida Godoi Martines
**RM:** 564820
**Turma:** 2CCPG
**Curso:** Ciência da Computação
**GitHub:** @nandoalmeidam

---

## Descrição do Projeto

Este projeto é o resultado do aprendizado nas aulas 1-9 de Programação Orientada a Objetos, onde desenvolvemos o sistema **FiapRide** (aplicativo de mobilidade urbana).

---

## Checklist de Implementação

- [x] Aula 1 - Classes e Objetos
- [x] Aula 2 - Métodos
- [x] Aula 3 - Encapsulamento
- [x] Aula 4 - Construtores
- [x] Aula 5 - Associação
- [x] Aula 6 - Herança
- [x] Aula 7 - Polimorfismo
- [x] Aula 8 - Classes Abstratas
- [x] Aula 9 - Interfaces

---

## Perguntas de Reflexão

### Aula 1 - Classes e Objetos

**Pergunta:** "**Pergunta:** Por que precisamos criar uma classe `Passageiro`? Não seria mais fácil apenas criar variáveis soltas no main, como `String nomeAna = "Ana"` e `double saldoAna = 50.0`?

**Pense:** E se o FiapRide tiver 1 milhão de usuários? Como a Classe ajuda a resolver isso?

**Sua Resposta:**
Criar uma classe `Passageiro` ajuda a organizar melhor o sistema e evita deixar várias variáveis soltas no `main`. Em um projeto pequeno isso até funcionaria, mas em um sistema como o FiapRide, com milhares ou milhões de usuários, seria muito difícil controlar tudo manualmente. A classe funciona como um molde, permitindo criar vários passageiros com seus próprios dados de forma organizada. Além disso, ela ajuda na segurança das informações, porque nem todo dado deve ficar público para qualquer parte do sistema alterar. O professor comentou que, por exemplo, um motorista não deveria conseguir alterar diretamente o nome ou saldo de um passageiro. Com Programação Orientada a Objetos, conseguimos proteger os dados e controlar melhor o acesso através de métodos específicos.

---

### Aula 2 - Métodos

**Pergunta:** "Se nós podemos simplesmente fazer `passageiro.saldo = passageiro.saldo \+ 100` diretamente no código principal, por que dá tanto trabalho criar um método específico chamado `adicionarSaldo\(valor\)` para fazer isso? Quais seriam os riscos para a nossa startup de mobilidade se deixássemos qualquer programador alterar o saldo diretamente?"

**Sua Resposta:**
Mesmo sendo mais rápido alterar o saldo diretamente no código, criar um método como `adicionarSaldo(valor)` deixa o sistema mais seguro e organizado. Na aula aprendemos que métodos representam os “verbos” da classe, ou seja, as ações que o objeto pode executar. Além disso, o método permite criar regras de negócio, como impedir valores negativos ou registrar movimentações do usuário. Se qualquer programador pudesse alterar o saldo diretamente, poderiam acontecer erros ou até fraudes dentro do sistema. Usar métodos também facilita manutenção e deixa o código mais próximo de como sistemas reais são desenvolvidos.

---

### Aula 3 - Encapsulamento

**Pergunta:** "No nosso código, os atributos são `private`, mas os métodos `getSaldo\(\)` e `getNome\(\)` são `public`. Por que é seguro deixar o `get` público, mas perigoso deixar o atributo original público?

Pense bem: Qual a diferença entre dar a alguém uma CÓPIA de um documento seu, e entregar o documento ORIGINAL para a pessoa rasurar? "

**Sua Resposta:**
Deixar os atributos como `private` é importante porque protege os dados internos da classe. Se o atributo fosse `public`, qualquer parte do sistema poderia alterar diretamente informações sensíveis, sem passar por nenhuma regra ou validação. Já o método `get` público é mais seguro porque ele apenas retorna o valor, ou seja, permite consultar a informação sem modificar o dado original. É como entregar uma cópia de um documento: a pessoa consegue ler, mas não consegue rasurar o original. O encapsulamento ajuda justamente nisso, escondendo os detalhes internos e controlando o acesso por meio de métodos. Assim, a própria classe continua responsável por decidir como seus dados podem ser lidos ou alterados.

---

### Aula 4 - Construtores

**Pergunta:** "> "Na nossa classe `Veiculo`, nós tomamos duas decisões arquitetônicas muito importantes:
>
> 1. Nós **não** criamos o método `setModelo\(\)`.
> 2. O `setPlaca\(\)` foi criado como **privado**, e criamos um método público chamado `atualizarPlaca\(\)` para acessá-lo.
>
> Pensando no mundo real e no Clean Code: Por que é um erro gravíssimo clicar em 'Gerar Getters e Setters para tudo' automaticamente na sua IDE? Como as nossas duas decisões acima protegem o sistema de fraudes e falhas de lógica?"

_Dica: Pense sobre o que pode ou não mudar fisicamente em um carro, e a diferença entre "alterar um dado no banco" e "executar um processo real no Detran"_"

**Sua Resposta:**
Criar getters e setters para tudo automaticamente pode ser perigoso, porque nem toda informação deve ser alterada livremente dentro do sistema. Na aula aprendemos que o construtor representa o “nascimento” do objeto, então alguns dados precisam ser definidos corretamente logo na criação e não deveriam mudar depois. O modelo de um veículo, por exemplo, não faz sentido ser alterado toda hora, por isso não criamos `setModelo()`. Já a placa exige mais cuidado ainda, porque trocar uma placa não é apenas mudar um texto no sistema, mas sim um processo real que envolve regras e validações, como acontece no Detran. Por isso foi criado um método específico chamado `atualizarPlaca()`, deixando o sistema mais seguro e organizado. Essas decisões ajudam a evitar fraudes, alterações indevidas e problemas de lógica no projeto.

---

### Aula 5 - Associação

**Pergunta:** ""No construtor da `Viagem`, nós exigimos o objeto inteiro \(`Passageiro solicitante`\). Se o nosso resumo só precisa imprimir o nome da pessoa, não seria mais fácil e mais leve pedir apenas a String do nome no construtor da Viagem \(`String nomeDoPassageiro`\) em vez do objeto todo?"

_Pense nas regras de negócio: O que acontece na hora que a Viagem acaba e o sistema precisa descontar o saldo? Se a Viagem tiver apenas a String "Ana Silva", ela consegue mexer no dinheiro dela?_"

**Sua Resposta:**
Usar o objeto inteiro `Passageiro` é mais correto do que usar apenas uma `String` com o nome, porque a viagem precisa acessar outras informações além do nome do usuário. Durante a corrida, o sistema pode precisar consultar saldo, atualizar dados ou aplicar regras de negócio no próprio passageiro. Se a classe `Viagem` tivesse apenas a String `"Ana Silva"`, ela conseguiria apenas mostrar o nome na tela, mas não teria acesso ao saldo para descontar o valor da corrida. Na aula aprendemos que objetos podem se relacionar e “conversar” entre si, deixando o sistema mais organizado e reutilizável. Isso também evita repetir lógica em várias partes do projeto. Assim como um computador possui diferentes componentes trabalhando juntos, as classes também interagem para representar melhor situações reais dentro do sistema.

---

### Aula 6 - Herança

**Pergunta:** ""No nosso código, a mãe `Veiculo` possui os atributos `placa` e `modelo` como `private`. Quando o `Carro` herda de `Veiculo`, ele recebe esses atributos, mas o código dentro de `Carro` NÃO consegue fazer `this.placa = "ABC"`. Ele é obrigado a usar o `super\(\)` ou o `setPlaca\(\)`.

Por que o Java não deixa a filha alterar as variáveis privadas da mãe diretamente? Qual o princípio das aulas passadas que isso está protegendo?""

**Sua Resposta:**
O Java não permite que a classe filha altere diretamente os atributos privados da classe mãe porque isso faz parte do encapsulamento, conceito aprendido nas aulas anteriores. Mesmo herdando características de `Veiculo`, a classe `Carro` ainda precisa respeitar as regras de proteção criadas pela superclasse. Assim, dados importantes como placa e modelo não podem ser modificados livremente por qualquer classe do sistema. O uso de `super()` e dos métodos específicos ajuda a manter a segurança e a organização do código. Além disso, a herança evita repetição, porque a classe filha não precisa recriar atributos que já existem na mãe. Cada subclasse pode adicionar suas próprias características, como porta-malas no carro ou baú na moto, reaproveitando a estrutura principal da superclasse.

---

### Aula 7 - Polimorfismo

**Pergunta:** "No nosso loop `for \(Veiculo veiculo : frota\)`, a variável `veiculo` é do tipo genérico `Veiculo`. Se esquecêssemos de criar o método `calcularAutonomia\(\)` lá na classe mãe `Veiculo`, nós conseguiríamos chamá-lo dentro do loop, mesmo sabendo que ele existe dentro do `Carro` e da `Moto`? Por que o contrato precisa existir na base da hierarquia?"

**Sua Resposta:**
Se o método `calcularAutonomia()` não existisse na classe mãe `Veiculo`, não conseguiríamos chamá-lo dentro do loop usando a variável genérica `Veiculo`. Isso acontece porque o Java olha primeiro para o contrato definido na superclasse para saber quais métodos todos os veículos devem possuir. Na aula aprendemos que o polimorfismo permite usar o mesmo método com comportamentos diferentes em cada classe filha. Assim, `Carro` e `Moto` podem ter regras de cálculo diferentes, mas mantendo o mesmo nome de método. O `@Override` serve justamente para sobrescrever o comportamento da mãe com uma lógica específica da filha. Dessa forma, o sistema fica mais organizado, reutilizável e preparado para aceitar diferentes tipos de veículos sem precisar alterar o loop principal.

---

### Aula 8 - Classes Abstratas

**Pergunta:** "Pense no mundo real: Faz sentido existir um objeto que é APENAS 'Veículo' sem ser um tipo específico? Você já entrou em uma concessionária e comprou "um veículo" genérico, sem ser carro, moto, caminhão ou nada disso?

Por que, então, no código, precisamos EXPLICITAMENTE dizer ao Java que `Veiculo` é `abstract`? Por que ele não deduz isso sozinho?

Pense: Se esquecermos de colocar `abstract`, qual o risco que corremos? Alguém pode criar `new Veiculo\(\)` e quebrar a lógica do nosso sistema?"

**Sua Resposta:**
No mundo real não faz sentido criar apenas um “Veículo” genérico, porque sempre estaremos falando de um tipo específico, como carro ou moto. Por isso a classe `Veiculo` funciona como um molde abstrato, servindo apenas de base para as classes concretas. O Java não consegue deduzir sozinho essa intenção do programador, então precisamos marcar explicitamente a classe como `abstract`. Se esquecermos disso, alguém poderia fazer `new Veiculo()` e criar um objeto genérico sem sentido dentro do sistema. Além disso, os métodos abstratos ajudam a obrigar que todas as classes filhas implementem seus próprios comportamentos. É como o exemplo da forma de biscoito visto na aula: não usamos a forma diretamente, mas sim os biscoitos criados a partir dela. Assim, o código fica mais organizado, seguro e próximo de situações reais.

---

### Aula 9 - Interfaces

**Pergunta:** "Por que Java permite herança simples \(apenas uma mãe\), mas múltipla implementação de interfaces \(vários contratos\)?

Pense: Se `CarroEletrico` pudesse herdar de `Veiculo` E de `Bateria` ao mesmo tempo \(herança múltipla\), o que aconteceria se AMBAS as mães tivessem um método chamado `ligar\(\)`?

Como as interfaces resolvem esse problema? "

**Sua Resposta:**
O Java permite apenas uma herança de classe para evitar conflitos e ambiguidades dentro do sistema. Se `CarroEletrico` herdasse de `Veiculo` e `Bateria` ao mesmo tempo, poderia acontecer um problema caso as duas classes tivessem um método com o mesmo nome, como `ligar()`, deixando o Java sem saber qual comportamento utilizar. As interfaces resolvem isso porque funcionam como contratos de comportamento, definindo apenas o que a classe deve fazer, sem implementar a lógica diretamente. Assim, diferentes classes podem compartilhar os mesmos comportamentos sem precisar pertencer à mesma hierarquia. Na interface, os métodos são públicos e abstratos, obrigando a classe que implementa a criar sua própria lógica usando `@Override`. Isso deixa o sistema mais organizado, flexível e seguro para reutilização de código.

---

## Desafios Técnicos Implementados

### Desafio Pessoal (Seu Projeto)

**Qual foi o domínio que você escolheu para seu projeto pessoal?**
Sistema baseado em SmatWatches.

**Quais classes você criou?**
Classes: `Smartwatch`, `MiBand`, `AppleWatch`, `Bateria`, `Pulseira` e `SistemaPrincipal`.

**Qual foi o maior desafio técnico que você enfrentou?**
O maior desafio foi entender como aplicar corretamente classes abstratas dentro do contexto do projeto. No começo eu tinha dificuldade para compreender por que não fazia sentido criar diretamente um objeto genérico como `new Smartwatch()`, e sim objetos mais específicos como `MiBand` ou `AppleWatch`. Também precisei entender melhor como os métodos abstratos funcionavam e por que as classes filhas eram obrigadas a implementar determinados comportamentos. Outro ponto desafiador foi organizar a herança sem repetir atributos e métodos desnecessários nas subclasses. Durante o desenvolvimento consegui perceber melhor a diferença entre uma classe concreta e uma abstrata, além de entender como o polimorfismo e o `@Override` ajudam a deixar o sistema mais organizado e reutilizável.

---

## Conclusão

**O que você aprendeu nestas 9 aulas?**
Durante essas 9 aulas eu consegui entender melhor como a Programação Orientada a Objetos está presente em praticamente tudo no desenvolvimento de sistemas. Antes eu enxergava as classes apenas como códigos separados, mas ao longo das aulas comecei a perceber como os objetos podem representar situações reais do dia a dia e interagir entre si. Também aprendi a importância de organizar melhor o sistema utilizando conceitos como encapsulamento, herança, polimorfismo, classes abstratas e interfaces. Além da parte técnica, consegui desenvolver uma visão mais lógica sobre como estruturar projetos de forma mais segura, reutilizável e próxima de sistemas reais utilizados pelas empresas.

**Qual conceito foi mais difícil de entender?**
[Qual conceito e como você superou a dificuldade?]

**O que você melhoraria no seu projeto se pudesse refazer?**
[Reflexão crítica sobre seu próprio código]
