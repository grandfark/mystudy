/** main7.js */

const person = {
	firstName: 'park'
	,lastName : 'kim'
	,getFullName: function(){
		return `${this.firstName} ${this.lastName}`
	}
	,setFirstname:function(data){
		this.firstName = data;
	}
}
console.log(person)
console.log(person.lastName);
person.setFirstname('Yuna');
console.log(person.getFullName());
console.log(person)
//this는 자바에서 사용된 객체를 의미한다.

const any = {
	firstName: 'Anyy'
	,lastName : 'Clarke'
	,getFullName: function(){
		return `${this.firstName} ${this.lastName}`
	}
	,setFirstname:function(data){
		this.firstName = data;
	}
}
console.log(any);
console.log(any.firstName);
any.setFirstname('Lee');
console.log(any.getFullName())

function User(first,last){
	this.firstName = first
	this.lastName = last
	this.getFullName = function(){
		return `${this.firstName} ${this.lastName}`
	}
}

const saram = User('person','any');
console.log("Error:"+saram)
console.log();



//this
//일반(normal) 함수는 호출 위치에서 this 정의
//화살표 (Arrow) 함수는 자신이 선언된 함수 범위에서 this 정의

function User(name) {
	this.name = name;
}
/*
User.prototype.arrow = () =>{
	console.log(this.name);
}

const park = {
	name : 'ParK',
	normal: function(){
		console.log(this.name);
	}
}*/

const park = {
	name: "park",
	normal: function() {
		console.log(this.name);
	},
	arrow: () => {
		console.log(this.name);
	}
}


const park2 = new User('Yuna')
park.normal()
park.arrow()