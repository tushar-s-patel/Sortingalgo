function enableshellsort(){
	sw=0;
	let button=document.getElementById("sortbutton");
	document.getElementById("swaps").innerHTML=sw;
   	let new_element = button.cloneNode(true);
    button.parentNode.replaceChild(new_element, button);
	new_element.addEventListener("click", sslsort);
	document.getElementById("name").innerHTML="Shell Sort";
	document.getElementById("about").innerHTML="Shell sort is a highly efficient sorting algorithm and is based on insertion sort algorithm. This algorithm avoids large shifts as in case of insertion sort, if the smaller value is to the far right and has to be moved to the far left. This algorithm uses insertion sort on a widely spread elements, first to sort them and then sorts the less widely spaced elements. This spacing is termed as interval. This interval is calculated based on Knuth's formula as :interval = interval*3 + 1 ";
	document.getElementById("link").href="https://github.com/tushar-s-patel/VisualizeSorting.github.io/blob/master/sort/Shell_sort.java";
	document.getElementById("link").innerHTML="Read more";
	document.getElementById("swap").innerHTML="Swaps";
	document.getElementById("best").innerHTML="Best Case Time Complexity: Ω(n log n)";
	document.getElementById("average").innerHTML="Average Case Time Complexity : Depends On Gap Sequence";
	document.getElementById("worst").innerHTML="Worst Case Time Complexity : O(n*n)";
	
}


async function shellsort(arr) {	
	let g=1;
	while(g<Math.floor(arr.length/3)){
		g=(g*3)+1;
	}
	while(g>0){
		for (var i = g; i < arr.length; i++) {
			let j=i;
			while(j>0){
				if(j-g>=0){
					if (arr[j]>arr[j-g]) {
						let d =document.getElementById("d"+(j+1));
						let d1 =document.getElementById("d"+(j-g+1));
						d.style.backgroundColor="yellow";
						d1.style.backgroundColor="yellow";
						await new Promise(resolve => setTimeout(resolve ,speed));
						let temp=arr[j];
						arr[j]=arr[j-g];
						arr[j-g]=temp;
						sw++;
						document.getElementById("swaps").innerHTML=sw;
						d.style.height=arr[j]+"px";
						d1.style.height=arr[j-g]+"px";
						j=j-g;
						await new Promise(resolve => setTimeout(resolve ,speed));
						d.style.backgroundColor="blue";
						d1.style.backgroundColor="blue";
					} 
					else {
						break;
					}
				}
				else{
					break;
				}
			}
		}
		g=Math.floor((g-1)/3);
	}

}

async function sslsort() {
	sw=0;
	for (var i = 0; i < b.length; i++) {
		b[i].disabled=true;
	}
	document.getElementById("sortbutton").disabled=true;
	const rangeb =document.getElementById("range");
	rangeb.disabled=true;
	await shellsort(arr);
	// body...
	for (var i = 0; i < b.length; i++) {
		b[i].disabled=false;
	}
	rangeb.disabled=false;
	document.getElementById("sortbutton").disabled=false;
}