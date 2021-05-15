var range=0;
var id=0;
var arr=[];
var speed=0;
var sw=0;
document.getElementById("size").innerHTML=range;
document.getElementById("setspeed").innerHTML=speed;

function rel(){
	location.reload();
}

function rangefun1(){
	
	range=document.getElementById("range").value;
	console.log(range);
	document.getElementById("size").innerHTML=range;
	document.getElementById("container").innerHTML='';
	arr.length=range;
	for (var i = 0; i < range; i++) {
	let a=5+(485)*Math.random();
	// arr[i]=Math.ceil(a);
	arr[i]=(a);
	id="d"+(i+1);
	mydiv(arr[i],id);

}
// console.log(arr);
}

function rangefun2(){
	speed=document.getElementById("speed").value;
	document.getElementById("setspeed").innerHTML=speed;
	speed*=10;
	speed=1000-speed;
	console.log(speed);
}

function mydiv(height,id) {
	// body...
	let width=1000/range;
	var mydiv=document.createElement("div");
	mydiv.style.height=height +"px";
	// mydiv.style.left=right +"px";
	mydiv.style.width=width +"px";
	document.getElementById('container').appendChild(mydiv);
	mydiv.setAttribute("id",id);
}