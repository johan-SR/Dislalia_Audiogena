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
            },
            'trigger1': () =>{
               let audio = document.querySelector("#A2");
               audio.play();
               e.detail.body.el.parentNode.removeChild(e.detail.body.el);
               
            },
            'trigger2': () =>{
               let audio = document.querySelector("#A3");
               audio.play();
               e.detail.body.el.parentNode.removeChild(e.detail.body.el);
            },
            'trigger3': () =>{
               let audio = document.querySelector("#A3");
               audio.play();
               e.detail.body.el.parentNode.removeChild(e.detail.body.el);
            }
         }
         triggers[idTrigger] ? triggers[idTrigger](): null;
      });
   }
})
s
function empezar(){
   var player = document.querySelector("#player");
   player.setAttribute("position", "0 0 -1");
   player.setAttribute("sound", "src: #Fondo; autoplay: true");
   var luz = document.querySelector("#luz");
   luz.setAttribute("light", "intensity: 1");
}

let contador =0;
let a = aasd;
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

function bienCo1(){
   let muro3 = document.querySelector("#muro3");
   muro3.parentNode.removeChild(muro3);
   let cobija1 = document.querySelector("#cobijaOpc1")
   cobija1.parentNode.removeChild(cobija1);
   let codija1 = document.querySelector("#codijaOpc1")
   codija1.parentNode.removeChild(codija1);
   contador += 10;
   console.log(contador)
}
function malCo1(){
   let muro3 = document.querySelector("#muro3");
   muro3.parentNode.removeChild(muro3);
   let cobija1 = document.querySelector("#cobijaOpc1")
   cobija1.parentNode.removeChild(cobija1);
   let codija1 = document.querySelector("#codijaOpc1")
   codija1.parentNode.removeChild(codija1);
}