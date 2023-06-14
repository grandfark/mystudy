/*day46-2.js */

import getType, { userRandom } from './getType.js'

//산술연산자
console.log(1 + 2);
console.log(5 - 7);
console.log(3 * 4);
console.log(10 / 2);
console.log(7 % 3);

let x = 2;
x = x + 1;
console.log(x);
const y = 1;
const z = 1;
console.log(y == z);//값이 동등한지 연산자는 제외한다.
console.log(y === z);//일치하는지 자료형까지 비교한다.

function isEqual(x, y) {
	return x === y;
}
console.log(isEqual(1, 1));
console.log(isEqual(1, 2));
console.log(isEqual(2, '2'));
console.log(y !== z);
//>,<,<=,>=

//논리연산자
const c = 1 === 1;
const d = 'AB' === 'AB';
const e = false;

console.log(c);
console.log(d);
console.log(e);
console.log('&&:', c && d && e);//참&참&참=참
console.log('||:', c || d || e);//참or참or참=참

//삼항연산자
const f = 1 < 2;

if (f) console.log('참');
else console.log('거짓');

console.log(f ? '참' : '거짓');

console.log(Math.random() * 10);

const func = userRandom();
console.log(func);

if (func === 2) {
	console.log('func is 2');
} else if (func === 9) {
	console.log('func is 9')
} else{
	console.log('rest..');
}

	//-------------------------------
console.log(typeof 'Hello World!');
console.log(typeof 123);
console.log(typeof true);
console.log(typeof undefined);
console.log(typeof null);
console.log(typeof {});
console.log(typeof []);

//function getType(data){
//	return Object.prototype.toString.call(data).slice(8,-1);
//}
//

console.log(getType(123));
console.log(getType(false));
console.log(getType({}));
console.log(getType([]));
console.log(getType(null));

/*
function getTyper(data){
	return Object.prototype.toString.call(data).slice(8,-1);
}
*/


//***********************************************************/
const a = "DaeBo!";
//split: 문자를 인수 기준으로 쪼개서 배열로 반환.
//reverse: 배열을 뒤집어 출력
//join: 배열을 인수 기준으로 문자로 병합해 반환.
const b = a.split('').reverse().join(''); //메소드 체이닝
console.log(a);
console.log(b);

const boxEl = document.querySelector('.box');
console.log(boxEl);
//Getter 값을 얻는 용도
console.log(boxEl.textContent);
//setter 값을 지정하는 용도
boxEl.textContent = 'Yuna!!'
console.log(boxEl.textContent);
