let b=document.getElementById("sortname").children;
function enablebubblesort(){
	sw=0;
	let button=document.getElementById("sortbutton");
	document.getElementById("swaps").innerHTML=sw;
   	let new_element = button.cloneNode(true);
    button.parentNode.replaceChild(new_element, button);
	new_element.addEventListener("click", sbsort);
	document.getElementById("name").innerHTML="Bubble Sort";
	document.getElementById("about").innerHTML="Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order. It is optimized by stopping the algorithm if inner loop didn’t cause any swap.";
	document.getElementById("link").href="https://github.com/tushar-s-patel/VisualizeSorting.github.io/blob/master/sort/Bubble_sort.java";
	document.getElementById("link").innerHTML="Read more";
	document.getElementById("swap").innerHTML="Swaps";
	document.getElementById("best").innerHTML="Best Case Time Complexity: Ω(n). Best case occurs when array is already sorted.";
	document.getElementById("average").innerHTML="Average Case Time Complexity : θ(n*n)";
	document.getElementById("worst").innerHTML="Worst Case Time Complexity : O(n*n)";
	
}


 async function bsort(arr,range){
	let s=true;
	sw=0;
	for (var i = 0; i < b.length; i++) {
		b[i].disabled=true;
	}
	const rangeb =document.getElementById("range");
	rangeb.disabled=true;
	var all = document.getElementsByClassName('container');
	for (var i = 0; i < arr.length; i++) {
		    
			for (var i = 0; i < all.length; i++) {
				  all[i].style.backgroundColor = 'blue';
			}
		for (var j = arr.length-1; j >0 ; j--) {
			document.getElementById("swaps").innerHTML=sw;
			let d =document.getElementById("d"+(j+1));
			let d1= document.getElementById("d"+j);
			d.style.backgroundColor="yellow";
			d1.style.backgroundColor="yellow";
			await new Promise(resolve => setTimeout(resolve ,speed));
			if(arr[j]>arr[j-1]){
				let temp=0;
				temp=arr[j];
				s=true;
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				 d.style.backgroundColor="blue";
				d.style.height=arr[j]+"px";
				  d1.style.backgroundColor="red";
				d1.style.height=arr[j-1]+"px";
				sw+=1;
				if(range<40){
				 await new Promise(resolve => setTimeout(resolve ,speed));
				}
				
			}
			else{
				 d.style.backgroundColor="blue";
			    d1.style.backgroundColor="blue";
			}

		}
		if(!s){
			for (var i = 0; i < b.length; i++) {
				b[i].disabled=false;
			}
			rangeb.disabled=false;
			document.getElementById("sortbutton").disabled=false;
			return;
		}
		else{
			s=false;
		}

	}
	// document.getElementById("range").disabled=false;
	

  console.log(arr);
}


function sbsort(){
	document.getElementById("sortbutton").disabled=true;
	bsort(arr,range);
	
}

