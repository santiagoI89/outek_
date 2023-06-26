/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



function SoloLetras(e) {
    key = e.keyCode || e.which;
    tecla = String.fromCharCode(key).toString();
    letras = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZÁÉÍÓÚabcdefghijklmnñopqrstuvwxyzáéíóú ";

    var especial = []; // Define la variable 'especial' como un arreglo vacío

    tecla_especial = false;

    for (var i in especial) {
        if (key == especial[i]) {
            tecla_especial = true;
            break;
        }
    }

    if (letras.indexOf(tecla) == -1 && !tecla_especial) {
        Swal.fire({
            icon: 'error',
            title: 'Ingresar solo letras',
            text: '',
            confirmButtonColor: '#ff9800'
        });

        return false;
    }
}



function SoloLetras2(e) {
    key = e.keyCode || e.which;
    tecla = String.fromCharCode(key).toString();
    letras = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZÁÉÍÓÚabcdefghijklmnñopqrstuvwxyzáéíóú ";

    var especial = []; // Define la variable 'especial' como un arreglo vacío

    tecla_especial = false;

    for (var i in especial) {
        if (key == especial[i]) {
            tecla_especial = true;
            break;
        }
    }

    if (letras.indexOf(tecla) == -1 && !tecla_especial) {
        Swal.fire({
            icon: 'error',
            title: 'Ingresar solo letras',
            text: '',
            confirmButtonColor: '#1976D2'
        });

        return false;
    }
}


function SoloNumeros(evt) {
    if (window.event) {
        keynum = evt.keyCode;
    } else {
        keynum = evt.which;
    }

    if ((keynum > 47 && keynum < 58) || keynum == 8 || keynum == 13) {
        return true;
    } else {
        Swal.fire({
    icon: 'error',
    title: 'Ingresar solo números',
    text: '',
    confirmButtonColor: '#ff9800' 
});

        return false;
    }
}


function SoloNumeros2(evt) {
    if (window.event) {
        keynum = evt.keyCode;
    } else {
        keynum = evt.which;
    }

    if ((keynum > 47 && keynum < 58) || keynum == 8 || keynum == 13) {
        return true;
    } else {
        Swal.fire({
    icon: 'error',
    title: 'Ingresar solo números',
    text: '',
    confirmButtonColor: '#1976D2' 
});

        return false;
    }
}