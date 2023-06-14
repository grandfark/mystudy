/** index.js */
var slides = document.querySelector('.slides'),
	slide = document.querySelectorAll('.slides li'),
	currentIdx = 0,
	slideCount = slide.length,
	prevBtn = document.querySelector('.prev'),
	slideWidth = 300,
	slideMargin = 10,
	nextBtn = document.querySelector('.next');

slides.style.width = (slideWidth + slideMargin) * slideCount - slideMargin + 'px';

function moveSlide(num) {
	slides.style.left = -num *180 + 'px';
	currentIdx = num;
}
nextBtn.addEventListener('click', function() {
	if (currentIdx < slideCount - 3) {
		moveSlide(currentIdx + 1);
	} else {
		moveSlide(0);
	}
});
prevBtn.addEventListener('click', function() {
	if (currentIdx > 0) {
		moveSlide(currentIdx - 1);
	} else {
		moveSlide(slideCount - 3);
	}
});
//테이블에 사진 출력
var bigpic = document.querySelector("")