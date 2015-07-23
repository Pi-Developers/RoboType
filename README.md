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

       

