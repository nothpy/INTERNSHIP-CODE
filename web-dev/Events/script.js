// keyboard events
// onkeyup, onkeydown
/*function abc()
{
    console.log("bbutton clicked");
}
function double()
{
    console.log("Double click");
}
function enter()
{
    console.log("Mouse enterd");
}

function leave()
{
    console.log("Mouse Left");
}
function mousemove(){
    console.log("Mouse Moved");
}
function keypressed()
{
    console.log("key pressed");
}
function keyreleased()
{
    console.log("key up or released");
} */


let btn = document.createElement("button");
btn.textContent = "submit";

// addEventListener(event ,  ()=> {}  , useCapture)

/*btn.addEventListener("click" , ()=>{
    console.log("btn clicked");
});
document.body.appendChild(btn);

let h1 = document.querySelector("h1");
console.log(h1);
h1.addEventListener("click", ()=>{
    console.log("h1 clicked");
})*/
// let div = document.createElement("div");
// div.style.background= "green";
// div.style.height ="200px";
// div.style.width ="200px"
// document.body.appendChild(div);
// div.style.display ="flex";
// div.style.justifyContent = " center";
// div.style.alignItems ="center";

// let div2 = document.createElement("div");
// div2.style.background= "blue";
// div2.style.height ="100px";
// div2.style.width ="100px"
// div.appendChild(div2);
// div2.style.display ="flex";
// div2.style.justifyContent = " center";
// div2.style.alignItems ="center";

// let div3 = document.createElement("div");
// div3.style.background= "red";
// div3.style.height ="50px";
// div3.style.width ="50px"
// div2.appendChild(div3);


let section  =document.querySelector("section");
let article = document.querySelector("article");
let div = document.querySelector("div");

section.addEventListener("click", ()=>{
    console.log("section");
    section.style.backgroundColor = "green";
})

article.addEventListener("click", ()=>{
    console.log("article")
    article.style.backgroundColor = "blue";
})

div.addEventListener("click", ()=>{
    console.log("div")
      div.style.backgroundColor = "red";
})


/* Event propogation in two phase
1. capturing phase ->
   events travels from root element to targetted element 
2. bubbling phase->
    events travels from  targetted element to root element 

*/