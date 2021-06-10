// let b=document.getElementById("sortname").children;
function enableselectionsort(){
	sw=0;
	let button=document.getElementById("sortbutton");
	document.getElementById("swaps").innerHTML=sw;
   	let new_element = button.cloneNode(true);
    button.parentNode.replaceChild(new_element, button);
	new_element.addEventListener("click", sssort);
	document.getElementById("name").innerHTML="Selection Sort";
	document.getElementById("about").innerHTML="The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array.  1) The subarray which is already sorted.   2) Remaining subarray which is unsorted.";
	document.getElementById("link").href="https://github.com/tushar-s-patel/VisualizeSorting.github.io/blob/master/sort/Selection_sort.java";
	document.getElementById("link").innerHTML="Read more";
	document.getElementById("swap").innerHTML="Swaps";
	document.getElementById("best").innerHTML="Best Case Time Complexity: Ω(n^2).";
	document.getElementById("average").innerHTML="Average Case Time Complexity : θ(n^2)";
	document.getElementById("worst").innerHTML="Worst Case Time Complexity : O(n*n)";
	
	
}

async function ssort(arr,range){
	for (var i = 0; i < b.length; i++) {
		b[i].disabled=true;
	}
	const rangeb =document.getElementById("range");
	rangeb.disabled=true;
	var all = document.getElementsByClassName('container');
	let sw=0;
	for (var i = range-1; i>0; i--) {
		var s_i=i;
		for (var k = 0; k < all.length; k++) {
			all[k].style.backgroundColor = 'blue';
		}

		let d =document.getElementById("d"+(i+1));
		d.style.backgroundColor="yellow";
		for(var j=i-1; j >= 0; j--){
			 let d1= document.getElementById("d"+(j+1));
			 d1.style.backgroundColor="yellow";
			 await new Promise(resolve => setTimeout(resolve ,speed));
			
			if(arr[s_i]>arr[j]){
				s_i=j;
			}
			d1.style.backgroundColor="blue";
		}
		
			if(arr[i]>arr[s_i]){
				document.getElementById("swaps").innerHTML=sw;
				let d1= document.getElementById("d"+(s_i+1));
				 d1.style.backgroundColor="#ff2000";

				 if(range<50){
				 	await new Promise(resolve => setTimeout(resolve ,speed));
				 }

				let temp=arr[s_i];
				arr[s_i]=arr[i];
				arr[i]=temp;
				d.style.height=arr[i]+"px";
				d1.style.height=arr[s_i]+"px";
				sw+=1;
				d1.style.backgroundColor="blue";
			}

		d.style.backgroundColor="blue";
	}
	for (var i = 0; i < b.length; i++) {
		b[i].disabled=false;
	}
	rangeb.disabled=false;
	document.getElementById("sortbutton").disabled=false;

}

function sssort(){
	document.getElementById("sortbutton").disabled=true;
	ssort(arr,range);

	
}
