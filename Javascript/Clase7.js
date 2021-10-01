let elemento = document.getElementById("principal");
let bool = false;
let vv = "buen dia";

elemento.innerHTML = "bool";

var r =Number(" ");

console.log(r);


elemento.innerHTML = "<p>Prueba 123</p>"

if(bool){
    document.write("<h1> prueba * 2 </h1 >")
}

/* hfijerifje */

/*let mensaje = prompt("Introduce tu mensaje");
elemento.innerHTML += "<h3>"+ mensaje + "</h3>";

let menu = prompt("Selecciona el plato: \n 1. Milanesa de seitan \n 2. Papas fritas");

if(menu == 1)
{
    elemento.innerHTML = "<h2> Elegiste seitan </h2>"
}
else{
    elemento.innerHTML = "<h2> Elegiste papas </h2>"
}*/


let num = parseInt(prompt("Ingrsar el primer numero: "))

let num2 = parseInt(prompt("Ingrsar el numero: "))

let num3 = (num + num2);

elemento.innerHTML = "<h2> El resutlado de la suma es " + num3 + "</h2>"

console.log(typeof(num))