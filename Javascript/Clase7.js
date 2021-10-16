

let elmento = document.querySelector("#principal")

let mascotas = [];

;


const agregarMascota = () =>{
    let datos = document.querySelectorAll("input");

    let consulta = "Urgencia";

    if(datos[7].cheked){
        consulta = "Consulta"
    };

    let mascota = {
        propietario: datos[0].value,
        Nombre: datos[1].value,
        Raza: datos[2].value,
        Escpecie: datos[3].value,
        Edad: datos[4].value,
        peso: datos[5].value,
        Imagen: datos[6].value,
        tipoConsulta: consulta
    }
    mascotas.push(mascota);

    console.log(mascotas)
    mostrarMascotas()
}

const crearForm=() =>{

    elmento.innerHTML = `
    <form class="col-6">
        <div class="mb-3">
            <label for="Propietario" class="form-label">Propietario</label>
            <input type="text" class="form-control" id="Propietario" >
        </div>
        <div class="mb-3">
            <label for="Nombre" class="form-label">Nombre</label>
            <input type="text" class="form-control" id="Nombre" >
        </div>
        <div class="mb-3">
            <label for="Raza" class="form-label">Raza</label>
            <input type="text" class="form-control" id="Raza" >
        </div>
        <div class="mb-3">
            <label for="Especie" class="form-label">Especie</label>
            <input type="text" class="form-control" id="Especie" >
        </div>
        <div class="mb-3">
            <label for="Edad" class="form-label">Edad</label>
            <input type="text" class="form-control" id="Edad" >
        </div>
        <div class="mb-3">
            <label for="Peso" class="form-label">Peso</label>
            <input type="text" class="form-control" id="Peso" >
        </div>
        <div class="mb-3">
            <label for="Imagen" class="form-label">Imagen</label>
            <input type="text" class="form-control" id="Imagen" >
        </div>
        <div class="form-check">
            <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1">
            <label class="form-check-label" for="flexRadioDefault1">
                Consulta
            </label>
        </div>
        <div class="form-check">
            <input class="form-check-input" type="radio"  name="flexRadioDefault" id="flexRadioDefault2" checked>
            <label class="form-check-label" for="flexRadioDefault2">
                Emergencia
            </label>
      </div>

        <button type="submit" id="btn" class="btn btn-primary">Agrgar Datos</button>
    </form>
    `;

     document.getElementById('btn').addEventListener('click', agregarMascota);


};

crearForm()

const mostrarMascotas= ()=>{
    mascotas.forEach(m =>{
        elmento.innerHTML =""
        elmento.innerHTML += `
        <div class="card" style="width: 18rem;">
            <img src="${m.Imagen}" class="card-img-top" alt="...">
            <div class="card-body">
                <h5 class="card-title">${m.Nombre}</h5>
                <p class="card-text">Especie: ${m.Escpecie}</p>
                <p class="card-text">Raza: ${m.Raza}</p>
                <p class="card-text">Edad: ${m.Edad}</p>
                <p class="card-text">Peso: ${m.peso}</p>
                <a href="#" class="btn btn-primary" onCLick=crearForm()>Go somewhere</a>
            </div>
        </div>
        `


    })
};

