## Random String Generator
1. Run command: `gradle clean comppileJava jar` to compile and build the jar.
2. Run command `gradle run` to run the test java file. 


## How to Use
1. Create new instance of class `RandomStringGenerator`.
2. Example:
```
final RandomStringGenerator randomStringGenerator = new RandomStringGenerator();
final String randomString = randomStringGenerator.randomString();
//Generate random string of 20 characters:
final String randomString = randomStringGenerator.randomString(20); 
```  

    

Use the random string generator to generator easy and random strings. Generated strings are URL safe.  
Just user char from "A-Z", "a-z" and "0-9". Add simple check to prevent generation of the same consecutive characters.  

## Feel free to modify the program!  
