/* index.js*/
function login_check() {
	let ff = document.ff;

	if (ff.id.value == "") {
		alert("id가 입력되지 않았습니다.");
		ff.id.focus();
		return false;
	} else if (ff.id.value >= 2 && ff.id.value <= 4) {
		alert("id를 2글자 이상 4자 이하로 작성하십시오.");
		ff.id.focus();
		return false;
	}
	else if (ff.pwd.value == "") {
		alert("암호가 입력되지 않았습니다.");
		ff.pwd.focus();
		return false;
	}
}