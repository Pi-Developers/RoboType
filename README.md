# RoboType 



**About RoboType :**

- The world's first Library/Module to implement interactive text inside your android app.

- It stimulates text typing.

- Easy to Implement.

- Compitable with all android versions.

- Light-Weight.

- Open-Source.

**How to implement :**

1. Download RoboType.jar
2. Implement the RoboType.jar or import the lib project
    
3. Inside your activity add this method :


        public static void Robo(String x){
        YourTextView.append(x);
        }
    
4. In your onCreate or wherever you want add :
   
        RoboType.update(message, fullClassName, speed);
        
Note : We recommended to use 100 speed
Note : In fullClassName you need to write like this com.example.MainActivity

5. Don't forget to import the class "RoboType".


**Update function explained :**

        update(message, className, speed);
        
This is the function used to apply the module.
use it in anywhere you like (button listener, onCreate...etc).

 *Parameters :*
 1. message : string to be displayed.
 2. speed : the speed of displaying text in milliseconds.
 3. classname : the activity where you will display this text (i.e. com.package.class)


**Algorithm  :**

 - it get the text from user.
 - split the string to single characters.
 - using reflection to access the other class.
 - invoke the method that set new character each certain time.
 - use a handler to control the process.


**Changelog :**

-*v1.0 :*

 >>1. added jar.
 >>2. added project source.
 >>3. use reflection to invoke.
 >>4. initial release.
 
 
**Notes :**
 
 - This is still in early stage of development.
 - a demo app for this library is available on playstore.
 - a youtube video too.
 
       
