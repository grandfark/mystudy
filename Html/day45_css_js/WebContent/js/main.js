/* main.js */

//var vs let vs const
//고정값 const
//변수 let

let fruits = ['Apple', 'Banana', "Cherry"];
console.log(fruits[0]);//0번째 출력
console.log(fruits[1]);//1번째 출력'문자열'
console.log(fruits[2]);//2번째 출력"문자열"

console.log(new Date('2023-05-30'));
console.log(new Date('2023-05-30').getDay());//2,화요일
console.log(new Date('2023-06-03').getDay());//6, 토요일
console.log(new Date('2023-06-03').getFullYear());//년도

//String(문자 데이터): 따옴표를 사용한다.

let myName = "parks";
let email = 'p@rke@email.com';
let hap = '안녕하세요 ' + myName + ' 입니다';
console.log(myName);
console.log(email);
console.log(hap);

let gop = `안녕하세요 ${myName} 입니다. 반가워요`;//${사용할 객체 호출}
console.log(gop);
console.log(`my mail %{email}여기로연략요망`);

let num = '100';
num = 200;
//나중에 바뀐 값이 들어간다
console.log(num);
num = 999;
console.log(num);
let opacity = 1.34;
console.log(opacity);

//boolean(참 거짓);논리데이터
let checked = true;
let isShow = false;
console.log(checked);
console.log(isShow);

//Undefined : 값이 할당되지 않은 상태
let undef;
let obj = { pass: 1234, pwd: 'abc' }//자바의 map과 같다.
console.log(undef); //초기값이 들어가 있지 않으면 안된다.
console.log(obj.pass);
console.log(obj.pwd); //해당값이 없다면 undefinded 가 출력된다.
console.log(obj.mola);

//Null: 어떤 값이 의도적으로 비어있음을 나타낸다.
let empty = null;
console.log(empty);
//Object (객체 데이터): 여러데이터를 Key값과 Value형태로 저장.{ }
let line = '==============================';
console.log(line);
let user = {
	//	key : value
	name: 'park',
	age: 22,
	isValid: true
};
console.log(user);
//console.log(user.isValid);
//console.log(user.age);
//console.log(user.name);

//Array(배열데이터): 여러데이터를 순차적으로 저장. []

fruits = ['Apple1', 'Banana2', 'Cherry3'];
console.log(fruits[0]);//0번째 출력
console.log(fruits[1]);//1번째 출력
console.log(fruits[2]);//2번째 출력''

//변수 사용 - 재사용(재할당)이 가능
let a = 2;
let b = 5;
console.log(a + b);
console.log(a - b);
console.log(a * b);
console.log(a / b);
a = 12;
console.log(a);
b = 999;
console.log(b);

//값(데이터)의 재할당 불가
const x = 15;
console.log(x);

//x = 9878;
//console.log(x);
//TypeError: Assignment to constant variable.

//let this = 'yuna';
//console.log(this);
//예약어 변수 사용 불가

//함수선언
function myFun() {//함수 정의부
	//실행코드
	console.log(1004);
}
//함수호출
myFun();

//return type method
function returnFun() {
	return 300;
}

console.log(returnFun());
//return은 호출하는 쪽에 책임을 진다.
let call = returnFun();
console.log(call);

function sum(x, y) {//x , y 는 매개변수
	//자료형 변수 선언 필요없는 파라미터
	return x + y;
}
//재사용
let c = sum(1, 2);
let d = sum(7, 12);
let e = sum(2, 4);

console.log(c, d, e);

//기명함수(이름이 있는 함수)
function hello(){
	console.log("Hello!!");
}

//익명함수(이름이 없는 함수)
let world = function(){
	console.log("World????");
}
//함수 호출
hello();
world();

//객체 데이터
const person = {
	name:'park',
	age:85,
	getName:function(){
		return this.name;
//		return name;//멤버이름을 호출해야하기때문에 this로 지정해 주어야한다.
	},
	getAge:function(){
		return this.age;
	}
};
const hisName = person.getName();
console.log(hisName);
//또는 
console.log(person.getName());
console.log(person.getAge());
console.log(person.age);//키값으로도 호출가능









