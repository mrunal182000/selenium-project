function regV()
{
    var username = document.getElementById("name1").value;
      var username1 = document.getElementById("name1").value;
    var password = document.getElementById("pass1").value;
    var email = document.getElementById("email1").value;
    var mobile=document.getElementById("mob").value;

   var msg = "";
    var flag = false;
var patt=/^([a-zA-Z]+)$/;

     if(username.trim() == "")
    {
       msg+= "First Name is Empty !! \n"
       flag=true;
    }
 else if(!patt.test(username))
    {
        msg+="Enter Characters only for First Name\n";
        flag=true;
    }
    if(username1.trim() == "")
   {
      msg+= "Last Name is Empty !! \n"
      flag=true;
   }
 else if(!patt.test(username1))
    {
        msg+="Enter Characters only Last name\n";
        flag=true;
    }
    if(password.trim() == "")
    {
        msg+="Password is Empty !! \n";
        flag=true;
    }

    if(email.trim() == "")
    {
        msg+="Please Enter an Email-id \n";
        flag=true;
    }
    if(mobile.trim() == "")
  {
       msg+="Please Enter mobile number \n";
      flag=true;
  }



    if(flag)
    {
        alert(msg);
        return false;
    }
return true;
   }

//login.js

function loginV()
{
    var username = document.getElementById("un").value;
    var password = document.getElementById("p").value;
    var email = document.getElementById("email").value;
    var msg = "";
    var flag = false;
    var patt=/^([a-zA-Z]+)$/;

    if(username.trim() == "")
    {
       msg+= "First Name is Empty !!\n "
       flag=true;
    }
    else if(!patt.test(username))
    {
        msg+="Enter Characters only for first name\n";
        flag=true;
    }
    if(email.trim() == "")
    {
        msg+="Please Enter an Email-id \n";
        flag=true;
    }
    if(password.trim() == "")
    {
        msg+="Password is Empty !!\n";
          flag=true;
    }

    if(flag)
    {
        alert(msg);
        return false;
    }
return true;
}
