// console.log() serve para mostrar algo ma tela
console.log("hello world, no arquivo JS!");

// concatenação
console.log( 1+ "1")

//JS entendeu que era uma subtração mesmo sendo uma string e um tipo numérico
console.log( 1- "1")

// declaração de variável com a palavra reservada VAR
var x = 10
// declaração de variável com a palavra reservada LET
let y = 11 

var x = 11
//let y = 11

//typeof retorna o tipo do dado (String, numerico, objeto, array ...)
console.log(typeof(x))

//alguns casos o JS consegue calcular string com numerico
//retornando com um NAN (Not a number - não é um número)
console.log("aula" * 2)
// JS não necessita colocar um tipo de dado
//mas caso queira, usamos o tipo number para numéricos (int ou float/double)
let numero = "50"
//Tipo String para char e string
let numeroString = String (50)
let casasDecimais = 10.9988

console.log(typeof(numero))
console.log(typeof(numeroString))
// exemplo onde o typeof retorna tipo NUMBER para um número com casas decimais
console.log(typeof(casasDecimais))

console.log(Math.pow(2,2))

//ramdom, para entregar um número aleatorio
console.log (Math.random())
console.log(parseInt(Math.random() * 20))

/*document.querySelector('h1').innerHTML = "Meu título no JS"
document.getElementById('tituloId').innerHTML = "título do ID no JS"
document.querySelector('.tituloClass').innerHTML = "alterado pela class"
//document.getElementsByClassName('tituloClass').innerHTML = "h1 alterado pelo class"*/

//vetor em JS, segue o mesmo padrão Java
// os dados devem ser do mesmo tipo...
var vetorNumerico = [1,2,3,4,5]

//recupera o índice do vetor e retorna o valor no indice
console.log(vetorNumerico[0])

function multiplicar(a,b) {
    console.log(a*b)
}

//chama a função para ser executada
multiplicar(10,10);

//função comretorno tipo numerico
function funcaoComRetorno(x,y) {
    return x * y
}

console.log(funcaoComRetorno(10,5))

//ArrowFunction
var mensagemOla = () => {
    return "Olá novamente"
}

console.log(mensagemOla())

document.getElementById ('recebeuFoco').onfocus = 
function () {
    focado ()
}

function focado () {
    document.getElementById('recebeuFoco').style.background = "green"
}

function valorDigitado () {
    let recebido = document.getElementById ('recebeuFoco').value
    alert ("valor recebido via input: " + recebido)
}