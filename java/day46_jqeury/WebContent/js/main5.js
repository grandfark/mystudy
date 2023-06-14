/**main5.js */
//function

//() => {}

const arrowFun2 = x => { { name: 'Yuna' } }
console.log('arrowFun2:', arrowFun2)
console.log('arrowFun2:', arrowFun2.name)

const arrowFun = x => [1, 2, 3]
console.log('arrowFun:', arrowFun(7))

const sum11 = () => { console.log('hello') }
sum11()
console.log('--------------------------')

const sum10 = () => 1000
console.log('sum10:', sum10())
console.log('--------------------------')

const sum9 = (x) => x + 500
console.log('sum9:', sum9(5))
console.log('--------------------------')

const sum8 = (x) => x + 300
console.log('sum8:', sum8(5))
console.log('--------------------------')


const sum7 = (x, y) => x + y
//const sum7 = (x , y) => {return x + y}
console.log('sum7:', sum7(11, 22))
console.log('--------------------------')

const sum6 = (x, y) => {
	return x + y
}
console.log('sum6:', sum6(1, 2))
console.log('--------------------------')

const sum5 = function(x, y) {
	return x + y
}
console.log('sum5:', sum5(100, 200))
console.log('--------------------------')

function sum4() {
	console.log(arguments)
	return arguments[0]
}

console.log(sum4(100, 7, 3));
console.log(sum4());
console.log('--------------------------')

const sum3 = function(x, y) {
	return x + y
}
console.log('--------------------------')

const c = sum3(1, 1)
console.log(c);
console.log(sum3(10, 20))
console.log('--------------------------')

function sum2(x, y) {
	return x + y
}
const a = sum2(10, 20)
const b = sum2(5, 10)
console.log(a + b)

console.log(sum2(1, 1) + sum2(5, 10))

console.log('*========================================*')

function sum(x, y) {
	console.log(x + y)
}
sum(1, 3)
sum(5, 7)