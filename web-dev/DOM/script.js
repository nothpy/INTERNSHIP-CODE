/* DOM have 5 selectors which help of it manipulate DOM. 
   1. document.getElementById()
   2. document.getElementByclassName()      
   3. document.getElementByTagName()
   4. document.querySelector()
   5. document.querySelectorAll() 

*/

// 1. document.getElementById(" Id_Name")
// let h1 = document.getElementsById("head");
// console.log(h1);
// console.log(h1.textContent);
// h1.style.color='red';

// 2. document.getElementByclassName(" Class_Name")  / it return html collection
// let tags = document.getElementsByClassName("content");
// console.log(tags);
// console.log(tags[0]);
// console.log(tags[1]);
// console.log(tags[1].textContent);

//3. document.getElementByTagName("Tag_Name")
// let h3 = document.getElementByTagName("h3"); // it return html collection
// console.log(h3);
// console.log(h3e[2]);
// console.log(h3[2].textContent);

/*4. document.querySelector()
 it target only single element. it can accept className , IdName, and TagName .
 
 
 */
// let ele = document.querySelector("#head"); // id name select  
// console.log(ele);
 
// let ele2 = document.querySelector(".content"); // class name select
// console.log(ele2);

// let ele3 = document.querySelectorAll("h3"); // tag name select
// console.log(ele3);

// let ele4 = document.querySelector(".content , #head , h3"); // priority -->  id> class > tag 


/* 5. document.querySelectorAll()  //  it return nodelist
it taregt multiple element .
*/

// let ele5 = document.querySelectorAll("h3");
// console.log(ele5);

/** diff between NodeList and HTML collection 
 * both are impure array which we can not use any method array
 * impure array return false reither than pure array return true
 * 
 * 
*/
// let ele1 = document.getElementsByTagName("h3"); // HTML collection
// let ele2 = document.querySelectorAll("h3"); // NodeList

// console.log(ele1);
// console.log(ele2)

// console.log(Array.isArray(ele1)); // false 
// console.log(Array.isArray(ele2)); // false return 

// ! cannot use forEach() in Html Collection
// ele1.array.forEach((ele , i, arr)=>{
//     console.log(ele);
// });

// ! Can use forEach() in NodeList
// ele2.array.forEach((ele , i, arr)=>{
//     console.log(ele);
// });

// How convert impure array into pure array 
//  let pureArr = Array.from(ele1);
//  console.log(pureArr);
//  console.log(Array.isArray(pureArr));
//  pureArr.map((ele)=>{
//     console.log(ele);
//  })

// CREATING ELEMENT 
//  let h1 = document.createElement("h1");
//  h1.textContent = "Hello DON kaisa hey re Tu";
//  console.log(h1);
//  document.body.appendChild(h1);


// CREATING DYNAMIC ELEMENT
  let data = [
    {title:"IPhone"},
    {title:"Samsung"},
    {title:"Moto"},
    {title:"MI"},
    {title:"Infinix Hot 10 play"},
    {title:"Oppo"},
    {title:"Mai mobile ka recharge nhi karaunga"},
    {title:"Realme"}
  ];

  data.map(({title})=>{
    console.log(title)
    let productTitle = document.createElement("h1");
    productTitle.textContent = title;
    document.body.appendChild(productTitle);
  });
