import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Digite um número: ', (input) => {
  const n = parseInt(input);

  if (isNaN(n) || n <= 0) {
    console.log('Por favor, digite um número inteiro positivo.');
    rl.close();
    return;
  }

  const fibonacci = (num: number): number[] => {
    const seq: number[] = [];

    for (let i = 0; i < num; i++) {
      if (i === 0) {
        seq.push(0);
      } else if (i === 1) {
        seq.push(1);
      } else {
        seq.push(seq[i - 1] + seq[i - 2]);
      }
    }

    return seq;
  };

  const resultado = fibonacci(n);
  console.log('Sequência de Fibonacci:');
  console.log(resultado.join(', '));

  rl.close();
});
