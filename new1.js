function setcookie(){
    const email=document.getElementById('exampleInputEmail1').value;
    const password=document.getElementById('exampleInputPassword1').value;

const obj={
    "email":email,
    "password":password,
}
const obj2={
    key:obj2,
}
document.cookie=JSON.stringify(obj2);

}
console.log(document.cookie.email);
