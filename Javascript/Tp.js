let total  = document.getElementById("Total");
let datos = document.querySelectorAll("input");

const comprarTickets = ()=>{
    
    if (total.innerHTML == "Total a Pagar: $"){
        let cantidad = datos[3].value
        let categoria = document.querySelector("select").value
        let descuento = 15
        if (categoria == "Estudiante"){
            descuento = 80
        }

        if (categoria == "Trainee"){
            descuento = 50
        }
        let precio = parseInt(cantidad) * 200 - ( parseInt(cantidad) * 200 * descuento / 100)
        total.innerHTML +=`${precio}`
    }


    else{
        total.innerHTML = "Total a Pagar: $"
        comprarTickets()
    }
    
}

const borrar = ()=>{
    window.location.reload(true)
}



