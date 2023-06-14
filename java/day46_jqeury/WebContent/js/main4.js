/** main4.js */
//function name(val, val2,...){}
//function name(){return value;}
//즉시 실행 함수1) ( )( )
//				2) ( x() )
//화살표함수
//()=>{ } vs function(){ }
const double5 = (x, y) => { x * y; }

//const doubleArrow = (x) =>{
//	return x * 5
//}

//const doubleArrow = (x) => { return x * 5 }
const doubleArrow = (x) => x * 5


console.log('doubleArrow' + doubleArrow(3));

const double3 = (x) => { return x * 2; }//매개변수가 하나라면 괄호 생략가능
const double6 = x => { }
//() => function(){}
//() => {function, double 제거}

const double2 = function(x, y) {//위의 화살표와 같은 의미
	return x * 2;
	//	return x * y;
}
console.log('double2:', double2(6, 7))
console.log('double2:', double2(5))

const xy = 7;
function double() {//함수 정의부
	console.log(xy * 2);
}

double()//함수 호출
console.log('*------------------------------------------------------*');
(function square(x) {//<--즉시 실행 함수
	console.log(x * x);
}(2));
console.log('*------------------------------------------------------*');
(function square(x) {//<--즉시 실행 함수
	console.log(xy * 2);
}());
console.log('*------------------------------------------------------*');
//변수의 유효범위
//var - 함수레벨 
//let,const - 블록레벨
//var y = 789;
function scope() {//함수 정의부
	if (true) {
		var vv = 7890;
		let yy = 456;
		console.log(vv)
		console.log(yy)
	}
	console.log('블록외부' + vv)
	//	console.log(yy)
}
console.log('*------------------------------------------------------*');
scope();
console.log('*------------------------------------------------------*');
//형변환
//참:true,{},[],1,2,'false',-12,'3.45',12.34,...
//거짓: false, '', ' ',null,undefined, 0 , -0 , NaN
if (!0) {
	console.log('falseScreen')
}

if ('false') {
	console.log('TrueScreen')
}
const a = 1;
const b = 1;
console.log(a == b)











