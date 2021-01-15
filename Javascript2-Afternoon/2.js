class Student
{
    constructor(fname,lname,email,roll,dob,gen,course,occ)
    {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.roll = roll;
        this.dob = dob;
        this.gen = gen;
        this.course = course;
        this.occ = occ;
    }

    calcAge()
    {
        var diff_ms = Date.now() - this.dob.getTime();
        var age_dt = new Date(diff_ms); 
        return Math.abs(age_dt.getUTCFullYear() - 1970);
    }
}
var objectArray = [];
var iter = 0;
var onclicking = ()=>
{
    console.log("Information noted");
    var obj = new Student(
        document.getElementById("1").value,
        document.getElementById("2").value,
        document.getElementById("3").value,
        document.getElementById("4").value,
        document.getElementById("5").value,
        document.getElementById("gender").value,
        document.getElementById("6").value,
        document.getElementById("7").value,
    );
    
    objectArray[iter++] = obj;
    console.log(objectArray[iter-1]);
    document.getElementById("end").innerHTML = "Thank you so much!";
    return false;
}

var getDetails = ()=>
{
    let temp = document.getElementById("8").value;
    var studentExists = false;
    objectArray.forEach(val);
    function val(item,index)
    {
        if(temp == item.roll)
        {
            studentExists = true;
            var str = "Name: "+item.fname+" "+
                item.lname+"<br> Email: "+item.email+"<br> Roll Number: "+item.roll+
                "<br> Date of birth: "+item.dob+"<br> Gender: "+item.gen
                +"<br> Course: "+item.course+"<br> Age: "+item.calcAge();
            if(item.occ != "")
            {
                str += "<br> Occupation: "+item.occ;
            }
            document.getElementById("result").innerHTML = str;
            console.log("Data printed!");
        }
    }
    if(!studentExists)
    {
        console.log("This roll number does'nt exists");
        document.getElementById("result").innerHTML = "This roll number does'nt exists";
    }
}