# Lista de Exercícios - Java

Este repositório contém a resolução de 20 exercícios práticos focados em manipulação de vetores e matrizes utilizando a linguagem Java. 

## Questões Resolvidas

**1.** Uma concessionária registrou o consumo de energia elétrica de uma residência ao longo de vários dias. Escreva um programa que leia um número inteiro `n`, que representa a quantidade de dias analisados. Em seguida, leia `n` valores inteiros que representam o consumo de energia em cada dia, armazenados em um vetor. O programa deve informar o consumo total no período, o consumo médio por dia e a quantidade de dias em que o consumo foi maior que a média.

**2.** Uma escola deseja analisar o desempenho de uma turma em uma avaliação. Escreva um programa que leia um número inteiro `n` (quantidade de alunos), seguido de `n` valores reais (notas). O programa deve informar a maior nota, a menor nota, a média da turma e a quantidade de alunos com nota maior ou igual a 7.0.

**3.** Uma loja decidiu reajustar os preços de seus produtos. Escreva um programa que leia um número inteiro `n` (quantidade de produtos) e `n` valores reais (preços atuais). Depois, leia um valor inteiro `p` (percentual de reajuste). O programa deve informar os novos preços após o reajuste, o valor total antes e o valor total depois do reajuste.

**4.** Um almoxarifado mantém os códigos dos produtos mais consultados em um vetor. Leia um inteiro `n` (quantidade de códigos), os `n` códigos inteiros, e depois um número inteiro `x` (código procurado). O programa deve informar se o código `x` está presente no vetor e a posição da primeira ocorrência (índice iniciado em 0). Caso não exista, informe explicitamente.

**5.** Uma fábrica registrou a quantidade de peças produzidas em dias consecutivos. Leia um inteiro `n`, seguido de `n` valores inteiros (produção diária). Informe o maior valor produzido em um único dia, o menor valor, e a maior diferença positiva entre dois dias consecutivos (valor atual - valor anterior). Se não houver, informe 0.

**6.** Os tempos finais de uma corrida foram armazenados. Leia um inteiro `n`, seguido de `n` valores reais (tempos em segundos). Informe o menor tempo, o maior tempo, e os três menores tempos em ordem crescente.

**7.** Um banco deseja analisar o patrimônio de seus clientes. Leia dois inteiros `l` e `c` (quantidade de clientes e contas por cliente). Leia os `l x c` valores da matriz. Informe a soma dos valores de cada linha e o maior valor entre essas somas.

**8.** Uma escola registrou as notas de várias turmas. Leia `l` e `c` (alunos e avaliações). Leia a matriz de valores reais. Informe a média de cada aluno, a média de cada avaliação, e a quantidade de alunos cuja média final é maior ou igual a 7.0.

**9.** Um centro de monitoramento utiliza matrizes quadradas. Leia um inteiro `n`, seguido de uma matriz quadrada de ordem `n`. Informe a soma da diagonal principal, a soma da diagonal secundária, e a soma dos elementos pertencentes às duas diagonais (sem repetir o elemento central, se houver).

**10.** Um estacionamento registrou a entrada de veículos por dia e por turno. Leia `l` (dias) e `c` (turnos), seguido da matriz de inteiros. Informe a soma de cada linha, a soma de cada coluna, o índice da linha com maior soma e o índice da coluna com maior soma.

**11.** Uma empresa precisa reorganizar relatórios trocando linhas por colunas. Leia `l` e `c`, e a matriz de inteiros. Exiba a matriz transposta (`c` linhas e `l` colunas).

**12.** Leia dois inteiros `l` e `c` (linhas e colunas de uma matriz) e seus elementos. Depois, leia `r` e `s` (linhas e colunas de uma nova matriz). Apresente os elementos na nova matriz seguindo a ordem de leitura original. Se a quantidade de elementos não bater, informe que a reorganização é impossível.

**13.** Uma imagem em tons de cinza é uma matriz de intensidades. Leia `l` e `c`, e a matriz de inteiros. Leia `k` (limite de intensidade). Informe a média dos elementos, o maior valor, e a quantidade de elementos estritamente maiores que `k`.

**14.** Uma fazenda registrou a produção de diferentes setores. Leia `l` e `c`, e a matriz. Informe o índice da linha com maior soma, o índice da coluna com menor soma, a média geral e a quantidade de elementos maiores que a média.

**15.** Matriz de distâncias entre cidades. Leia um inteiro `n` e a matriz quadrada. Informe se todos os elementos da diagonal principal são iguais a 0, os índices `i` e `j` do maior valor fora da diagonal principal, e o índice da linha cuja soma dos elementos é a menor.

**16.** Matriz de passageiros transportados entre terminais. Leia `n` e a matriz quadrada. Informe o total de saídas e chegadas de cada terminal, o terminal com maior diferença absoluta entre saídas e chegadas, e se a matriz é simétrica.

**17.** Instituição financeira. Leia `l` e `c`, e a matriz. Informe a maior soma entre blocos contíguos de uma mesma linha (e seu índice) e a maior soma entre blocos contíguos de uma mesma coluna (e seu índice).

**18.** Laboratório (leituras de sensores). Ponto de pico é aquele estritamente maior que seus vizinhos (cima, baixo, esquerda, direita). Leia `l` e `c`, e a matriz. Informe a quantidade de pontos de pico, a posição do maior ponto de pico e o seu valor.

**19.** Empresa de auditoria. Uma matriz é consistente se a soma de cada linha, coluna e diagonais é a mesma. Leia `n` e a matriz quadrada. Informe se é consistente (e o valor comum) ou, caso não seja, a quantidade de estruturas com soma diferente da primeira linha.

**20.** Monitoramento climático. Deseja-se identificar a maior sequência contínua de dias em que a temperatura permaneceu acima de um valor de referência. Leia `l` e `c`, a matriz, e um inteiro `k` (referência). Informe o comprimento da maior sequência em uma mesma linha, o índice da linha, o índice inicial e o final dessa sequência.
