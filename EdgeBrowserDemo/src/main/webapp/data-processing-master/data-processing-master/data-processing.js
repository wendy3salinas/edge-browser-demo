//put function in code at top of data-processing.js
//https://www.freecodecamp.org/news/three-ways-to-title-case-a-sentence-in-javascript-676a9175eb27/
function titleCase(str) {
    str = str.toLowerCase().split(' ');
    for (var i = 0; i < str.length; i++) {
    str[i] = str[i].charAt(0).toUpperCase() + str[i].slice(1); 
}
    return str.join(' ');
}




//use location object to access querystring (address bar)
const queryString = window.location.search;
    
let myData = '';//will store data for output
let myCart = ''; //will store info about cart content
let myTotal = 0; //cost of items in cart

if(queryString != ""){ // process data

//separate querystring parameters
const urlParams = new URLSearchParams(queryString);

/* print all data to id of output on page*/

urlParams.forEach(function(value, key) {
  if(key=="Cart"){ //Add price of cart items
    //alert(value);

      switch(value){
        case "Widget":
          myCart += "Widget: $3.99<br />";
          myTotal += 3.99
          break;

          case "Sprocket":
          myCart += "Sprocket: $5.99<br />";
          myTotal += 5.99
          break;

          case "Thingy":
          myCart += "Thingy: $1.99<br />";
          myTotal += 1.99
          break;
    }


  }else{// build the shipping info
    /*
    Here we apply titleCase to?
    keys, First_Name, Last_Name, Address, City

    value = titleCase(value);
    */

    switch(key){
      case "First_Name":
      case "Last_Name":
      case "Address":
      case "City":
         value = titleCase(value);;
      break;
    }
    
    //will replae underscore with space
     key = key.split("_").join(" ");
     myData += `<p><a>${key}:${value}</a></P>`;
     };
  });

  myCart = `<h3>Cart Contents</h3>
            <p>${myCart}</p>
            <p>Total: $${myTotal}</p>
            `;

  myData = myCart + '<h3>Shipping Info</h3>' + myData;
  myData += `<p><a href="index.html">CLEAR</a></p>`
  document.getElementById("output").innerHTML = myData;

  

}
    

 