function enablemergesort(){
	sw=0;
	let button=document.getElementById("sortbutton");
	document.getElementById("swaps").innerHTML=sw;
   	let new_element = button.cloneNode(true);
    button.parentNode.replaceChild(new_element, button);
	new_element.addEventListener("click", smsort);
	document.getElementById("name").innerHTML="Merge Sort";
	document.getElementById("about").innerHTML="Merge Sort is a Divide and Conquer algorithm. It divides the input array into two halves, calls itself for the two halves, and then merges the two sorted halves. The merge() function is used for merging two halves. ";
	document.getElementById("link").href="https://github.com/tushar-s-patel/VisualizeSorting.github.io/blob/master/sort/Merge_sort.java";
	document.getElementById("link").innerHTML="Read more";
	document.getElementById("swap").innerHTML="Swaps";
	document.getElementById("best").innerHTML="Best Case Time Complexity: Ω(n log n)";
	document.getElementById("average").innerHTML="Average Case Time Complexity : θ(n log n)";
	document.getElementById("worst").innerHTML="Worst Case Time Complexity : O(n log n)";
	
}

async function merge(arr,l,h,m) {
	// body...
	let d =document.getElementById("d"+(l+1));
	let d1 =document.getElementById("d"+(h+1));
	d.style.backgroundColor="yellow";
	d1.style.backgroundColor="yellow";
	await new Promise(resolve => setTimeout(resolve ,speed));
	
	// console.log("array c after ");
	let c=[];
	let i=l;
	let j=m+1;
	let k=0;

	while(i<=m&&j<=h){
		if(arr[i]>arr[j]){
			c[k]=arr[i];
			i++;
		}
		else{
			c[k]=arr[j];
			j++;
		}
		k++;
	}
	while(i<=m){
		c[k]=arr[i];
		i++;
		k++;
	}
	while(j<=h){
		c[k]=arr[j];
		j++;
		k++;
	}
	for (var p = 0 ,q=l; p < c.length; p++ , q++) {
		if(arr[q]!=c[p]){
			sw++;
		}
		arr[q]=c[p];
		
		document.getElementById("swaps").innerHTML=sw;
		let d =document.getElementById("d"+(q+1));
		d.style.height=arr[q]+"px";
		await new Promise(resolve => setTimeout(resolve ,(speed/2)));
	}
	d.style.backgroundColor="blue";
	d1.style.backgroundColor="blue";
	//console.log("array c after "+c);

	//console.log(arr);
}

async function mergesort(arr,l ,h){
	// let d =document.getElementById("d"+(l+1));
	// let d1 =document.getElementById("d"+(h+1));
	// d.style.backgroundColor="yellow";
	// d1.style.backgroundColor="yellow";
	// await new Promise(resolve => setTimeout(resolve ,100));
	// d.style.backgroundColor="blue";
	// d1.style.backgroundColor="blue";

	
	
	let m=Math.floor((l+h)/2);
	if(l<h){
		await mergesort(arr,m+1,h);
		await mergesort(arr,l,m);
		
		await merge(arr,l,h,m);
	}
	//console.log(arr);
}

async function smsort(){
	sw=0;
	for (var i = 0; i < b.length; i++) {
		b[i].disabled=true;
	}
	document.getElementById("sortbutton").disabled=true;
	const rangeb =document.getElementById("range");
	rangeb.disabled=true;

	await mergesort(arr,0,arr.length-1);

	for (var i = 0; i < b.length; i++) {
		b[i].disabled=false;
	}
	rangeb.disabled=false;
	document.getElementById("sortbutton").disabled=false;
}