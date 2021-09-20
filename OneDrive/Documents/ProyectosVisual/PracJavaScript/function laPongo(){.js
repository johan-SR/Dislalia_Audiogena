function laPongo(){
console.log("rico")
}

//funcion de tipo expresion 
let sumar= function(a,b){return a+b};

console.log(sumar(1, 1)); 
//funcion auto-incovada
(function(){
console.log("la pones")
})();

//funcion tipo flecha 
const funcionTipoFlecha = (a, b)=>a+b; 

f=funcionTipoFlecha(21,2);
f 

function argumentosnodefinidos(){
    r=0;
    for (i=0;i<arguments.length;i++){
        r += arguments[i];
    }
    return r
}


r = argumentosnodefinidos(3,1,6,3,12,4,5,)

console.log(r);