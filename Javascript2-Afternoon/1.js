class input {
    constructor(param) {
        this.input = param;
    }
    calculateLength() {
        console.log("length is "+this.input.length);
        return this.input.length;
    };
    getUpperCase() {
        console.log("String in Uppercase is "+this.input.toUpperCase());
        return this.input.toUpperCase();
    };
    getLowerCase() {
        console.log("String in Lowercase is "+this.input.toLowerCase());
        return this.input.toLowerCase();
    };
    getConsonantsVowels()
    {
        var c = "";
        var v = "";
        var bool = true;
        for(var i=0;i<this.input.length;i++)
        {
            if(this.input.charAt(i)=='a' || this.input.charAt(i)=='e' || this.input.charAt(i)=='i' || this.input.charAt(i)=='o' || this.input.charAt(i)=='u' || this.input.charAt(i)=='A' || this.input.charAt(i)=='E' || this.input.charAt(i)=='I' || this.input.charAt(i)=='O' || this.input.charAt(i)=='U')
            {
                v += this.input.charAt(i);
            }
            else if(this.input.charAt(i)=='0' || this.input.charAt(i)=='1' || this.input.charAt(i)=='2' || this.input.charAt(i)=='3' || this.input.charAt(i)=='4' || this.input.charAt(i)=='5' || this.input.charAt(i)=='6' || this.input.charAt(i)=='7' || this.input.charAt(i)=='8' || this.input.charAt(i)=='9')
            {
                bool = false;
            }
            else if((this.input.charAt(i)>'a' && this.input.charAt(i)<='z') || (this.input.charAt(i)>'A' && this.input.charAt(i)<='Z'))
            {
                c += this.input.charAt(i);
            }
        }
        document.getElementById("coOp").innerHTML = c;
        document.getElementById("voOp").innerHTML = v;
        console.log("Constants and vowels in the string are "+c+" and "+v+" respectively");
        if(!bool)
        {
            console.log("Numbers is there in the string");
            document.getElementById("ErrOp").innerHTML = "Number Present in the String";
        }
    }
}

function callFunction() {
    var inputValue = document.getElementById("inputTxt").value;
    let inputObject = new input(inputValue);
    document.getElementById("lengthOp").innerHTML = inputObject.calculateLength();
    document.getElementById("ucOp").innerHTML = inputObject.getUpperCase();
    document.getElementById("lcOp").innerHTML = inputObject.getLowerCase();
    inputObject.getConsonantsVowels();
}