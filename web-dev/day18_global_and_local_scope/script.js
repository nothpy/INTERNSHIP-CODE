//VARIABLE SCOPE --> (i) local scope , (ii) global scope 
// CASE1  conditional and looping  --> var-> global and let ,const -> local scope and var -> global scope
//CASE2   Function   ----> let , var , const--> local scope
// debugger
// var a = 10;
// let b = 20;
// const c = 30;
// console.log(a, b, c);
// debugger
// if (10 > 2) {
//     console.log(a, b, c);
// }
// debugger
// for (let i = 0; i <= 5; i++) {
//     console.log(a, b, c);
// }
// debugger // debugger is use for call stack and checking scope
// if (10 > 2) {
//     var a = 18;
//     let b = 296;
//     const c = 378;
//     console.log(a, b, c);
// }


// hoisting in function can be occur only in named function not in arrow function
// web(); //  we can call because of function hoisting
// function web() {
//     var a = 15;
//     let b = 279;
//     const c = 39;
// }
// web(); //? function invocation / function calling
// ! ANONYMOUS FUNCTION --> In this type of function not have any name
// ANONYMOUS FUNCTION can not be call before declaration
// this type of function can be stored in any variable

//a(); // yha per var hoisting ki vajah se  code top of origin per move ho jata
/*var a = function(){
    console.log("ANONYMOUS FUNCTION CALLED");
}
console.log(a);
a();
let x= function home()
{
    console.log("my Home");
}
x();
console.log(x)*/

// !  PARAMETERIZED FUNCION 
/*function party(a, ...x) // ...x is rest parameter
{
    console.log("welcome");
    console.log(a,x);
    console.log(typeof x);
    console.log(arguments)

}
party(10,20,30,40,50);

function pa1(a,b,c){
    console.log(a,b,c);
    console.log(arguments); //Firstly all data are come into arguments array like object and it store and then if any parameter are in function  { like pa1(arg1 , arg2) } then it give one copy from arguments object to arg1 and arg2
}
pa1(2,3,5,8,3,67,80,4,9,56,45); */

//!  HOF( higher order function ) AND CALLBACK 
// function  sum(n1 , n2)
// {
//     console.log(n1+n2);
// }
// function calculate(a,b,fun){
//     fun(a,b);
//     console.log(fun);
// }
// calculate(10,20,sum); // calculate are accept another function ( sum ) as a argument so it is higher order function .
// when another function are passing as a argument when another function are called then it is CALLBACK function here sum is callback function 
// calculate--> HOF and sum --> CALLBACK function  

// Explicit function 
//  let b= () =>{
//     return "explicit"
//  }

// ! Strings 
//  let str1 ="hello"; // you can not write multi line string in (" ")double codes
//  let str2 = `hi
//              hello 
//              kaise 
//              ho`;// you can write multi line string in bactik
// console.log(str1+ " " + " everyone")             
// String interpolation
//  let str3 =  "hello everyone ";
//  console.log(`${str2} everone`); 
 
//  console.log(str2.length);
 // string methods
 /*
    slice(start index,  end index);  slice method can accept negative index.
    substring(start index , end index) ; substring not accept negative index.
    substr(start index,  length);
    replace(original word, replacing word);
 */
// let str = "abcdefghijklmnop";
// let x = str.slice(0,5); // not affect original array .it give specific part of string 
// console.log(x);
// console.log(str.slice(-5,-2));
// console.log(str.substring(5,9));
// console.log(str.substring(-5,-2));
// console.log(str.substr(0,4));
// let str1 = "Hi Everyone,  Hi JS" ;
// let str2 = " Dream it Believe it Build it."
// console.log(str1.replace("Hi" , "Welcome"));
// console.log(str1.replaceAll("Hi"," Welcome"))
// console.log(str1)
// console.log(str1.toUpperCase());
// console.log(str1.toLowerCase());
// console.log(str1.concat(str2))
// let str3 = "        webtech         ";
// trim()
// console.log(str3.trimStart());
// console.log(str3.trimEnd());
// console.log(str3.trim());

