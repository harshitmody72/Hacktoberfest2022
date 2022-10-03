// let timer;
// let t = 0;
// let isOn = false;
// let conTim = 1000;
// const fx = () => (el.innerText = t++);


// const el = document.getElementById("abc");

// el.addEventListener("click", () => {
//   isOn ? clearInterval(timer) : (timer = setInterval(fx, conTim));
//   isOn = !isOn;
// });



// const promise = new Promise((res,rej) => {

//     setTimeout( () => rej("time out") , 1000)
    
   
//         let x = 0;
//         for (a = 0; a<100; a++) x+=a
//         res(a)
   

// })


// promise
// .then(d => console.log(d))
// .catch(e => console.log(e)) 



// let arr = []

// for(let i =0; i < 10; i++){
//     arr.push(new Promise((res,rej)=>{
//         setTimeout(()=>{
//             if(i == 0) rej(i)
//             res(i)
//         }, 100*i)
//     }))
// }

// arr.forEach(p => p.then(d => console.log(d)))

// Promise.race(arr)
// .then(d=>console.log(d))
// .catch(e=>console.log(e))

// "use strict"

// const user = {
//     email:"yogeshswami79@gmail.com",
    
//     getHash(){
//         return "123123123"
//     }

// }



// Object.defineProperty(user, 'age', {
//     enumerable:false,
//     configurable:false,
//     writable:false,
//     value:
// })




// console.log(user)






// Object.defineProperty(o, 'a',{
//     get(){return x},
//     set(newValue){x = newValue}
// })


