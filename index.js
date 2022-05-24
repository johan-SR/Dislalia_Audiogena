//Movimiento
AFRAME.registerComponent('static-movement', {
    schema: {default: ''},
    init: function () {
       var el = this.el;
       el.addEventListener('click', function () {
          document.querySelector('#player').setAttribute('position', el.getAttribute('position'));
          console.log("Click: Player moved");
       });
    }
});

AFRAME.registerComponent('collider', {
   init: function(){
      this.el.addEventListener('collide', function(e) {

         const idTrigger = e.detail.body.el.id;
         const triggers = {
            'trigger': () =>{
               let audio = document.querySelector("#A1");
               audio.play();
               e.detail.body.el.parentNode.removeChild(e.detail.body.el);
               let trabajar = document.querySelector("#trabajarOpc")
               trabajar.setAttribute("visible", "true")
               let tradajar = document.querySelector("#tradajarOpc")
               tradajar.setAttribute("visible", "true")
            },
            'trigger1': () =>{
               let audio = document.querySelector("#A2");
               audio.play();
               e.detail.body.el.parentNode.removeChild(e.detail.body.el);
               let amistad = document.querySelector("#amistadOpc")
               amistad.setAttribute("visible", "true")
               let amitad = document.querySelector("#amitadOpc")
               amitad.setAttribute("visible", "true")
               
            },
            'trigger2': () =>{
               let audio = document.querySelector("#A3");
               audio.play();
               e.detail.body.el.parentNode.removeChild(e.detail.body.el);
               let cobija = document.querySelector("#cobijaOpc")
               cobija.setAttribute("visible", "true")
               let codija = document.querySelector("#codijaOpc")
               codija.setAttribute("visible", "true")
            },
            'trigger3': () =>{
               let audio = document.querySelector("#A4");
               audio.play();
               e.detail.body.el.parentNode.removeChild(e.detail.body.el);
               let plato = document.querySelector("#PlatoOpc")
               plato.setAttribute("visible", "true")
               let plalto = document.querySelector("#PlaltoOpc")
               plalto.setAttribute("visible", "true")
            },
            'trigger4': () =>{
               let audio = document.querySelector("#A5");
               audio.play();
               e.detail.body.el.parentNode.removeChild(e.detail.body.el);
               let barril = document.querySelector("#BarrilOpc")
               barril.setAttribute("visible", "true")
               let bagil = document.querySelector("#BagilOpc")
               bagil.setAttribute("visible", "true")
            },
            'trigger5': () =>{
               let audio = document.querySelector("#A6");
               audio.play();
               e.detail.body.el.parentNode.removeChild(e.detail.body.el);
               let palabra = document.querySelector("#palabraOpc")
               palabra.setAttribute("visible", "true")
               let palabla = document.querySelector("#palablaOpc")
               palabla.setAttribute("visible", "true")
            }
         }
         triggers[idTrigger] ? triggers[idTrigger](): null;
      });
   }
})

function empezar(){
   var player = document.querySelector("#player");
   player.setAttribute("position", "0 0 -1");
   var luz = document.querySelector("#luz");
   luz.setAttribute("light", "intensity: 1");
}

let contador = 0;

function bien(){
   let muro = document.querySelector("#muro");
   muro.parentNode.removeChild(muro);
   let trabajar = document.querySelector("#trabajarOpc")
   trabajar.parentNode.removeChild(trabajar);
   let tradajar = document.querySelector("#tradajarOpc")
   tradajar.parentNode.removeChild(tradajar);
   contador += 10;
   console.log(contador)
}
function mal(){
   let muro = document.querySelector("#muro");
   muro.parentNode.removeChild(muro);
   let trabajar = document.querySelector("#trabajarOpc")
   trabajar.parentNode.removeChild(trabajar);
   let tradajar = document.querySelector("#tradajarOpc")
   tradajar.parentNode.removeChild(tradajar);
}

function bienCo(){
   let muro1 = document.querySelector("#muro1");
   muro1.parentNode.removeChild(muro1);
   let cobija = document.querySelector("#cobijaOpc")
   cobija.parentNode.removeChild(cobija);
   let codija = document.querySelector("#codijaOpc")
   codija.parentNode.removeChild(codija);
   contador += 10;
   console.log(contador)
}
function malCo(){
   let muro1 = document.querySelector("#muro1");
   muro1.parentNode.removeChild(muro1);
   let cobija = document.querySelector("#cobijaOpc")
   cobija.parentNode.removeChild(cobija);
   let codija = document.querySelector("#codijaOpc")
   codija.parentNode.removeChild(codija);
}

function bienA(){
   let muro2 = document.querySelector("#muro2");
   muro2.parentNode.removeChild(muro2);
   let amistad = document.querySelector("#amistadOpc")
   amistad.parentNode.removeChild(amistadOpc);
   let amitad = document.querySelector("#amitadOpc")
   amitad.parentNode.removeChild(amitad);
   contador += 10;
   console.log(contador)
}
function malA(){
   let muro2 = document.querySelector("#muro2");
   muro2.parentNode.removeChild(muro2);
   let amistad = document.querySelector("#amistadOpc")
   amistad.parentNode.removeChild(amistadOpc);
   let amitad = document.querySelector("#amitadOpc")
   amitad.parentNode.removeChild(amitad);
}

function bienPla(){
   let muro3 = document.querySelector("#muro3");
   muro3.parentNode.removeChild(muro3);
   let plato = document.querySelector("#PlatoOpc")
   plato.parentNode.removeChild(plato);
   let plalto = document.querySelector("#PlaltoOpc")
   plalto.parentNode.removeChild(plalto);
   contador += 10;
   console.log(contador)
}
function malPla(){
   let muro3 = document.querySelector("#muro3");
   muro3.parentNode.removeChild(muro3);
   let plato = document.querySelector("#PlatoOpc")
   plato.parentNode.removeChild(plato);
   let plalto = document.querySelector("#PlaltoOpc")
   plalto.parentNode.removeChild(plalto);
}

function bienBa(){
   let muro4 = document.querySelector("#muro4");
   muro4.parentNode.removeChild(muro4);
   let Barril = document.querySelector("#BarrilOpc")
   Barril.parentNode.removeChild(Barril);
   let Bagil = document.querySelector("#BagilOpc")
   Bagil.parentNode.removeChild(Bagil);
   contador += 10;
   console.log(contador)
}
function malBa(){
   let muro4 = document.querySelector("#muro4");
   muro4.parentNode.removeChild(muro4);
   let Barril = document.querySelector("#BarrilOpc")
   Barril.parentNode.removeChild(Barril);
   let Bagil = document.querySelector("#BagilOpc")
   Bagil.parentNode.removeChild(Bagil);
}

function bienPal(){
   let muro5 = document.querySelector("#muro5");
   muro5.parentNode.removeChild(muro5);
   let palabra = document.querySelector("#palabraOpc")
   palabra.parentNode.removeChild(palabra);
   let palabla = document.querySelector("#palablaOpc")
   palabla.parentNode.removeChild(palabla);
   contador += 10;
   console.log(contador)
}
function malPal(){
   let muro5 = document.querySelector("#muro5");
   muro5.parentNode.removeChild(muro5);
   let palabra = document.querySelector("#palabraOpc")
   palabra.parentNode.removeChild(palabra);
   let palabla = document.querySelector("#palablaOpc")
   palabla.parentNode.removeChild(palabla);
}