// let phoneNo = 6398105849;
// let extractedNo = phoneNo.slice(0,6);
// console.log(extractedNo.padEnd(10, "X"));

// let str4= "reactjs";
// console.log(str4.charAt(5));
// console.log(str4.charCodeAt(5)); // it return ASCII value

// let str5 = " ReactJs is a Library of JS";
// console.log(str5.split())

// let str6 = "Naman"
// console.log(str6.split("").reverse().join("").toLowerCase());

// ARRAY
// array literal
//  let arr1 =[10]// it will specify element
//  let arr2 = new Array(10); // it will specify size
// console.log(arr1);
// console.log(arr2);

// let arr = [10,23,445,65,76,'karan', 4554.66 ];
// console.log(arr.reverse());
// console.log(arr.sort());
// console.log(arr);
// for in and for of 

// for(i in arr){
//     console.log("index number: "+i +"| index value: "+arr[i]);
// }
// for( let i of arr ){
//     console.log(i);
// }
// arr.push(100);// add in last 
// console.log(arr);
// arr.unshift(56); // add value in array starting
// console.log(arr);
// let poppedElement = arr.pop();// delete element from last and it return a deleted value
// console.log(poppedElement);
// console.log(arr);
// arr.shift(200); // remove element at first/ 0th index 
// console.log(arr);

// arr.splice(start index , no.  of element u want to delete , element want u to add);
// arr.splice(2, 0, "hello")
// console.log(arr);
// let arr1 =[ "hi" ,"bye" ,"Welcome" ];
//arr1.splice(1,1);// splice are use to add and as well as delete element . it accept three arguments. splice affect original array
// console.log(arr1);
// let arr2 =[1,2,3,4,5];
// arr2.splice(2,2,500,800,576);
// console.log(arr2);
// interview -- differnce  between slice and splice

// let arr1 = [1,2,3];
// let arr2 = [4,5,6];
// let concatinatedArr = arr1.concat(arr2, [7,8,9]); // this is array
// console.log(concatinatedArr, typeof concatinatedArr);

// let k = arr1+arr2; // this is string
// console.log(k, typeof k)

// let arr = [10,23,445,65,76,'karan', 4554.66 ];
// console.log(arr.includes(10));// if element present in array thrn it return true otherwise false.

// convert array  into string
// let a = ["Hello", "Everyone"];
// console.log(a.toString());
// console.log(a.join(" "));

// Advance array methods 
  /*
       forEach()   -> higher order function
       map() --> it return new array
       filter()
       find()
       reduce()  
  */
// let arr = [10,23,44,65,76,4.6,'karan' ];
// arr.forEach((ele, i, array )=>{ 
//     // in arrow function we can take maximum three element 
//     //  (element, index , array)
//     console.log(ele,"  | " , i +" | " ,arr)
//     return " I am from each";

// });
// let x= arr.forEach((ele, i, array )=>{ 
//     // in arrow function we can take maximum three element 
//     //  (element, index , array)
//     console.log(ele,"  | " , i +" | " ,arr)
//     return " I am from each";

// });
// console.log("==========================");

// let y = arr.map((ele, i, array )=>{ 
//     console.log(ele,"  | " , i +" | " ,arr);
//     return " I am map"; 

// });
// console.log(x);
// console.log(y);

let arr = [10,23,44,65,76,20,50,40 ,10];
// filter method --> 
// let filteredVal = arr.filter((ele)=>{
//      return ele>10;
// });
// console.log(filteredVal);
// in map function when we return value using condition then it return boolean value
// let mappedVal = arr.map((ele)=>{
//     return ele>10;
// });

// console.log(mappedVal);

let a = arr.find((ele)=>{
    return ele === 10;
});
console.log(a)






