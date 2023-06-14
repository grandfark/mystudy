/* main6.js */
//호이스팅(Hoisting)
//함수 선언부가 유효범위 최상단으로 끌어올려지는 현상

//타이머 함수
/*
setTimeout(함수, 시간):일정 시간 후 함수 실행
setInterval(함수, 시간):시간 간격마다 함수 실행
clearTimeout():설정된 timeout 함수 종료
clearInterval():설정된 interval 함수를 종료
*/
function timeout(callback){
	setTimeout(() => { 
		console.log('Daebo')
		callback()
	}, 3000)
}

timeout(()=>{
	console.log('Done');
});


/*
const timer = setInterval(() => {
	console.log('daebo!')
}, 1000);

const h3El = document.querySelector('h3')
h3El.addEventListener('click', () => {
	//		alert('안녕');
	//		clearTimeout(timer);
	clearInterval(timer);
})
*/
//const timer = setTimeout( () =>{
//	console.log('daebo!')
//},3000);
/*
setTimeout( () => { console.log('Daebo')}, 1000);
setTimeout(function(){
	console.log('Daebo')
},3000);
*/
console.log('***************************************')

const a = 7;
var method;

method2();//함수호출 - 함수선언문 형태에서는 호이스팅이 발생한다.

function method2() {//함수 정의부(선언문)
	console.log(a * 5)
}

//method();//함수 호출 - 함수표현식 형태에서는 호이스팅 불가능

//const method = function() {//함수 표현식
//	console.log(a * 3)
//}
//method();//선 정의 후 호출
