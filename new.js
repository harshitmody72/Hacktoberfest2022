// function setcookie(){
//     const email=document.getElementById('exampleInputEmail1').value;
//     const password=document.getElementById('exampleInputPassword1').value;

// const obj={
//     "email":email,
//     "password":password,
// }
// const obj2={
//     key:obj2,
// }
// document.cookie=JSON.stringify(obj2);

// }
// console.log(document.cookie.email);
let emailArr=[];
let passwordArr=[];

function setcookie()
{
  
    const email=document.getElementById('exampleInputEmail1').value;
         const password=document.getElementById('exampleInputPassword1').value;

         if(document.cookie=="")
         {
            document.cookie="email="+email;
         document.cookie="password="+password;
         console.log("Inside cookies");
        }
        else{

                emailArr.push(email);
                passwordArr.push(password);
                document.cookie="email="+JSON.stringify(emailArr);
                document.cookie="password="+JSON.stringify(passwordArr);





            
        }

}




function delete_cookie(name) {
    document.cookie = name +'=; Path=/; Expires=Thu, 01 Jan 1970 00:00:01 GMT;';
  }

