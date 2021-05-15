function enablequicksort(){
	sw=0;
	let button=document.getElementById("sortbutton");
	document.getElementById("swaps").innerHTML=sw;
   	let new_element = button.cloneNode(true);
    button.parentNode.replaceChild(new_element, button);
	new_element.addEventListener("click", sqsort);
	document.getElementById("name").innerHTML="Quick Sort";
	document.getElementById("about").innerHTML="QuickSort is a Divide and Conquer algorithm. It picks an element as pivot and partitions the given array around the picked pivot.The key process in quickSort is partition(). Target of partitions is, given an array and an element x of array as pivot, put x at its correct position in sorted array and put all smaller elements (smaller than x) before x, and put all greater elements (greater than x) after x. All this should be done in linear time. ";
	document.getElementById("link").href="https://github.com/tushar-s-patel/VisualizeSorting.github.io/blob/master/sort/quikesort.java";
	document.getElementById("link").innerHTML="Read more";
	document.getElementById("swap").innerHTML="Swaps";
	document.getElementById("best").innerHTML="Best Case Time Complexity: Ω(n log n)";
	document.getElementById("average").innerHTML="Average Case Time Complexity : θ(n log n)";
	document.getElementById("worst").innerHTML="Worst Case Time Complexity : O(n log n)";
	
}

async function partition(arr,l,h){
	 let d =document.getElementById("d"+(l+1));
	 d.style.backgroundColor="red";
	let piv=arr[l];
	let i=l;
	let j=h;
	while(i<j){
		while(arr[i]>=piv&&i<h){
			i++;
		}
		while(arr[j]<piv&&j>l){
			j--;

		}
		if(i<j){
			let temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			if(arr[i]!=arr[j]){
				sw++;
			}
			document.getElementById("swaps").innerHTML=sw;
			let d =document.getElementById("d"+(i+1));
			let d1 =document.getElementById("d"+(j+1));
			d.style.backgroundColor="yellow";
			d1.style.backgroundColor="yellow";
			await new Promise(resolve => setTimeout(resolve ,speed));
			d.style.height=arr[i]+"px";
			d1.style.height=arr[j]+"px"
			await new Promise(resolve => setTimeout(resolve ,speed));;
			d.style.backgroundColor="blue";
			d1.style.backgroundColor="blue";
		}
	}
		arr[l]=arr[j];
		arr[j]=piv;
		if(l!=j){
			sw++;
		}
		document.getElementById("swaps").innerHTML=sw;
		let d1 =document.getElementById("d"+(j+1));
		d.style.backgroundColor="blue";
		d1.style.backgroundColor="#20ff00";
		d.style.height=arr[l]+"px";
		d1.style.height=arr[j]+"px";
		await new Promise(resolve => setTimeout(resolve ,speed));
		d1.style.backgroundColor="blue";
	// console.log(arr[j]);
	return j;

}

async function Quicksort(arr,l,h){
	// console.log("sorting start");
	if(l<h){

		let j= await partition(arr,l,h);
		console.log("j= "+j);
		await Quicksort(arr,l,j-1);
		await Quicksort(arr,j+1,h);
	}
	// else{
	// 	console.log("sorted");
	// }
}

async function sqsort(){
	sw=0;
	for (var i = 0; i < b.length; i++) {
		b[i].disabled=true;
	}
	document.getElementById("sortbutton").disabled=true;
	const rangeb =document.getElementById("range");
	rangeb.disabled=true;
	await Quicksort(arr,0,arr.length-1);

	for (var i = 0; i < b.length; i++) {
		b[i].disabled=false;
	}
	rangeb.disabled=false;
	document.getElementById("sortbutton").disabled=false;
}