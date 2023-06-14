/** main.js */

const Person = {
	name: 'Yuna'
	, age: 22
	, email: 'parks@parks.com'
	, address: 'Busan'
}

const { name, age, email, address, phone = '010-2030-3349' } = Person
console.log(`user Name:${name}입니다`)
console.log(` ${name}님의 나이는 ${age}입니다`)
console.log(` ${name}님의 이메일은 ${email}입니다`)
console.log(address)
console.log('phone', phone)

const { irum, nai } = Person
console.log(irum)
console.log(Person.address)


console.log("**************************************")

const keys = Object.keys(Person)
console.log(keys)//['name', 'age', 'email']
console.log(Person['name'])
console.log(Person['age'])
console.log(Person.email)

const values = keys.map(key => Person[key])
console.log(values)

/*
function Person{
	key = 'value'
		, key = 222
		method = function() {

		}
}

const Person = {
	key: 'value'
	, key: 222
	, method: function() {

	}
}
*/
console.log("================================")

const numbers = [1, 2, 3, 4, 5, 6]
const fruits = ['Apple1', 'Banana2', 'Cherry3']

let [x, y] = [10, 20]
let [x1, y2, ...rest] = [10, 20, 3, 4, 5, 6, 7]
const [q, w, r, t, j] = fruits
console.log("************==============***************")
console.log(fruits)//['Apple', 'Banana', 'Cherry']
console.log(...fruits);//Apple Banana Cherry
//const [, u] = fruits//Banana
const [, , u] = fruits//Cherry 
console.log(q, u);
console.log("************==============***************")
console.log(fruits)
console.log(q)
console.log(t)
console.log("&*&*&*&*&*&*&**&*&*&*&*&*&*&*&*&*&*")
//function toObject(xx, yy, zz){
/*
function toObject(xx, yy, ...zz){
	return {
		xx: xx
		, yy: yy
		, zz: zz
	}
}
*/

/*
function toObject(xx, yy, ...zz) {
	return {
		xx
		, yy
		, zz
	}
}
*/
const toObject = (xx, yy, zz) => ({ xx, yy, zz })//++++++++++++++++++++++++++++++++++++++
//Arrayfunction( )function을 const으로 바꾸고 return 을 지운다. 그리고 변수 위치를 보기쉽게 옮긴다.

console.log(toObject(...fruits));
//console.log(toObject(fruits[0],fruits[1],fruits[2]));
console.log("&*&*&*&*&*&*&**&*&*&*&*&*&*&*&*&*&*")

console.log("================================")
//splice() 원본을 수정한다.
fruits.splice(2, 0, 'Orange')
console.log(fruits)

console.log("================================")
//numbers.splice(2,1)
numbers.splice(2, 0, 99)
console.log(numbers)

numbers.splice(2, 1, 99)
console.log(numbers)



console.log("================================")
//.push() .unshift() //원본이 수정되는 함수
numbers.push(7)
console.log(numbers)

numbers.unshift(0)
console.log(numbers)

numbers.reverse()
fruits.reverse()

console.log(numbers)
console.log(fruits)
console.log("================================")
//.includes()
const f = numbers.includes(3)
console.log(f)

const g = fruits.includes('parks')
console.log(g)

console.log("================================")
//.find(), .findindex()
const d = fruits.find(item => {
	//	return /^C/.test(item)
	return item
})
console.log(d)

const e = fruits.findIndex(item => /^C/.test(item))
console.log(e)

console.log("================================")
//.filter()
//const a = numbers.map(function(num){
const a = numbers.map(num => {
	//	console.log(num)
	return num < 3;
});
console.log(a);

const b = numbers.filter(num => {
	//	console.log(num)
	return num < 3;
});
console.log(b);

const c = numbers.filter(num => num > 3);
console.log(c);

console.log(numbers)