# RoboType 



**About RoboType :**

- The world's first Library/Module to implement interactive text inside your android app.

- It stimulates text typing.

- Easy to Implement.

- Compitable with all android versions.

- Light-Weight.

- Open-Source.

**How to implement :**

1. Download the "robo" class.
2. Add it to your package.
3. Inside your activity add this method :


        public static void Robo(String x){
        YourTextView.append(x);
        }
    
4. In your onCreate or wherever you want add :
   
        robo.update(message, fullClassName, speed);

5. Don't forget to import the class "robo".


**Update function explained :**

        update(message, className, speed);
        
This is the function used to apply the module.
use it in anywhere you like (button listener, onCreate...etc).

 Parameters : 
 - message : string to be displayed.
 - speed : the speed of displaying text in milliseconds.
 - classname : the activity where you will display this text (i.e. com.package.class)


**Algorithm  :**

 - it get the text from user.
 - split the string to single characters.
 - using reflection to access the other class.
 - invoke the method that set new character each certain time.
 - use a handler to control the process.



 
 
       

