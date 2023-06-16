gsap.set(".CustomTracker", { xPercent: -50, yPercent: -50 });

const CustomTracker = document.querySelector(".CustomTracker");
const pos = { x: window.innerWidth / 2, y: window.innerHeight / 2 };
const mouse = { x: pos.x, y: pos.y };
const speed = 0.35;

const xSet = gsap.quickSetter(CustomTracker, "x", "px");
const ySet = gsap.quickSetter(CustomTracker, "y", "px");


let sandro = document.getElementById("sandro")
window.addEventListener("mousemove", e => {
    mouse.x = e.x;
    mouse.y = e.y;

    sandro.style.left = (e.x - 30) + "px"
    sandro.style.top = (e.y - 40) + "px"

    document.createElement("img")

});

gsap.ticker.add(() => {
    const dt = 1.0 - Math.pow(1.0 - speed, gsap.ticker.deltaRatio());

    pos.x += (mouse.x - pos.x) * dt;
    pos.y += (mouse.y - pos.y) * dt;
    xSet(pos.x);
    ySet(pos.y);
});