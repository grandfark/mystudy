/* day46.js */

//HTML요소 (Element)1개 검색/찾기
const boxEls = document.querySelectorAll('.box');//div태그를 불러옴
console.log(boxEls);

//찾은 요소들 반복해서 함수 실행 - 익명함수
//boxEl.forEach(function(1, 2, 3){})//1:요소 값 2:인덱스 번호 3:전체요소
boxEls.forEach(function(item, index) {
	item.classList.add(`order-${index + 1}`);
	console.log(index, item);
});





const boxEl = document.querySelector('.box');//div태그를 불러옴
console.log(boxEl);
//const boxEl = document.querySelector('.box');//div태그를 불러옴
//console.log(boxEl);
//HTML 요소에 적용할 수 있는 메소드
//인수(Arguments)를 추가 기능
//boxEl.eventaddEventListener(1, 2); 1: event명 2.할 일
//익명 메소드로 구현한다.
boxEl.addEventListener('click', function() {
	console.log('Click~~~');
	boxEl.classList.add('active');
	console.log(
		boxEl.classList.contains('active') 	//클래스이름에 active 추가
	);
	boxEl.classList.remove('active');		//추가된 active 제거
	console.log(
		boxEl.classList.contains('active')
	)
});

let isShow = true;
let checked = false;

if (isShow) {
	console.log('Show!');
}

if (checked) {
	console.log('Checked!');
}

if (isShow) {
	console.log('Show!');
} else {
	console.log('Hide?');
}