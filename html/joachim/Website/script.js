// Get the button
let mybutton = document.getElementById("myBtn");

// When the user scrolls down 20px from the top of the document, show the button
window.onscroll = function () { scrollFunction() };

function scrollFunction() {
  if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
    mybutton.style.display = "block";
  } else {
    mybutton.style.display = "none";
  }
}

// When the user clicks on the button, scroll to the top of the document
function topFunction() {
  document.body.scrollTop = 0;
  document.documentElement.scrollTop = 0;
}

function addMonkey() {
  let monkey = document.createElement("div")
  monkey.innerHTML = "<img src='mods.gif' alt='Ape'></img>"


  let monkeyLair = document.getElementById("monkeyLair")
  monkeyLair.appendChild(monkey)
}

function stealMonkey() {


  let monkeyLair = document.getElementById("monkeyLair")
  let monkeyLair2 = document.getElementById("monkeyLair2")

  if (monkeyLair.childElementCount > 0) {
    let monkey = monkeyLair.children[0]
    monkeyLair.removeChild(monkey)
    monkeyLair2.appendChild(monkey)
  } else {
    console.log("no Monkey")
  }
}


let killcounter = localStorage.getItem("counter") ?? 0;

genocideCounter()

function monkeyGenocide() {
  let monkeyLair = document.getElementById("monkeyLair")
  let monkeyLair2 = document.getElementById("monkeyLair2")

  for (i = 0; i = monkeyLair.children.length; i++) {
    monkeyLair.removeChild(monkeyLair.firstChild)
    killcounter++
  }

  for (i = 0; i = monkeyLair2.children.length; i++) {
    monkeyLair2.removeChild(monkeyLair2.firstChild)
    killcounter++
  }
  genocideCounter();
}

function genocideCounter() {
  console.log(killcounter);
  document.getElementById("killcounter").innerHTML = killcounter
  localStorage.setItem("counter", killcounter)
}
